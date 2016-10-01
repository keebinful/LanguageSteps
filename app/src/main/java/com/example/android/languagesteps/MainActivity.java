package com.example.android.languagesteps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int pageNumber = 1;
    ImageView pageImage;
    TextView bodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pageImage = (ImageView) findViewById(R.id.page_image);
        bodyText = (TextView) findViewById(R.id.body_text);
        bodyText.setMovementMethod(new ScrollingMovementMethod());
    }

    public void nextPage(View v) {
        if (pageNumber == 7) {
            Toast.makeText(this, getString(R.string.upper_limit_toast), Toast.LENGTH_SHORT).show();
            return;
        }
        pageNumber += 1;

        if (pageNumber == 2) {
            pageImage.setImageResource(R.drawable.stepone);
            bodyText.setText(getString(R.string.step1_title) + "\n" + getString(R.string.step1_body));
        } else if (pageNumber == 3) {
            pageImage.setImageResource(R.drawable.steptwo);
            bodyText.setText(getString(R.string.step2_title) + "\n" + getString(R.string.step2_body));
        } else if (pageNumber == 4) {
            pageImage.setImageResource(R.drawable.stepthree);
            bodyText.setText(getString(R.string.step3_title) + "\n" + getString(R.string.step3_body));
        } else if (pageNumber == 5) {
            pageImage.setImageResource(R.drawable.stepfour);
            bodyText.setText(getString(R.string.step4_title) + "\n" + getString(R.string.step4_body));
        } else if (pageNumber == 6) {
            pageImage.setImageResource(R.drawable.stepfive);
            bodyText.setText(getString(R.string.step5_title) + "\n" + getString(R.string.step5_body));
        } else if (pageNumber == 7) {
            pageImage.setImageResource(R.drawable.conclusion);
            bodyText.setText(getString(R.string.conclusion));
        }
    }

    public void reset(View v) {
        pageNumber = 1;
        pageImage.setImageResource(R.drawable.titleimage);
        bodyText.setText(R.string.title);
    }

    public void previousPage(View v) {
        if (pageNumber == 1) {
            Toast.makeText(this, getString(R.string.lower_limit_toast), Toast.LENGTH_SHORT).show();
            return;
        }
        pageNumber -= 1;


        if (pageNumber == 1) {
            pageImage.setImageResource(R.drawable.titleimage);
            bodyText.setText(R.string.title);
        } else if (pageNumber == 2) {
            pageImage.setImageResource(R.drawable.stepone);
            bodyText.setText(getString(R.string.step1_title) + "\n" + getString(R.string.step1_body));
        } else if (pageNumber == 3) {
            pageImage.setImageResource(R.drawable.steptwo);
            bodyText.setText(getString(R.string.step2_title) + "\n" + getString(R.string.step2_body));
        } else if (pageNumber == 4) {
            pageImage.setImageResource(R.drawable.stepthree);
            bodyText.setText(getString(R.string.step3_title) + "\n" + getString(R.string.step3_body));
        } else if (pageNumber == 5) {
            pageImage.setImageResource(R.drawable.stepfour);
            bodyText.setText(getString(R.string.step4_title) + "\n" + getString(R.string.step4_body));
        } else if (pageNumber == 6) {
            pageImage.setImageResource(R.drawable.stepfive);
            bodyText.setText(getString(R.string.step5_title) + "\n" + getString(R.string.step5_body));
        }
    }

}
