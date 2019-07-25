package com.example.mymovielist;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener {

    static MyListFragment myListFragment = null;

    String[] movie_lists;
    MyPagerAdapter myPagerAdapter;

    //Setting up the movie list to choose from

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


         movie_lists = new String[] {

                "STAR WARS",
                "DUNKIRK",
                "TROPIC THUNDER",
                "BAND OF BROTHERS",
                "VENOM",
                "DEADPOOL",
                "IRONMAN",
                "GUARDIANS OF THE GALAXY 2",
                "IT",
                "FURY",
                "THE DICTATOR",
                "SHAWN OF THE DEAD"

        };

// this is the adapter to get the String as a list

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, movie_lists);
        this.setListAdapter(adapter);

        //this is for the adapter
        myPagerAdapter = new MyPagerAdapter(getActivity().getSupportFragmentManager());
        ViewPager pager = getActivity().findViewById(R.id.myPager);
        pager.setAdapter(myPagerAdapter);

        //we have to attach the tab layout here too
        TabLayout tabLayout = getActivity().findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
        return super.onCreateView(inflater, container, savedInstanceState);

    }
// This is for the TOAST
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getContext(), movie_lists[position] +" SELECTED", Toast.LENGTH_LONG); // remove " .show() " to remove the Toast message
      //  view.setSelected(true);


        //This is the section where you make the selection of the item, when you click on the item on the list, it shows you the name of the item selected (1.20)
        //this is Pass Value between fragment with Bundle
        DescriptionFragment descriptionFragment = new DescriptionFragment();
        Bundle b = new Bundle();
        b.putString("item_name", movie_lists[position]);
        descriptionFragment.setArguments(b);

        //top
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.myPager, descriptionFragment).commit();
    }
// this is the section to modify the onStart to make the TOAST to work
    @Override
    public void onStart(){
        super.onStart();
        getListView().setOnItemClickListener(this);
    }

    public static MyListFragment getInstance() {
        if (myListFragment == null) {
            myListFragment = new MyListFragment();
            return myListFragment;
        }else
            return myListFragment;
    }

}
