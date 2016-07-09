package layout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import sd_dtu.genericmoniteringapplication.R;


public class ScienceMode extends Fragment {


    Button alertbtn2,databtn2,calculatebtn1,analyticsbtn1;
    FloatingActionButton floatingActionButton2;
    public void clicks2(){
        alertbtn2=(Button)getActivity().findViewById(R.id.alertbtn2);
        databtn2=(Button)getActivity().findViewById(R.id.databtn2);
        calculatebtn1=(Button)getActivity().findViewById(R.id.calculatebtn1);
        analyticsbtn1=(Button)getActivity().findViewById(R.id.analyticsbtn1);
        floatingActionButton2=(FloatingActionButton)getActivity().findViewById(R.id.fab3);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RelativeLayout rl=(RelativeLayout)inflater.inflate(R.layout.fragment_science_mode, container, false);
        clicks2();
        return rl;
    }


}
