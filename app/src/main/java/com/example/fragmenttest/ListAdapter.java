package com.example.fragmenttest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 易辰 on 2017/12/15.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    //連結ListLayout的元件並作處理，各個ListLayout的控制皆在此完成
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.title.length;
    }

    //初始化及載入元件
    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mItemText;
        private ImageView mItemImage;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = itemView.findViewById(R.id.itemText);
            mItemImage = itemView.findViewById(R.id.itemImage);
            itemView.setOnClickListener(this);

        }
        public void bindView(int position){
            mItemText.setText(OurData.title[position]);
            mItemImage.setImageResource(OurData.picturePath[position]);
        }
        public void onClick(View view){

        }
    }
}
