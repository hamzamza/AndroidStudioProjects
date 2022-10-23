package com.localapps.a19_fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
Bundle bundle = savedInstanceState;
      TextView text =  container.findViewById(R.id.fragemnt_text);

        if(bundle !=  null){
            Log.d("bundle", "onCreateView: bundle");
       String string = bundle.getString("name");
       if(string != null)
           Log.d("TAG", "onCreateView: "+ string);}
        View view = inflater.inflate(R.layout.fragmant, container, false);
    return view;
    }
}
