package br.com.leandro.filmesapp.data.model;

import java.io.Serializable;

public class Filme implements Serializable {

    private final String titulo;
    private final String caminhoPoster;

    private final String dataLancamento;
    private final String idiomaFilme;
    private final String overview;

    public Filme(String titulo, String caminhoPoster, String dataLancamento, String idiomaFilme, String overview) {
        this.titulo = titulo;
        this.caminhoPoster = caminhoPoster;
        this.dataLancamento = dataLancamento;
        this.idiomaFilme = idiomaFilme;
        this.overview = overview;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCaminhoPoster() {
        return caminhoPoster;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getIdiomaFilme() {
        return idiomaFilme;
    }

    public String getOverview() {
        return overview;
    }

}


