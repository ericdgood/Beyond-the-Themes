package com.example.android.beyondthethemes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tabinfoView = inflater.inflate(R.layout.place_list, container, false);

        //        GET AND SET TAB NAME INFO
        TextView TabName = (TextView) tabinfoView.findViewById(R.id.tab_title);
        TabName.setText(R.string.orlando);

        //        GET AND SET TAB NAME INFO
        TextView TabDescrip = (TextView) tabinfoView.findViewById(R.id.tab_descrip);
        TabDescrip.setText(R.string.orlando_tab);

        //        GET AND SET TAB IMAGE INFO
        ImageView TabImage = (ImageView) tabinfoView.findViewById(R.id.tab_image);
        TabImage.setBackgroundResource(R.drawable.eola);

//        CREATING ARRAYLIST FOR ABOUT
        final ArrayList<Place> place = new ArrayList<Place>();

        place.add(new Place(R.drawable.eola, "Lake Eola", "Orlando.com"));
        place.add(new Place(R.drawable.nature, "2", "Orlando.com"));
        place.add(new Place(R.drawable.food, "3", "Orlando.com"));
        place.add(new Place(R.drawable.eola, "Lake Eola", "Orlando.com"));
        place.add(new Place(R.drawable.nature, "2", "Orlando.com"));
        place.add(new Place(R.drawable.food, "3", "Orlando.com"));
        place.add(new Place(R.drawable.eola, "Lake Eola", "Orlando.com"));
        place.add(new Place(R.drawable.nature, "2", "Orlando.com"));
        place.add(new Place(R.drawable.food, "3", "Orlando.com"));

        Place_Adapter adapter = new Place_Adapter(getActivity(), place);

        ListView listView = (ListView) tabinfoView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return tabinfoView;
    }
}
