package com.responsi.mvp.presenter;


import android.content.Context;

import com.responsi.mvp.model.People;

public class PeoplePresenter {
    private People people;
    private Context context;


    public PeoplePresenter(People people, Context context) {
        this.people = people;
        this.context = context;
    }

    public String getFullName() {
        people.fullName =
                people.name.title + "." + people.name.first + "." + people.name.last;
        return  people.fullName;
    }

    public String getCell() {
        return people.cell;
    }

    public String getMail() {
        return  people.mail;
    }

    public String getPictureProfile() {
        return people.picture.medium;
    }
}
