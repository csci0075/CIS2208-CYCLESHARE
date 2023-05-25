package com.example.cycleschare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cycleschare.R;

public class BikeListFragment extends Fragment {

    TextView PageTitle;
    TextView LocationOne;
    TextView LocationTwo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment layout
        View rootView = inflater.inflate(R.layout.fragment_bike_list, container, false);


        // Obtain references to the TextViews
        PageTitle = rootView.findViewById(R.id.PageTitle);
        LocationOne = rootView.findViewById(R.id.locationone);
        LocationTwo = rootView.findViewById(R.id.locationtwo);


        // Customize the fragment UI components and behavior here

        return rootView;
    }
}
