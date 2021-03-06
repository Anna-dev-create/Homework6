package com.example.applicationtest6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class VpAdapter<view, object, Textview> extends PagerAdapter {
    private List<Textview> list;

    public VpAdapter(List<TextView> list) {
        this.list = (List<Textview>) list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView((View) list.get(position));
        return list.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return view ==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container,int position,@NonNull Object object){
        container.removeView((View) list.get(position));
    }






}
