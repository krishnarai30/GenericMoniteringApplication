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



public class ExpertMode extends Fragment {

    Button alertbtn3,databtn3,calculatebtn2,resultbtn,trendbtn;
    FloatingActionButton floatingActionButton3;
    public void clicks3(){
        resultbtn=(Button)getActivity().findViewById(R.id.resultbtn);
        trendbtn=(Button)getActivity().findViewById(R.id.trendbtn);
        alertbtn3=(Button)getActivity().findViewById(R.id.alertbtn3);
        databtn3=(Button)getActivity().findViewById(R.id.databtn3);
        calculatebtn2=(Button)getActivity().findViewById(R.id.calculatebtn2);
        floatingActionButton3=(FloatingActionButton)getActivity().findViewById(R.id.fab3);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RelativeLayout rl1=(RelativeLayout)inflater.inflate(R.layout.fragment_expert_mode, container, false);
        clicks3();
        return rl1;
    }

}
