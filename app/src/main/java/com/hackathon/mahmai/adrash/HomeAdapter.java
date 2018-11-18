package com.hackathon.mahmai.adrash;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.HomeView> {
    private LayoutInflater inflater;
    List<Goods> mData;
    public HomeAdapter(Context context, List<Goods> data) {
        inflater = LayoutInflater.from(context);
        this.mData = data;
    }



    @NonNull
    @Override
    public HomeAdapter.HomeView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.card_post, viewGroup, false);
        HomeView holder = new HomeView(view);
        return holder;
 }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.HomeView homeView, int i) {
        Goods current = mData.get(i);
        homeView.setData(current, i);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class HomeView extends RecyclerView.ViewHolder {
        TextView title,desc;
        ImageView imgThumb;


        public HomeView(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.list_item_title);
            imgThumb=itemView.findViewById(R.id.list_item_image);
            desc=itemView.findViewById(R.id.list_item_desc);
        }

        public void  setData(Goods goods,int position){
            this.imgThumb.setImageResource(goods.getImage());
            this.title.setText(goods.getTitle());
            this.desc.setText(goods.getDesc());
        }
    }
}
