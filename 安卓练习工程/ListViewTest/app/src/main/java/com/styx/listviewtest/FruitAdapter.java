package com.styx.listviewtest;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xiehaojie on 2017/7/22.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects)
    {
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null)
        {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.fruiteImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruiteName = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);

        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.fruiteImage.setImageResource(fruit.getImageID());
        viewHolder.fruiteName.setText(fruit.getName());
        return view;
    }

    class ViewHolder{
        ImageView fruiteImage;
        TextView fruiteName;
    }

}
