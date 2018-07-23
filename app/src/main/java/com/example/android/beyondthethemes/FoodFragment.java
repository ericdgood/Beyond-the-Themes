package com.example.android.beyondthethemes;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tabinfoView = inflater.inflate(R.layout.place_list, container, false);

        //        GET AND SET TAB NAME INFO
        TextView TabName = (TextView) tabinfoView.findViewById(R.id.tab_title);
        TabName.setText(R.string.food);

        //        GET AND SET TAB NAME INFO
        TextView TabDescrip = (TextView) tabinfoView.findViewById(R.id.tab_descrip);
        TabDescrip.setText(R.string.food_tab);

        //        GET AND SET TAB IMAGE INFO
        ImageView TabImage = (ImageView) tabinfoView.findViewById(R.id.tab_image);
        TabImage.setBackgroundResource(R.drawable.food);

//        CREATING ARRAYLIST FOR ABOUT
        final ArrayList<Place> place = new ArrayList<Place>();

        place.add(new Place(R.drawable.publix,R.strings.publixN,R.strings.publixW));
        place.add(new Place(R.drawable.kobe,R.strings.kobeN, R.strings.kobeW));
        place.add(new Place(R.drawable.marlows,R.strings.marlowN, R.strings.marlowW));
        place.add(new Place(R.drawable.tflats,R.strings.tflatsN, R.strings.tflatW));
        place.add(new Place(R.drawable.hard,R.strings.hardN, R.strings.hardW));

        final Place_Adapter adapter = new Place_Adapter(getActivity(), place);

        ListView listView = (ListView) tabinfoView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        // When listView item is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place item = adapter.getItem(position);
                String map = "http://maps.google.co.in/maps?q=" + item.getPlaceName();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(intent);
            }
        });

        return tabinfoView;
    }

}
