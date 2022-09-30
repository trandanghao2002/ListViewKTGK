package com.example.listviewktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int image[]={R.drawable.ip14,R.drawable.iphone,R.drawable.oppo,R.drawable.redmi,R.drawable.samsung};
    String name[] ={"Điện Thoại IPhone 14","Điện Thoại IPhone","Điện Thoại Oppo","Điện Thoại Redmi","Điện hoại Samsung"};
    //khai báo listview
    ArrayList<Phone> mylist;
    MyArrayAdapter myadapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceseState) {
        super.onCreate(savedInstanceseState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        mylist = new ArrayList<>();
        for (int i =0; i<name.length; i++)
        {
            mylist.add(new Phone(image[i],name[i]));
        }
        myadapter = new MyArrayAdapter(MainActivity.this,R.layout.layout_item, mylist);
        lv.setAdapter(myadapter);
        //xử lý
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent myintent = new Intent(MainActivity.this, SubActivity.class);
                myintent.putExtra("name",name[i]);
                startActivity(myintent);
            }
        });

    }
}