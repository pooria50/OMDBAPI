package com.example.adamfazaie.omdbapi.SearchFilms;

import com.example.adamfazaie.omdbapi.SearchFilms.Pojo.FilmSearcher;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SearchMoviesWebServices {
    ///&apikey=442584c6"
    @GET("/?t={}&apikey=442584c6")
    Call<FilmSearcher> filmsearcher(@Query("t") String t);

}
