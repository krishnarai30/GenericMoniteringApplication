package layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.FloatingActionButton;
import android.widget.Button;
import android.widget.RelativeLayout;

import sd_dtu.genericmoniteringapplication.AlertsActivity;
import sd_dtu.genericmoniteringapplication.FeedBackActivity;
import sd_dtu.genericmoniteringapplication.R;


public class UserMode extends Fragment {


    Button alertbtn,databtn,actuationbtn;
    FloatingActionButton floatingActionButton;
    public void clicks1(View v){
        alertbtn=(Button)v.findViewById(R.id.alertsbtn);
        databtn=(Button)v.findViewById(R.id.databtn);
        actuationbtn=(Button)v.findViewById(R.id.actuationbtn);
        floatingActionButton=(FloatingActionButton)v.findViewById(R.id.fab);

        alertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta=new Intent(getActivity().getBaseContext(),AlertsActivity.class);
                startActivity(intenta);
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf=new Intent(getActivity().getBaseContext(),FeedBackActivity.class);
                startActivity(intentf);
            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_user_mode, container, false);

        clicks1(view);

        return view;
    }



}
