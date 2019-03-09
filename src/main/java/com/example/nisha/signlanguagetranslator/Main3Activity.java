package com.example.nisha.signlanguagetranslator;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private static int SPLASH_TIME = 4000;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );

        new Handler(  ).postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent h = new Intent( Main3Activity.this,MainActivity.class );
                startActivity( h );
                finish();
            }
        },SPLASH_TIME );
        RelativeLayout rt = findViewById( R.id.layout );
        AnimationDrawable at = (AnimationDrawable) rt.getBackground();
        at.setEnterFadeDuration( 2000 );
        at.setExitFadeDuration( 4000 );


        textView = findViewById( R.id.textsplash );
        imageView = findViewById( R.id.imagesplash );
        textView.setTranslationY( 2000f );
        imageView.setTranslationY( -2000f );
        imageView.animate().translationYBy( 2000f ).setDuration( 2000 );
        textView.animate().translationYBy( -2000f ).setDuration( 2000 );



    }
}
