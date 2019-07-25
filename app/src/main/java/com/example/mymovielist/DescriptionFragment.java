package com.example.mymovielist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionFragment extends Fragment {


    TextView message;
    String messageData = "no value";

private static final String TAG = "DescriptionFragment";
int categoryId = 0;
int itemPosition = 0;
Movies movies;

 static DescriptionFragment descriptionFragment = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View currentLayout = inflater.inflate(R.layout.description_layout, container, false);

/*
        Bundle bundle = getIntent().getExtras();
        itemPosition = bundle.getInt("itemPosition");
        categoryId = bundle.getInt("categoryId");
        Movies[] categoryMovies = Movies.getCategoryMovies(categoryId);
        movies = categoryMovies[itemPosition];

        TextView movieName = findViewById(R.id.desc_title);
        TextView movieDescription = findViewById(R.id.desc_description);
        TextView movieDirector = findViewById(R.id.desc_director);
        TextView movieCast = findViewById(R.id.desc_cast);
        ImageView image = findViewById(R.id.Image1);

        movieName.setText(movies.getName());
        movieDescription.setText(movies.getDescription());
        movieDirector.setText(movies.getDirector());
        movieCast.setText(movies.getCast());
*/
        return currentLayout;
    }

    public static DescriptionFragment getInstance() {
        if (descriptionFragment == null) {
            descriptionFragment = new DescriptionFragment();
            return descriptionFragment;
        }else
            return descriptionFragment;
    }

 //   public Fragment getInstance() {
 //       return null;
}

