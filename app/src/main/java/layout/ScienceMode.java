package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import sd_dtu.genericmoniteringapplication.ActuationActivity;
import sd_dtu.genericmoniteringapplication.AlertsActivity;
import sd_dtu.genericmoniteringapplication.CalculateActivity;
import sd_dtu.genericmoniteringapplication.DataActivity;
import sd_dtu.genericmoniteringapplication.FeedBackActivity;
import sd_dtu.genericmoniteringapplication.R;


public class ScienceMode extends Fragment {


    Button alertbtn2,databtn2,calculatebtn1,actuationbtn2;
    FloatingActionButton floatingActionButton2;

    public void clicks2(View v){
        alertbtn2=(Button) v.findViewById(R.id.alertbtn2);
        databtn2=(Button)v.findViewById(R.id.databtn2);
        calculatebtn1=(Button)v.findViewById(R.id.calculatebtn1);
        actuationbtn2=(Button)v.findViewById(R.id.actuationbtn2);
        floatingActionButton2=(FloatingActionButton)v.findViewById(R.id.fab3);

        calculatebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc=new Intent(getActivity().getBaseContext(),CalculateActivity.class);
                startActivity(intentc);
            }
        });

        actuationbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentac=new Intent(getActivity().getBaseContext(),ActuationActivity.class);
                startActivity(intentac);
            }
        });

        databtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd=new Intent(getActivity().getBaseContext(),DataActivity.class);
                startActivity(intentd);
            }
        });
        alertbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta=new Intent(getActivity().getBaseContext(),AlertsActivity.class);
                startActivity(intenta);
            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
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
        View view=inflater.inflate(R.layout.fragment_science_mode, container, false);
        clicks2(view);
        return view;
    }


}
