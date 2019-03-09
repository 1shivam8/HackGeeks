package com.example.nisha.signlanguagetranslator;

import android.content.Intent;
import android.content.res.Resources;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button button1;
    // Array of strings storing country names
    ArrayList<String> countries = new ArrayList<String>();
    ArrayList<Integer> flags = new ArrayList<Integer>();
    ArrayList<String> currency = new ArrayList<String>();
    // Array of integers points to images stored in /res/drawable-ldpi/
    // Array of strings to store currencies

    /** Called when the activity is first created. */
 private Button button;
 private EditText editText;
 Button imageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button=findViewById( R.id.button );
       imageView = findViewById( R.id.imagebutton );
       imageView.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent( RecognizerIntent.ACTION_RECOGNIZE_SPEECH );
               intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM  );
               intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault() );
               if(intent.resolveActivity( getPackageManager() )!= null){
                   startActivityForResult( intent,10 );
               }
           }
       } );
       button1 = findViewById( R.id.nextpage );
       button1.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent( MainActivity.this,Main2Activity.class );
               startActivity( i );
           }
       } );
       editText=findViewById( R.id.editText );
       button.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               countries.clear();
               flags.clear();
               currency.clear();
               String Rohit = editText.getText().toString();

               Resources res=getResources();

               for(int i = 0 ; i<Rohit.length(); i++){
                   currency.add( Rohit.charAt( i )+"");
                   countries.add(Rohit.charAt( i )+"");
                   if((Rohit.charAt( i )+"").equals( " " )){
                       flags.add( R.drawable.blank_sign );
                   }else if((Rohit.charAt(i )+"").equals( "1" )){
                       flags.add( R.drawable.one_sign );
                   }else if((Rohit.charAt(i )+"").equals( "2" )){
                       flags.add( R.drawable.two_sign );
                   }else if((Rohit.charAt(i )+"").equals( "3" )){
                       flags.add( R.drawable.three_sign );
                   }else if((Rohit.charAt(i )+"").equals( "4" )){
                       flags.add( R.drawable.four_sign );
                   }else if((Rohit.charAt(i )+"").equals( "5" )){
                       flags.add( R.drawable.five_sign );
                   }else if((Rohit.charAt(i )+"").equals( "6" )){
                       flags.add( R.drawable.six_sign );
                   }else if((Rohit.charAt(i )+"").equals( "7" )){
                       flags.add( R.drawable.seven_sign );
                   }else if((Rohit.charAt(i )+"").equals( "8" )){
                       flags.add( R.drawable.eight_sign );
                   }else if((Rohit.charAt(i )+"").equals( "9" )){
                       flags.add( R.drawable.nine_sign );
                   }else if((Rohit.charAt(i )+"").equals( "0" )){
                       flags.add( R.drawable.zero_sign );
                   }
                   else {
                       String qwerty = Rohit.charAt( i ) + "_sign";
                       flags.add( res.getIdentifier( qwerty, "drawable", getPackageName() ) );
                   }
               }


               List<HashMap<String,String>> aList = new ArrayList<>();

               for(int i=0;i<Rohit.length();i++){

                   HashMap<String, String> hm = new HashMap<String,String>();
                   hm.put("txt", "Sign for " + countries.get( i ).toUpperCase());
                   hm.put("cur","Sign for " + currency.get( i ).toLowerCase());
                   hm.put("flag", Integer.toString(flags.get( i )));
                   aList.add(hm);
               }

               // Keys used in Hashmap

               String[] from = { "flag","txt","cur" };

               // Ids of views in listview_layout
               int[] to = { R.id.flag,R.id.txt,R.id.cur};

               // Instantiating an adapter to store each items
               // R.layout.listview_layout defines the layout of each item
               SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.list_row, from, to);

               // Getting a reference to listview of main.xml layout file
               ListView listView = ( ListView ) findViewById(R.id.list);

               // Setting the adapter to the listView
               listView.setAdapter(adapter);
           }
       } );
        // Each row in the list stores country name, currency and flag

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult( requestCode, resultCode, data );

        switch (requestCode){
            case 10:
                if (resultCode == RESULT_OK && data != null){
                    ArrayList<String> result = data.getStringArrayListExtra( RecognizerIntent.EXTRA_RESULTS );
                    String abc = result.get( 0 );
                    editText.setText( abc +"" );
                }
                break;
        }

    }
}


