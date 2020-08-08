package com.example.tugas_uas_akb_if3_10117118.ui.informasi;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 3;

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return page1.newInstance(0);
            case 1:
                return page2.newInstance(1);
            case 2:
                return page3.newInstance(2);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

  /*  @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }*/



}
