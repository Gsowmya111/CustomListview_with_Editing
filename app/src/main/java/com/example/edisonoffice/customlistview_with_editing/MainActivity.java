package com.example.edisonoffice.customlistview_with_editing;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button button;

    String[] maintitle ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
    };

    ArrayList a = new ArrayList();
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.clear();
                c.add(a);
                Toast.makeText(getApplicationContext(),""+c,Toast.LENGTH_LONG).show();

            }
        });




          //  a.clear();
      //  b.clear();
        a.add("a");a.add("b");a.add("c");a.add("s");
        b.add("1");b.add("2");b.add("3");b.add("4");




        final MyListAdapter adapter=new MyListAdapter(this, a, b,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                // TODO Auto-generated method stub

           //   ((TextView)view.findViewById(R.id.title)).setText("You clicked yes button!");
               // adapter.notifyDataSetChanged();


            a.get(position);
              a.set(position,"canged");
             //   a.add(position,"changes");
                list.setAdapter(adapter);
                Toast.makeText(getApplicationContext(),""+a,Toast.LENGTH_LONG).show();




/*

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getApplicationContext());
                alertDialogBuilder.setMessage("Are you sure");

                        alertDialogBuilder.setPositiveButton("yes",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0, int arg1) {
                                        Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();

                                    }
                                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
*/



               /* if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }*/
              //  ((TextView)view.findViewById(R.id.title)).setText("done!");

              /* for(int i=0;i<=imgid.length;i++){
                    if(position==i){
                        ((TextView)view.findViewById(R.id.title)).setText("done!");
                    }

                }*/


            }
        });



    }


    public void aa(){
        final MyListAdapter adapter=new MyListAdapter(this, a, b,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}