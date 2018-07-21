package com.example.android.beyondthethemes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Tabs_Adapter extends ArrayAdapter<Tab>{


    public Tabs_Adapter(Activity context, ArrayList<Tab> tab) {
        super(context, 0, tab);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        Tab currentTab = getItem(position);

//        GET AND SET TAB IMAGE INFO
        ImageView TabImage = (ImageView) listItemView.findViewById(R.id.tab_image);
        TabImage.setImageResource(currentTab.getTabImageResourceId());

        //        GET AND SET TAB NAME INFO
        TextView TabName = (TextView) listItemView.findViewById(R.id.tab_title);
        TabName.setText(currentTab.getTabName());

        //        GET AND SET TAB NAME INFO
        TextView TabDescrip = (TextView) listItemView.findViewById(R.id.tab_descrip);
        TabDescrip.setText(currentTab.getTabDescrip());

        return listItemView;
    }
}
