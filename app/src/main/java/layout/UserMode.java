package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.FloatingActionButton;
import android.widget.Button;
import android.widget.RelativeLayout;

import sd_dtu.genericmoniteringapplication.R;


public class UserMode extends Fragment {


    Button alertbtn,databtn,actuationbtn;
    FloatingActionButton floatingActionButton;
    public void clicks1(){
        alertbtn=(Button)getActivity().findViewById(R.id.alertsbtn);
        databtn=(Button)getActivity().findViewById(R.id.databtn);
        actuationbtn=(Button)getActivity().findViewById(R.id.actuationbtn);
        floatingActionButton=(FloatingActionButton)getActivity().findViewById(R.id.fab);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RelativeLayout relativeLayout=(RelativeLayout)inflater.inflate(R.layout.fragment_user_mode, container, false);

        clicks1();

        return relativeLayout;
    }



}
