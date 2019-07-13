package com.responsi.mvp.Service;

import com.google.gson.annotations.SerializedName;
import com.responsi.mvp.model.People;

import java.util.List;

class PeopleResponse {

    @SerializedName("results")
    private List<People> peopleList;

    public List<People> getPeopleList() {
        return peopleList;
    }
}
