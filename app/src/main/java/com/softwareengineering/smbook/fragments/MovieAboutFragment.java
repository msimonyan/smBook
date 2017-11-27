package com.softwareengineering.smbook.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.softwareengineering.smbook.R;
import com.softwareengineering.smbook.activities.App;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Irina on 11/26/2017.
 */

public class MovieAboutFragment extends Fragment {

    public  static  final String MOVIE_ABOUT_FRAGMENT_BACKSTACK_TAG = "Movie_about_fragment_backstack_tag";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.movie_about_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.back_arrow_image_view)
    public void onBackPressed(View view) {
        Toast.makeText(App.getContext(), "Back", Toast.LENGTH_LONG).show();
        getActivity().onBackPressed();
    }

    @OnClick(R.id.buy_tickets_button)
    public void buy_tickets(View view) {
        Toast.makeText(App.getContext(), "Buy tickets", Toast.LENGTH_LONG).show();
        //TODO: onBackPressed bug, returns TabFragment instead of last in backstack after buy_tickets
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MovieScheduleFragment()).addToBackStack(null).commit();
    }
}