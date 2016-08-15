package com.example.jamesrondina.retrofit;

import com.example.jamesrondina.retrofit.models.ArticleList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jamesrondina on 8/13/16.
 */
public interface NYTimesService {


    @GET("/topstories/v2/{section}.json")
    Call<ArticleList> getResult(@Path("section") String section);





}