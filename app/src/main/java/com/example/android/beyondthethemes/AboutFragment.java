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
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

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

        place.add(new Place(R.drawable.eola, R.string.eola, R.string.orangeW));
        place.add(new Place(R.drawable.library, R.string.ocls, R.string.oclsW));
        place.add(new Place(R.drawable.dt, R.string.dt_info, R.string.infow));
        place.add(new Place(R.drawable.garden, R.string.winterG, R.string.winterW));
        place.add(new Place(R.drawable.amway, R.string.amwayC, R.string.amwayW));

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
