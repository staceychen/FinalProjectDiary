package com.example.charles.finalprojectdiary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Creates tabs for the Record part of the navigation drawer
 * @author Miranda and Stacey
 */
public class TabFragment extends Fragment{
    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 3 ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View x =  inflater.inflate(R.layout.tab_layout,null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id.viewpager);

        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return x;
    }

    class MyAdapter extends FragmentPagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Connects each tab to the appropriate fragment
         */
        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0 : return new WriteFragment();
                case 1 : return new SnapFragment();
                case 2 : return new RecordFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return int_items;
        }

        /**
         * Titles each tab
         */
        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0 :
                    return "Write";
                case 1 :
                    return "Snap";
                case 2 :
                    return "Record";
            }
            return null;
        }
    }
}
