package com.example.mymovielist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ImageFragment extends Fragment {

    static ImageFragment imageFragment = null;

    private static final String TAG = "ImageFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View currentLayout = inflater.inflate(R.layout.image_layout, container, false);
        return currentLayout;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }


    public static ImageFragment getInstance() {
        if (imageFragment == null) {
            imageFragment = new ImageFragment();
            return imageFragment;
        }else
            return imageFragment;
    }


}
