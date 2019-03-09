package com.example.nisha.signlanguagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ArrayList<String> countries = new ArrayList<String>();
    ArrayList<Integer> flags = new ArrayList<Integer>();
    ArrayList<String> currency = new ArrayList<String>();

    //    GridView gridView;
//    String [] values1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
//    int [] images = {R.drawable.a_sign,R.drawable.b_sign,R.drawable.c_sign,R.drawable.d_sign,R.drawable.e_sign,R.drawable.f_sign,
//
//            R.drawable.g_sign,R.drawable.h_sign,R.drawable.i_sign,R.drawable.j_sign,R.drawable.k_sign,R.drawable.l_sign,R.drawable.m_sign,R.drawable.n_sign,
//    R.drawable.o_sign,R.drawable.p_sign,R.drawable.q_sign,R.drawable.s_sign,R.drawable.t_sign,R.drawable.u_sign,
//    R.drawable.v_sign,R.drawable.w_sign,R.drawable.x_sign,R.drawable.y_sign,R.drawable.z_sign,R.drawable.zero_sign,
//    R.drawable.one_sign,R.drawable.two_sign,R.drawable.three_sign,R.drawable.four_sign,R.drawable.five_sign,R.drawable.six_sign,
//    R.drawable.seven_sign,R.drawable.eight_sign,R.drawable.nine_sign};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );

        countries.add( "a");
        countries.add( "b");
        countries.add( "c");
        countries.add( "d");
        countries.add( "e");
        countries.add( "f");
        countries.add( "g");
        countries.add( "h");
        countries.add( "i");
        countries.add( "j");
        countries.add( "k");
        countries.add( "l");
        countries.add( "m");
        countries.add( "n");
        countries.add( "o");
        countries.add( "p");
        countries.add( "q");
        countries.add( "r");
        countries.add( "s");
        countries.add( "t");
        countries.add( "u");
        countries.add( "v");
        countries.add( "w");
        countries.add( "x");
        countries.add( "y");
        countries.add( "z");
        countries.add( "0");
        countries.add( "1");
        countries.add( "2");
        countries.add( "3");
        countries.add( "4");
        countries.add( "5");
        countries.add( "6");
        countries.add( "7");
        countries.add( "8");
        countries.add( "9");


        currency.add( "a");
        currency.add( "b");
        currency.add( "c");
        currency.add( "d");
        currency.add( "e");
        currency.add( "f");
        currency.add( "g");
        currency.add( "h");
        currency.add( "i");
        currency.add( "j");
        currency.add( "k");
        currency.add( "l");
        currency.add( "m");
        currency.add( "n");
        currency.add( "o");
        currency.add( "p");
        currency.add( "q");
        currency.add( "r");
        currency.add( "s");
        currency.add( "t");
        currency.add( "u");
        currency.add( "v");
        currency.add( "w");
        currency.add( "x");
        currency.add( "y");
        currency.add( "z");
        currency.add( "0");
        currency.add( "1");
        currency.add( "2");
        currency.add( "3");
        currency.add( "4");
        currency.add( "5");
        currency.add( "6");
        currency.add( "7");
        currency.add( "8");
        currency.add( "9");

        flags.add( R.drawable.a_sign );
        flags.add( R.drawable.b_sign );
        flags.add( R.drawable.c_sign );
        flags.add( R.drawable.d_sign );
        flags.add( R.drawable.e_sign );
        flags.add( R.drawable.f_sign );
        flags.add( R.drawable.g_sign );
        flags.add( R.drawable.h_sign );
        flags.add( R.drawable.i_sign );
        flags.add( R.drawable.j_sign );
        flags.add( R.drawable.k_sign );
        flags.add( R.drawable.l_sign );
        flags.add( R.drawable.m_sign );
        flags.add( R.drawable.n_sign );
        flags.add( R.drawable.o_sign );
        flags.add( R.drawable.p_sign );
        flags.add( R.drawable.q_sign );
        flags.add( R.drawable.r_sign );
        flags.add( R.drawable.s_sign );
        flags.add( R.drawable.t_sign );
        flags.add( R.drawable.u_sign );
        flags.add( R.drawable.v_sign );
        flags.add( R.drawable.w_sign );
        flags.add( R.drawable.x_sign );
        flags.add( R.drawable.y_sign );
        flags.add( R.drawable.z_sign );
        flags.add( R.drawable.zero_sign );
        flags.add( R.drawable.one_sign );
        flags.add( R.drawable.two_sign );
        flags.add( R.drawable.three_sign );
        flags.add( R.drawable.four_sign );
        flags.add( R.drawable.five_sign );
        flags.add( R.drawable.six_sign );
        flags.add( R.drawable.seven_sign );
        flags.add( R.drawable.eight_sign );
        flags.add( R.drawable.nine_sign );

        List<HashMap<String,String>> aList = new ArrayList<>();

        for(int i=0;i<36;i++){

            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "Sign for " + countries.get( i ).toUpperCase());
            hm.put("cur","Sign for " + currency.get( i ).toLowerCase());
            hm.put("flag", Integer.toString(flags.get( i )));
            aList.add(hm);
        }

        String[] from = { "flag","txt","cur" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.txt,R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.list_row, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.listview2);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);
//        gridView = findViewById( R.id.gridview );

//        Adapter aa = new Adapter( this, values1,images);
//        gridView.setAdapter( aa );
    }
}
