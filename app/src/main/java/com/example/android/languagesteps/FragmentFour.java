package com.example.android.languagesteps;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kirik_000 on 10/5/2016.
 */

public class FragmentFour extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate and set activity_main layout
        View rootView = inflater.inflate(R.layout.contents, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.page_image);
        TextView textView = (TextView) rootView.findViewById(R.id.body_text);

        imageView.setImageResource(R.drawable.stepfour);
        textView.setText(getString(R.string.step4_body));

        return rootView;
    }
}
