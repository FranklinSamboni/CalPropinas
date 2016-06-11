package com.projects.frank.calpropinas;

import android.app.Application;

/**
 * Created by Frank on 3/06/2016.
 */
public class TipCalcClass extends Application {

    private final static  String ABOUT_URL = "https://about.me/";

    public  String getAboutUrl() {
        return ABOUT_URL;
    }

}
