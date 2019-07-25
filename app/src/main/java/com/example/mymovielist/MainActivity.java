package com.example.mymovielist;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is the part for the background
        view= this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.backgroundColor);

        //this is for Description fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.myPager, new DescriptionFragment()).commit();

        // this is for the list fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.listview_container, new MyListFragment()).commit();

    }

}
