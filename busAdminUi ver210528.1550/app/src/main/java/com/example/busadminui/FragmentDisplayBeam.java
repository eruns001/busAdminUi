package com.example.busadminui;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FragmentDisplayBeam extends Fragment {

    static boolean displayBeamOnoff = false;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_beamtype, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        ImageButton display_btn_onoff = view.findViewById(R.id.btn_displayBeamType_onoff);
        ImageButton display_btn_input = view.findViewById(R.id.btn_displayBeamType_input);
        ImageButton display_btn_down = view.findViewById(R.id.btn_displayBeamType_down);
        ImageButton display_btn_up = view.findViewById(R.id.btn_displayBeamType_up);

        //init
        display_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
        if(!displayBeamOnoff){
            display_btn_onoff.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
        }

        display_btn_onoff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
                if(displayBeamOnoff){
                    display_btn_onoff.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    display_btn_input .setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    display_btn_down.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    display_btn_up.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                }
                else{
                    display_btn_onoff.clearColorFilter();
                    display_btn_input.clearColorFilter();
                    display_btn_down.clearColorFilter();
                    display_btn_up.clearColorFilter();
                }
                displayBeamOnoff = !displayBeamOnoff;
            }
        });
        display_btn_onoff.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(display_btn_onoff.getLeft(), display_btn_onoff.getTop(), display_btn_onoff.getRight(), display_btn_onoff.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        display_btn_onoff.setImageResource(R.drawable.btn_onoff_on_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            display_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        display_btn_input.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display_btn_input.setImageResource(R.drawable.btn_display_input);
                if(displayBeamOnoff){
                }
            }
        });
        display_btn_input.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(display_btn_input.getLeft(), display_btn_input.getTop(), display_btn_input.getRight(), display_btn_input.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        display_btn_input.setImageResource(R.drawable.btn_display_input_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            display_btn_input.setImageResource(R.drawable.btn_display_input);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        display_btn_down.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display_btn_down.setImageResource(R.drawable.btn_display_down);
                if(displayBeamOnoff){
                }
            }
        });
        display_btn_down.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(display_btn_down.getLeft(), display_btn_down.getTop(), display_btn_down.getRight(), display_btn_down.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        display_btn_down.setImageResource(R.drawable.btn_display_down_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            display_btn_down.setImageResource(R.drawable.btn_display_down);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        display_btn_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display_btn_up.setImageResource(R.drawable.btn_display_up);
                if(displayBeamOnoff){
                }
            }
        });
        display_btn_up.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(display_btn_up.getLeft(), display_btn_up.getTop(), display_btn_up.getRight(), display_btn_up.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        display_btn_up.setImageResource(R.drawable.btn_display_up_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            display_btn_up.setImageResource(R.drawable.btn_display_up);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });
    }
}
