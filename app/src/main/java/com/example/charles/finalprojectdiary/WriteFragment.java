package com.example.charles.finalprojectdiary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Allows the user to write notes or diary entries
 * @author Stacey Chen and Miranda Tang
 */
public class WriteFragment extends Fragment{
    EditText notesText;
    Editable notes;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.write_layout,null);

        //uses EditText widget to allow user input
        notesText = (EditText) view.findViewById(R.id.notesText);
        notes = notesText.getText();

        return view;
    }
}
