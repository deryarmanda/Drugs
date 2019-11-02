package com.dercoding.antibotic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListDrugsAdapter extends RecyclerView.Adapter<ListDrugsAdapter.ListViewHolder> {

    //click callback implementasi onclickcallback 1st
    private OnClickCallBack onClickCallBack;

    public void setOnClickCallBack(OnClickCallBack onClickCallBack) {
        this.onClickCallBack = onClickCallBack;
    }

    //implementasi onClick
    private ArrayList<Drugs> listDrugs;

    public ListDrugsAdapter(ArrayList<Drugs> list){
         this.listDrugs = list;
     }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
         View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_drugs,viewGroup, false);
         return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
         Drugs drugs = listDrugs.get(position);
         Glide.with(holder.itemView.getContext())
                 .load(drugs.getPhoto())
                 .apply(new RequestOptions().override(55,55))
                 .into(holder.imgPhoto);
         //TEXT NAME
         holder.tvName.setText(drugs.getName());
         holder.tvDetail.setText(drugs.getDetail());


         //Click callback CLICK LIST 2rd
         holder.itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 onClickCallBack.onItemClicked(listDrugs.get(holder.getAdapterPosition()));
             }
         });

    }

    @Override
    public int getItemCount() {
        return listDrugs.size();
    }
    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_drugs);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }

    }

    //click callback class item click callback 1st
    public interface OnClickCallBack    {
        void onItemClicked(Drugs data);
    }

}
