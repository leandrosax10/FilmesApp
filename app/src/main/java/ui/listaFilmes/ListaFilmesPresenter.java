package ui.listaFilmes;

import java.util.List;

import br.com.leandro.filmesapp.data.model.Filme;
import br.com.leandro.filmesapp.data.model.data.mapper.FilmeMapper;
import br.com.leandro.filmesapp.data.model.data.network.ApiService;
import br.com.leandro.filmesapp.data.model.data.network.response.FilmesResult;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaFilmesPresenter implements ListaFilmesContrato.ListaFilmesPresenter {

    private ListaFilmesContrato.ListaFilmesView view;

    public ListaFilmesPresenter(ListaFilmesContrato.ListaFilmesView view){
        this.view = view;
    }

    @Override
    public void obtemFilmes() {
        ApiService.getInstance()
                .obterFilmesEmCartaz("f321a808e68611f41312aa8408531476")
                .enqueue(new Callback<FilmesResult>() {
                    @Override
                    public void onResponse(Call<FilmesResult> call, Response<FilmesResult> response) {
                        if (response.isSuccessful()) {
                            final List<Filme> listaFilmes = FilmeMapper
                                    .deResponseParaDominio(response.body().getResultadoFilmes());
                            view.mostraFilmes(listaFilmes);
                        } else {
                            view.mostraErro();
                        }
                    }

                    @Override
                    public void onFailure(Call<FilmesResult> call, Throwable t) {
                        view.mostraErro();

                    }
                });
    }

    @Override
    public void destruirView() {
        this.view = null;
    }
}
