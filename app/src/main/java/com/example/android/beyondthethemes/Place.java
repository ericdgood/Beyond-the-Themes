package com.example.android.beyondthethemes;

public class Place {

    // IMAGE OF PLACE
    private Integer mPlaceImage;

    // NAME OF PLACE
    private String mPlaceName;

    // ADDRESS OF PLACE
    private String mPlaceWeb;

//   CREATING A PLACE OBJECT
    public Place(int vpic, String vName, String vWeb)
    {
        mPlaceImage = vpic;
        mPlaceName = vName;
        mPlaceWeb = vWeb;
    }

//   GETS THE IMAGE RESOURCE ID
    public Integer getImageResourceId() {
        return mPlaceImage;
    }

//    GETS THE STRING FOR THE PLACE NAME
    public String getPlaceName() {
        return mPlaceName;
    }

//    GETS THE STRING FOR THE PLACE ADDRESS
    public String getPlaceWeb() {
        return mPlaceWeb;
    }


}
