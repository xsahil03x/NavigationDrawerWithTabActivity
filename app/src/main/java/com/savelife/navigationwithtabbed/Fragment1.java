package com.savelife.navigationwithtabbed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.R.id.button1;

/**
 * Created by HP on 3/1/2017.
 */

public class Fragment1 extends Fragment {
    View myView;
    Button btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       myView=inflater.inflate(R.layout.frag,container,false);

        btn = (Button) myView.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Addition.class);
                startActivity(i);
            }
        });return myView;
    }
}
