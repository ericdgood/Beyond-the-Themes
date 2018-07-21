package com.example.android.beyondthethemes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Tabs extends FragmentPagerAdapter{

    private String tabTitles[] = new String[] { "About", "History", "Food", "Nature" };

    public Tabs(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1){
            return new HistoryFragment();
        } else if (position == 2){
            return new FoodFragment();
        } else {
            return new NatureFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
