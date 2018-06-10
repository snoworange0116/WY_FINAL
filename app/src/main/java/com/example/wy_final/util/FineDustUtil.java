package com.example.wy_final.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FineDustUtil {

    private FineDustApi mGetApi;

    public FineDustUtil(){
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(FineDustApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public FineDustApi getApi() {
        return mGetApi;
    }
}
