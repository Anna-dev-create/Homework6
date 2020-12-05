package com.example.applicationtest6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RvAdapter2 extends RecyclerView.Adapter<RvAdapter2.RvViewHolder> {

    private List<RvData> list;

    public void setList(List<RvData> list) {
        this.list = list;
    }

   /* public RvAdapter2(List<RvData> list){
        this.list = list;
    }*/

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        RvViewHolder rvViewHolder =new RvViewHolder(itemView);
        return rvViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        holder.tvRv.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class RvViewHolder extends RecyclerView.ViewHolder{

        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRv=itemView.findViewById(R.id.tv_rv);
        }
        public TextView tvRv;
    }


}
