package com.example.bottom_navigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class myViewAdapter extends FragmentStateAdapter {
    public myViewAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FragmentName();
            case 1:
                return new FragmentClass();
            case 2:
                return new FragmentAge();
            case 3:
                return new FragmentUsercode();
            default:
                return new FragmentName();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
