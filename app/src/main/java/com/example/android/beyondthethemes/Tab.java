package com.example.android.beyondthethemes;

public class Tab {

    // IMAGE OF PLACE
    private Integer mtabImage;

    // NAME OF PLACE
    private String mTabName;

    // ADDRESS OF PLACE
    private String mTabDescrip;

//   CREATING A PLACE OBJECT
    public Tab(int vTabpic, String vTabName, String vTabDescrip)
    {
        mtabImage = vTabpic;
        mTabName = vTabName;
        mTabDescrip = vTabDescrip;
    }

//   GETS THE IMAGE RESOURCE ID
    public Integer getTabImageResourceId() {
        return mtabImage;
    }

//    GETS THE STRING FOR THE PLACE NAME
    public String getTabName() {
        return mTabName;
    }

//    GETS THE STRING FOR THE PLACE ADDRESS
    public String getTabDescrip() {
        return mTabDescrip;
    }


}
