package com.example.inmobiliaria.ui.inmueble;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class InmuebleTabAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public InmuebleTabAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }
}
