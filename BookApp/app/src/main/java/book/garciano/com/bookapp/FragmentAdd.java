package book.garciano.com.bookapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;

/**
 * Created by admin on 3/5/2016.
 */
public class FragmentAdd extends FragmentActivity {

    private EditText tit;
    private EditText gen;
    private EditText auth;

    public static FragmentAdd newInstance() {
        return new FragmentAdd();
    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add, container, false);


        tit = (EditText) findViewById(R.id.textTitle);
        gen = (EditText) findViewById(R.id.textGenre);
        auth = (EditText) findViewById(R.id.textAuthor);

        return view;
    }
}