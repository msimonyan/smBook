package com.softwareengineering.smbook.fragments;

/**
 * Created by Irina on 11/23/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.softwareengineering.smbook.R;
import com.softwareengineering.smbook.activities.App;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends Fragment {
    public  static  final String LOGIN_FRAGMENT_BACKSTACK_TAG = "Login_fragment_backstack_tag";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        setHasOptionsMenu(true);
        return view;
    }

//    @OnClick(R.id.back_arrow_image_view)
//    public void onBackPressed(View view) {
//        Toast.makeText(App.getContext(), "Back", Toast.LENGTH_LONG).show();
//        getActivity().onBackPressed();
//    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_abouts, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                Toast.makeText(App.getContext(), "Back", Toast.LENGTH_LONG).show();
                getActivity().onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}