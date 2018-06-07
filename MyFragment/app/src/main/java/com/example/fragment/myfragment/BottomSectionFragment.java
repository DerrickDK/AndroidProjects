package com.example.fragment.myfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

    public class BottomSectionFragment extends Fragment {
        @Nullable //Denotes that a parameter, field or method return value can be null.
        @Override //Overrides the method in the Fragment class but this method is still in the Fragment Class
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.bottom_section_fragment, container, false);
            return view;
            //return super.onCreateView(inflater, container, savedInstanceState);
        }
}
