package com.styx.recycleviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by xiehaojie on 2017/7/24.
 */

public class FruitAapter extends RecyclerView.Adapter<FruitAapter.ViewHolder> {

    private List<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
        View fruitView;

        public ViewHolder(View view){
            super(view);
            fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            fruitName = (TextView) view.findViewById(R.id.fruit_name);
            fruitView = view;
        }
    }


    public FruitAapter(List<Fruit> fruitList)
    {
        mFruitList = fruitList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent,false);
//        ViewHolder holder = new ViewHolder(view);

        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int postion = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(postion);
                Toast.makeText(view.getContext(),"you clicked view"+ fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageID());
        holder.fruitName.setText(fruit.getName());
    }

    public int getItemCount()
    {
        return mFruitList.size();
    }
}
