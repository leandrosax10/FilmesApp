package br.com.leandro.filmesapp.data.model.data.network.response;

import com.squareup.moshi.Json;

public class FilmeResponse {

    @Json(name = "poster_path")
    private final String caminhoPoster;

    @Json(name = "original_title")
    private final String tituloOriginal;

    @Json(name = "original_language")
    private final String idiomaFilme;

    @Json(name = "release_date")
    private final String dataLancamento;

    @Json(name = "overview")
    private final String overview;


    public FilmeResponse(String caminhoPoster, String tituloOriginal, String idiomaFilme, String dataLancamento, String overview) {
        this.caminhoPoster = caminhoPoster;
        this.tituloOriginal = tituloOriginal;
        this.idiomaFilme = idiomaFilme;
        this.dataLancamento = dataLancamento;
        this.overview = overview;
    }

    public String getCaminhoPoster() {
        return caminhoPoster;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public String getIdiomaFilme() {
        return idiomaFilme;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }
    public String getOverview() {
        return overview;
    }
}
