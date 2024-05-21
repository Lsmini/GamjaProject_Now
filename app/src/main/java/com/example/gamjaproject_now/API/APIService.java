package com.example.gamjaproject_now.API;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {
    @GET("application/api/contents")
    Call<API[]> getData(
            @Query("tableName") String tableName,
            @Query("page") int page,
            @Query("pagingUnit") int pagingUnit
    );
    @GET("application/api/contentsCount")
    Call<CountAPI[]> getCount(
            @Query("tableName") String tableName
    );
}
