package com.example.android.beyondthethemes;

public class Place {

    // NAME OF PLACE
    private int mPlaceName;

    // ADDRESS OF PLACE
    private int mPlaceWeb;


    private int mPlaceImage = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    //   CREATING A PLACE OBJECT
    public Place(int vpic, int vName, int vWeb)
    {
        mPlaceImage = vpic;
        mPlaceName = vName;
        mPlaceWeb = vWeb;
    }
    //   CREATING A PLACE OBJECT
    public Place(int vName, int vWeb)
    {
        mPlaceName = vName;
        mPlaceWeb = vWeb;
    }


//   GETS THE IMAGE RESOURCE ID
    public Integer getImageResourceId() {
        return mPlaceImage;
    }

//    GETS THE STRING FOR THE PLACE NAME
    public int getPlaceName() {
        return mPlaceName;
    }

//    GETS THE STRING FOR THE PLACE ADDRESS
    public int getPlaceWeb() {
        return mPlaceWeb;
    }

    public boolean hasImage() {
        return mPlaceImage != NO_IMAGE_PROVIDED;
    }
}
