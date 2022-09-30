package com.example.listviewktgk;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<Phone> {
    Activity context;
    int IdLayout;
    ArrayList<Phone> mylist;
    //

    public MyArrayAdapter(Activity context, int idLayout, ArrayList<Phone> mylist) {
        super(context,idLayout,mylist);
        this.context = context;
        IdLayout = idLayout;
        this.mylist = mylist;
    }
    //gọi hamgf getview để tiến hành sắp xếp dữ liệu

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myflactor = context.getLayoutInflater();

        convertView= myflactor.inflate(IdLayout, null);
        Phone myphone = mylist.get(position);
        ImageView img_phone = convertView.findViewById(R.id.img_phone);
        img_phone.setImageResource(myphone.getImage());
        TextView txt_phone = convertView.findViewById(R.id.txt_phone);
        txt_phone.setText(myphone.getName());
        return convertView;
    }
}
