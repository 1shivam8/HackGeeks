package com.example.nisha.signlanguagetranslator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    Context context;
    private final String[] values;
    private final int[] images;
    View view;
    LayoutInflater layoutInflater;

    public Adapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view1, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        if(view1 == null){
            view = new View( context );
            view = layoutInflater.inflate( R.layout.ngu,null );
            ImageView imageView=  view.findViewById( R.id.imageview );
            TextView textView = view.findViewById( R.id.textview1 );
            imageView.setImageResource( images[i] );
            textView.setText( values[i] );
        }
        return view;
    }
}
