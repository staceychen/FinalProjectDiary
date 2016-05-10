package com.example.charles.finalprojectdiary;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Allows user to use camera to take pictures
 * @author Miranda and Stacey
 */
public class SnapFragment extends Fragment{
    private static final int CODE = 100;
    private Uri fileUri;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.snap_layout,null);

        Button picButton =
                (Button) view.findViewById(R.id.picButton);

        //Stops if device has no camera
        if (!hasCamera())
            picButton.setEnabled(false);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CODE);

        return view;
    }

    /**
     * Checks if device has camera
     * @return if the device has a camera
     */
    private boolean hasCamera() {
        if (getActivity().getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA_FRONT)){
            return true;
        } else {
            return false;
        }
    }
}
