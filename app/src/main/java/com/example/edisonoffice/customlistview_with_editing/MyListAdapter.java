package com.example.edisonoffice.customlistview_with_editing;

/**
 * Created by edison office on 7/11/2018.
 */
import android.app.Activity;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {

    private final Activity context;
    //private final String[] maintitle;
   // private final String[] subtitle;
    private final Integer[] imgid;
    private ArrayList<String> maintitle;
    private ArrayList<String> subtitle;
    static LayoutInflater layoutInflater;
    public MyListAdapter(Activity context, ArrayList maintitle, ArrayList subtitle, Integer[] imgid) {
    //    super(context, R.layout.mylist, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return maintitle.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, View child, ViewGroup parent) {



        final Holder mHolder;
        final View rowView;


        mHolder = new Holder();

        rowView = layoutInflater.inflate(R.layout.mylist, null);



       // LayoutInflater inflater=context.getLayoutInflater();
       // View rowView=inflater.inflate(R.layout.mylist, null,true);

        mHolder. num = (TextView) rowView.findViewById(R.id.title);
        mHolder. devicename = (TextView) rowView.findViewById(R.id.subtitle);
      //  mHolder. im = (ImageView) rowView.findViewById(R.id.im);
        final ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        mHolder.num.setText(maintitle.get(position));
        mHolder.devicename.setText(subtitle.get(position));
      //  imageView.setImageResource(imgid[position]);
      //  subtitleText.setText(subtitle[position]);

      /*  mHolder.num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maintitle.get(position);
                maintitle.get(position);
                maintitle.set(position,"canged");
                mHolder.num.setText( maintitle.set(position,"canged"));
                MainActivity n = new MainActivity();
                n.aa();
            }
        });
*/


        return rowView;

    };
    public class Holder {
        TextView num;
        TextView devicename;
        ImageView im;

    }
}