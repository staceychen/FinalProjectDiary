package com.example.charles.finalprojectdiary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Allows pictures, notes, etc. to be viewed on a map,
 * still in work progress, MapsActivity.java has the actual map
 * @author Miranda and Stacey
 */
public class MapFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.map_layout,null);
    }
}
