package ui.listaFilmes;

import java.util.List;

import br.com.leandro.filmesapp.data.model.Filme;

public interface ListaFilmesContrato {

    interface ListaFilmesView {

        void mostraFilmes(List<Filme> filmes);

        void mostraErro();

    }

    interface ListaFilmesPresenter {

        void obtemFilmes();

        void destruirView();
    }
}
