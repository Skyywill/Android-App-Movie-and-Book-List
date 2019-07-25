package com.example.mymovielist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm){
        super(fm);
    }
// this is for the swipe screen and this is the adapter for it
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new ImageFragment();  //this is how you call a singleton, remove the " new " from the front of return and add .getInstance(); after DescriptionFragment
            case 1:
                return new DescriptionFragment();
            case 2:
                return new MyListFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;   //return the number of switch items
    }

    //this section is for the tab


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "POSTER";
            case 1:
                return "DESCRIPTION";
            case 2:
                return "TRAILER";
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
