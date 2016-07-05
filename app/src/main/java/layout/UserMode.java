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


    public Button alertbtn,databtn,actuationbtn;
    FloatingActionButton floatingActionButton;
    public void clicks(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RelativeLayout relativeLayout=(RelativeLayout)inflater.inflate(R.layout.fragment_user_mode, container, false);
        alertbtn=(Button)getView().findViewById(R.id.alertsbtn);
        databtn=(Button)getView().findViewById(R.id.databtn);
        actuationbtn=(Button)getView().findViewById(R.id.actuationbtn);
        floatingActionButton=(FloatingActionButton)getView().findViewById(R.id.fab);
        clicks();


        return relativeLayout;
    }



}
