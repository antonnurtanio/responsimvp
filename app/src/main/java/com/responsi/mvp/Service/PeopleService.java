package com.responsi.mvp.Service;

import android.database.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;

interface PeopleService {

    @GET("people")
    Observable<PeopleResponse> fetchPeople(
            @Query("results") int page,
            @Query("nat") String nat
    );
}
