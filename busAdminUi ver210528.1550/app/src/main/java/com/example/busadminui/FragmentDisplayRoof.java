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

public class FragmentDisplayRoof extends Fragment {

    static boolean displayRoofOnoff = false;
    static boolean displayFoldOnoff = false;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_roof, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        ImageButton display_btn_onoff = view.findViewById(R.id.btn_displayRoofType_onoff);
        ImageButton display_btn_input = view.findViewById(R.id.btn_displayRoofType_input);
        ImageButton display_btn_fold = view.findViewById(R.id.btn_displayRoofType_Fold);
        ImageButton display_btn_minus = view.findViewById(R.id.btn_displayRoofType_minus);
        ImageButton display_btn_plus = view.findViewById(R.id.btn_displayRoofType_plus);

        //init
        display_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
        if(!displayRoofOnoff){
            display_btn_onoff.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
            display_btn_input.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
            display_btn_minus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
            display_btn_plus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
        }

        display_btn_onoff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
                if(displayRoofOnoff){
                    display_btn_onoff.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    display_btn_input.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    display_btn_minus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    display_btn_plus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                }
                else{
                    display_btn_onoff.clearColorFilter();
                    display_btn_input.clearColorFilter();
                    display_btn_minus.clearColorFilter();
                    display_btn_plus.clearColorFilter();
                }
                displayRoofOnoff = !displayRoofOnoff;
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
                if(displayRoofOnoff){
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


        display_btn_fold.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(displayFoldOnoff){
                    display_btn_fold.setImageResource(R.drawable.btn_display_foldoff);
                }
                else{
                    display_btn_fold.setImageResource(R.drawable.btn_display_foldon);
                }
                displayFoldOnoff = !displayFoldOnoff;
            }
        });
        display_btn_fold.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(display_btn_fold.getLeft(), display_btn_fold.getTop(), display_btn_fold.getRight(), display_btn_fold.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(displayFoldOnoff){
                            display_btn_fold.setImageResource(R.drawable.btn_display_foldon_td);
                        }
                        else{
                            display_btn_fold.setImageResource(R.drawable.btn_display_foldoff_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(displayFoldOnoff){
                                display_btn_fold.setImageResource(R.drawable.btn_display_foldon);
                            }
                            else{
                                display_btn_fold.setImageResource(R.drawable.btn_display_foldoff);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        display_btn_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display_btn_minus.setImageResource(R.drawable.btn_minus);
                if(displayRoofOnoff){
                }
            }
        });
        display_btn_minus.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(display_btn_minus.getLeft(), display_btn_minus.getTop(), display_btn_minus.getRight(), display_btn_minus.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        display_btn_minus.setImageResource(R.drawable.btn_minus_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            display_btn_minus.setImageResource(R.drawable.btn_minus);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        display_btn_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display_btn_plus.setImageResource(R.drawable.btn_plus);
                if(displayRoofOnoff){
                }
            }
        });
        display_btn_plus.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(display_btn_plus.getLeft(), display_btn_plus.getTop(), display_btn_plus.getRight(), display_btn_plus.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        display_btn_plus.setImageResource(R.drawable.btn_plus_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            display_btn_plus.setImageResource(R.drawable.btn_plus);
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
