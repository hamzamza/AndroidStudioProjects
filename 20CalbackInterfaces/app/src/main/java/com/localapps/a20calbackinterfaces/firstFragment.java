package com.localapps.a20calbackinterfaces;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class firstFragment extends Fragment {
    // callbacks interfaces
        /// te element we'll use //
//
             private EditText  inputtxt;
              private Button    sendbtn ;
                private SendNameInterface sendNameInterface ;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        inputtxt = view.findViewById(R.id.textinput);
        sendbtn = view.findViewById(R.id.btnsend);
try {
    sendNameInterface = (SendNameInterface) getActivity();

}
catch (ClassCastException ex) {
    sendNameInterface = null;
    ex.printStackTrace();
}

sendbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(null != sendNameInterface){
            Bundle bunle = new Bundle();
            bunle.putString("text",inputtxt.getText().toString());
            sendNameInterface.sendNameresult(bunle);
        }
    }
});


    return view;
    }
}
