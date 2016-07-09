package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import sd_dtu.genericmoniteringapplication.AlertsActivity;
import sd_dtu.genericmoniteringapplication.FeedBackActivity;
import sd_dtu.genericmoniteringapplication.FinalActivity;
import sd_dtu.genericmoniteringapplication.R;


public class ScienceMode extends Fragment {


    Button alertbtn2,databtn2,calculatebtn1,analyticsbtn1;
    FloatingActionButton floatingActionButton2;

    public void clicks2(View v){
        alertbtn2=(Button) v.findViewById(R.id.alertbtn2);
        databtn2=(Button)v.findViewById(R.id.databtn2);
        calculatebtn1=(Button)v.findViewById(R.id.calculatebtn1);
        analyticsbtn1=(Button)v.findViewById(R.id.analyticsbtn1);
        floatingActionButton2=(FloatingActionButton)v.findViewById(R.id.fab3);


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
