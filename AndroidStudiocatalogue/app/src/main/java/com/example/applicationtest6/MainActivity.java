package com.example.applicationtest6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ViewPager viewPager;
    private ArrayList list= new ArrayList<View>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rv_demo);
        viewPager=findViewById(R.id.vp_demo);
        list.add(LayoutInflater.from(this).inflate(R.layout.layout1,null,false));
        list.add(LayoutInflater.from(this).inflate(R.layout.layout2,null,false));
        list.add(LayoutInflater.from(this).inflate(R.layout.activity_main,null,false));

        RvAdapter2 rvAdapter2 = new RvAdapter2();
        rvAdapter2.setList(list);



    }
}