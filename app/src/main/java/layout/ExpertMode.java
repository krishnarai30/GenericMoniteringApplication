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
import sd_dtu.genericmoniteringapplication.CalculateActivity;
import sd_dtu.genericmoniteringapplication.DataActivity;
import sd_dtu.genericmoniteringapplication.FeedBackActivity;
import sd_dtu.genericmoniteringapplication.R;
import sd_dtu.genericmoniteringapplication.ResultActivity;
import sd_dtu.genericmoniteringapplication.TrendActivity;


public class ExpertMode extends Fragment {

    Button alertbtn3,databtn3,calculatebtn2,resultbtn,trendbtn;
    FloatingActionButton floatingActionButton3;
    public void clicks3(View view){
        resultbtn=(Button)view.findViewById(R.id.resultbtn);
        trendbtn=(Button)view.findViewById(R.id.trendbtn);
        alertbtn3=(Button)view.findViewById(R.id.alertbtn3);
        databtn3=(Button)view.findViewById(R.id.databtn3);
        calculatebtn2=(Button)view.findViewById(R.id.calculatebtn2);
        floatingActionButton3=(FloatingActionButton)view.findViewById(R.id.fab3);

        trendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt=new Intent(getActivity().getBaseContext(),TrendActivity.class);
                startActivity(intentt);
            }
        });

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentr=new Intent(getActivity().getBaseContext(),ResultActivity.class);
                startActivity(intentr);
            }
        });

        calculatebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc=new Intent(getActivity().getBaseContext(),CalculateActivity.class);
                startActivity(intentc);
            }
        });

        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf=new Intent(getActivity().getBaseContext(),FeedBackActivity.class);
                startActivity(intentf);
            }
        });
        databtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd=new Intent(getActivity().getBaseContext(),DataActivity.class);
                startActivity(intentd);
            }
        });

        alertbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta=new Intent(getActivity().getBaseContext(),AlertsActivity.class);
                startActivity(intenta);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_expert_mode, container, false);
        clicks3(view);
        return view;
    }

}
