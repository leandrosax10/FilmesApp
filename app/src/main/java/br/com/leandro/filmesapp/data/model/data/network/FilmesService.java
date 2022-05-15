package br.com.leandro.filmesapp.data.model.data.network;

import br.com.leandro.filmesapp.data.model.data.network.response.FilmesResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FilmesService {

    @GET("movie/now_playing")
    Call<FilmesResult> obterFilmesEmCartaz(@Query("api_key") String chaveApi);
}
