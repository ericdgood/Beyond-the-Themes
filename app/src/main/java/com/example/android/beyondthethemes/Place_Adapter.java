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


//        GET AND SET PLACE IMAGE INFO
        ImageView PlaceImage = (ImageView) listItemView.findViewById(R.id.place_image);
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            PlaceImage.setImageResource(currentPlace.getImageResourceId());
            // Make sure the view is visible
            PlaceImage.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            PlaceImage.setVisibility(View.GONE);
        }

//        GET AND SET PLACE NAME INFO
        TextView PlaceName = (TextView) listItemView.findViewById(R.id.place_name);
        PlaceName.setText(currentPlace.getPlaceName());

//        GET AND SET PLACE WEB INFO
        TextView PlaceWeb = (TextView) listItemView.findViewById(R.id.place_web);
        PlaceWeb.setText(currentPlace.getPlaceWeb());


        return listItemView;
    }
}
