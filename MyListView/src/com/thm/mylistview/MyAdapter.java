package com.thm.mylistview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<Item> {
	
	private final Context context;
    private final ArrayList<Item> itemsArrayList;

    public MyAdapter(Context context, ArrayList<Item> itemsArrayList) {

        super(context, R.layout.row, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

    	/*
        // 1. Create inflater 
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // 3. Get the two text view from the rowView
        TextView labelView = (TextView) rowView.findViewById(R.id.label);
        TextView valueView = (TextView) rowView.findViewById(R.id.value);

        // 4. Set the text for textView 
        labelView.setText(itemsArrayList.get(position).getTitle());
        valueView.setText(itemsArrayList.get(position).getDescription());

        // 5. retrn rowView
        return rowView;
        */
    	
    	// if convertView is null, the view is newly inflated.
        // else, re-assign new values.
        
    	
    	/* ====================================================================== */
    	ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row, null);
     
            // Set up the ViewHolder.
            holder = new ViewHolder();
            
            holder.image = (ImageView) convertView.findViewById(R.id.icon);
            holder.title = (TextView) convertView.findViewById(R.id.label);
            holder.description = (TextView) convertView.findViewById(R.id.value);
     
            // Store the holder with the view.
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
     
        // Assign values
        holder.image.setImageResource(itemsArrayList.get(position).getImage());
        holder.title.setText(itemsArrayList.get(position).getTitle());
        holder.description.setText(itemsArrayList.get(position).getDescription());
        /* ========================================================================= */
    	
    	return convertView;
    	
    }
    
    static class ViewHolder {
  	  TextView title;
  	  TextView description;
  	  ImageView image;
  	}

}


