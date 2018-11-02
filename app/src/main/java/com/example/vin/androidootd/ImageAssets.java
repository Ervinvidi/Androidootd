package com.example.vin.androidootd;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {
    private  static List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);
        add(R.drawable.body6);

    }};

    //Variabel ini adalah pengelompokan untuk kaki , dan menyimpan data
    private  static  List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
        add(R.drawable.legs4);


    }};

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel body
    public static List<Integer> getBodies(){
        return bodies;
    }

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel leg
    public static List<Integer> getLegs(){
        return legs;
    }


}

