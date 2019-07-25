package com.example.mymovielist;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TrailerFragment extends Fragment {

    static TrailerFragment trailerFragment = null;

    private static final String TAG = "TrailerFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View currentLayout = inflater.inflate (R.layout.trailer_fragment,container, false);

        return currentLayout;
    }

    public static TrailerFragment getInstance() {
        if (trailerFragment == null) {
            trailerFragment = new TrailerFragment();
            return trailerFragment;
        }else
            return trailerFragment;
    }
}
