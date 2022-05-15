package br.com.leandro.filmesapp.data.model.data.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.leandro.filmesapp.data.model.Filme;
import br.com.leandro.filmesapp.data.model.data.network.response.FilmeResponse;

public class FilmeMapper {

    public static List<Filme> deResponseParaDominio(List<FilmeResponse> listaFilmeResponse) {
        List<Filme> listaFilmes = new ArrayList<>();

        for (FilmeResponse filmeResponse : listaFilmeResponse) {
            final Filme filme = new Filme(filmeResponse.getTituloOriginal(),
                    filmeResponse.getCaminhoPoster(), filmeResponse.getDataLancamento(),
                    filmeResponse.getIdiomaFilme(), filmeResponse.getOverview());
            listaFilmes.add(filme);
        }
        return listaFilmes;
    }
}
