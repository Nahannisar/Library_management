package com.example.collegelibrary;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {



    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        /**Instead of passing same fragment multiple times pass different fragments for different tabs*/
        //NOTE : if its all are same type we can use same fragment, just pass the values to different positions as bundle using setArguments()
        Fragment selectedFragment = null;
        switch (position){
            case 0:
                selectedFragment = new BooksFragment();
                break;
            case 1:
                selectedFragment = new StudentsFragment();
                break;

        }
        return selectedFragment;
    }

    @Override
    public int getCount() {
        return 2;
    }



}
