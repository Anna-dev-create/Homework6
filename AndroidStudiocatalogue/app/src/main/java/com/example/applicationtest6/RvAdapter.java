package com.example.applicationtest6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {
    private List<RvData> list ;

    public abstract static class Adapter<Rvadpter extends RecyclerView.ViewHolder>{
        
    }

    public RvAdapter(List<RvData> List){
        this.list=list;
    }

    class RvViewHolder extends RecyclerView.ViewHolder{
        public RvViewHolder(@NonNull View itemview){
            super(itemview);
            tvRv=itemView.findViewById(R.id.tv_rv);
        }
        public TextView tvRv;
    }



    @NonNull
    @Override
    public RvAdapter.RvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RvViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        holder.tvRv.setText(list.get(position).getName());
    }


    /*@Override
    public void onBindViewHolder(ViewGroup parent,int viewType){
        return new RvViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv,parent,attachToRoot false));*/


    @Override
    public int getItemCount() {
        return list.size();
    }
}
