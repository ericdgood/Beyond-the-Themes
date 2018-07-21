package com.example.android.beyondthethemes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

//        CREATING ARRAYLIST FOR ABOUT
        final ArrayList<Place> place = new ArrayList<Place>();

        place.add(new Place(R.drawable.nature, "Greenwoods Urban Wetlands", "Park.com"));

        Place_Adapter adapter = new Place_Adapter(getActivity(), place);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
