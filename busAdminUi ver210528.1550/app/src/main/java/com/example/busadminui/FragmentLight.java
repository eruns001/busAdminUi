package com.example.busadminui;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentLight extends Fragment {

    static boolean spotOnOff = false;
    static boolean roundOnOff = false;
    static boolean ambientOnOff = false;
    static boolean furnitureOnOff = false;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_light, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton light_btn_spot = view.findViewById(R.id.btn_light_spotLight);
        ImageButton light_btn_round = view.findViewById(R.id.btn_light_roundLight);
        ImageButton light_btn_ambient = view.findViewById(R.id.btn_light_ambientLight);
        ImageButton light_btn_furniture = view.findViewById(R.id.btn_light_furnitureLight);
        Button light_btn_ambientColor = view.findViewById(R.id.btn_light_ambientColor);
        Button light_btn_roundColor = view.findViewById(R.id.btn_light_roundColor);

        //init
        light_btn_spot.setImageResource(R.drawable.btn_light_spotlight);
        if(!spotOnOff){
            light_btn_spot.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
        }
        light_btn_round.setImageResource(R.drawable.btn_light_roundlight);
        if(!roundOnOff){
            light_btn_round.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
        }
        light_btn_ambient.setImageResource(R.drawable.btn_light_ambientlight);
        if(!ambientOnOff){
            light_btn_ambient.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
        }
        light_btn_furniture.setImageResource(R.drawable.btn_light_furniturelight);
        if(!furnitureOnOff){
            light_btn_furniture.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
        }

        //light_btn_furniture.setColorFilter(Color.argb(0,0,0,0), PorterDuff.Mode.SRC_IN);

        light_btn_spot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                light_btn_spot.setImageResource(R.drawable.btn_light_spotlight);
                if(spotOnOff){
                    light_btn_spot.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                }
                else {
                    light_btn_spot.clearColorFilter();

                }
                spotOnOff = !spotOnOff;
            }
        });
        light_btn_spot.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(light_btn_spot.getLeft(), light_btn_spot.getTop(), light_btn_spot.getRight(), light_btn_spot.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        light_btn_spot.setImageResource(R.drawable.btn_light_spotlight_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            light_btn_spot.setImageResource(R.drawable.btn_light_spotlight);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });
        light_btn_round.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                light_btn_round.setImageResource(R.drawable.btn_light_roundlight);
                if(roundOnOff){
                    light_btn_round.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                }
                else {
                    light_btn_round.clearColorFilter();
                }
                roundOnOff = !roundOnOff;
            }
        });
        light_btn_round.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(light_btn_round.getLeft(), light_btn_round.getTop(), light_btn_round.getRight(), light_btn_round.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        light_btn_round.setImageResource(R.drawable.btn_light_roundlight_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            light_btn_round.setImageResource(R.drawable.btn_light_roundlight);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });
        light_btn_ambient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                light_btn_ambient.setImageResource(R.drawable.btn_light_ambientlight);
                if(ambientOnOff){
                    light_btn_ambient.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                }
                else {
                    light_btn_ambient.clearColorFilter();
                }
                ambientOnOff = !ambientOnOff;
            }
        });
        light_btn_ambient.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(light_btn_ambient.getLeft(), light_btn_ambient.getTop(), light_btn_ambient.getRight(), light_btn_ambient.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        light_btn_ambient.setImageResource(R.drawable.btn_light_ambientlight_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            light_btn_ambient.setImageResource(R.drawable.btn_light_ambientlight);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });
        light_btn_furniture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                light_btn_furniture.setImageResource(R.drawable.btn_light_furniturelight);
                if(furnitureOnOff){
                    light_btn_furniture.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                }
                else {
                    light_btn_furniture.clearColorFilter();
                }
                furnitureOnOff = !furnitureOnOff;
            }
        });
        light_btn_furniture.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(light_btn_furniture.getLeft(), light_btn_furniture.getTop(), light_btn_furniture.getRight(), light_btn_furniture.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        light_btn_furniture.setImageResource(R.drawable.btn_light_furniturelight_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            light_btn_furniture.setImageResource(R.drawable.btn_light_furniturelight);
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
