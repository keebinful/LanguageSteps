package com.example.android.languagesteps;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kirik_000 on 10/5/2016.
 */

public class StepAdapter extends FragmentPagerAdapter {

    private static final int STEP_COUNT = 5;
    private Context mContext;

    public StepAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            case 4:
                return new FragmentFive();
        }
        return null;
    }

    @Override
    public int getCount() {
        return STEP_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.step1_title);
            case 1:
                return mContext.getString(R.string.step2_title);
            case 2:
                return mContext.getString(R.string.step3_title);
            case 3:
                return mContext.getString(R.string.step4_title);
            case 4:
                return mContext.getString(R.string.step5_title);
        }
        return null;
    }
}
