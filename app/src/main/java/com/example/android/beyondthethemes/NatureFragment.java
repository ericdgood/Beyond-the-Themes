package com.example.android.beyondthethemes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        View tabinfoView = inflater.inflate(R.layout.place_list, container, false);

        //        GET AND SET TAB NAME INFO
        TextView TabName = (TextView) tabinfoView.findViewById(R.id.tab_title);
        TabName.setText("NATURE");

        //        GET AND SET TAB NAME INFO
        TextView TabDescrip = (TextView) tabinfoView.findViewById(R.id.tab_descrip);
        TabDescrip.setText(R.string.orlando);

        //        GET AND SET TAB IMAGE INFO
        ImageView TabImage = (ImageView) tabinfoView.findViewById(R.id.tab_image);
        TabImage.setBackgroundResource(R.drawable.nature);

//        CREATING ARRAYLIST FOR ABOUT
        final ArrayList<Place> place = new ArrayList<Place>();

        place.add(new Place(R.drawable.gator, "Gatorland", "Orlando.com"));
        place.add(new Place(R.drawable.owc, "Orlando Watersports Complex", "Orlando.com"));
        place.add(new Place(R.drawable.air, "Central Florida Air boats", "Orlando.com"));
        place.add(new Place(R.drawable.springs, "Wekiva Springs", "Orlando.com"));
        place.add(new Place(R.drawable.zoo, "Central Florida Zoo", "Orlando.com"));

        Place_Adapter adapter = new Place_Adapter(getActivity(), place);

        ListView listView = (ListView) tabinfoView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return tabinfoView;
    }

}
