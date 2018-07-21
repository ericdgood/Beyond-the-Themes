package com.example.android.beyondthethemes;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Place_Adapter extends ArrayAdapter<Place>{


    public Place_Adapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

//        GET AND SET IMAGE INFO
        ImageView PlaceImage = (ImageView) listItemView.findViewById(R.id.place_image);
        PlaceImage.setImageResource(currentPlace.getImageResourceId());

//        GET AND SET IMAGE INFO
        TextView PlaceName = (TextView) listItemView.findViewById(R.id.place_name);
        PlaceName.setText(currentPlace.getPlaceName());

//        GET AND SET IMAGE INFO
        TextView PlaceWeb = (TextView) listItemView.findViewById(R.id.place_web);
        PlaceWeb.setText(currentPlace.getPlaceWeb());


        return listItemView;
    }
}
