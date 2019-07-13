package com.responsi.mvp.Service;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class PeopleFactory {

    private final static String BASE_URL = "https://private-0e6b9-ganjarwidiatmansyah.apiary-mock.com/";

    public static PeopleService create() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(PeopleService.class);
    }
}
