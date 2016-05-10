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
 * Allows the user to use the device's camera to record a video
 * @author Miranda and Stacey
 */
public class RecordFragment extends Fragment{
    private static final int CODE = 100;
    private Uri fileUri;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.record_layout,null);

        Button recordButton =
                (Button) view.findViewById(R.id.recButton);

        //Stops usage if device doesn't have camera
        if (!hasCamera())
            recordButton.setEnabled(false);

        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(intent, CODE);

        return view;
    }

    /**
     * Checks that device has camera
     * @return if device has camera
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
