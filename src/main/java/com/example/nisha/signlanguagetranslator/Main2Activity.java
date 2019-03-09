package com.example.nisha.signlanguagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Main2Activity extends AppCompatActivity {
    GridView gridView;
    String [] values1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
    int [] images = {R.drawable.a_sign,R.drawable.b_sign,R.drawable.c_sign,R.drawable.d_sign,R.drawable.e_sign,R.drawable.f_sign,

            R.drawable.g_sign,R.drawable.h_sign,R.drawable.i_sign,R.drawable.j_sign,R.drawable.k_sign,R.drawable.l_sign,R.drawable.m_sign,R.drawable.n_sign,
    R.drawable.o_sign,R.drawable.p_sign,R.drawable.q_sign,R.drawable.s_sign,R.drawable.t_sign,R.drawable.u_sign,
    R.drawable.v_sign,R.drawable.w_sign,R.drawable.x_sign,R.drawable.y_sign,R.drawable.z_sign,R.drawable.zero_sign,
    R.drawable.one_sign,R.drawable.two_sign,R.drawable.three_sign,R.drawable.four_sign,R.drawable.five_sign,R.drawable.six_sign,
    R.drawable.seven_sign,R.drawable.eight_sign,R.drawable.nine_sign};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        gridView = findViewById( R.id.gridview );

        Adapter aa = new Adapter( this, values1,images);
        gridView.setAdapter( aa );
    }
}
