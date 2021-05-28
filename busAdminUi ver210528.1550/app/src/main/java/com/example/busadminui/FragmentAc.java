package com.example.busadminui;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.triggertrap.seekarc.SeekArc;

public class FragmentAc extends Fragment {


    static boolean acOnoff = false;
    static float acProgress = 0.0f;
    static int acTempInt = 18;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton ac_btn_minus = view.findViewById(R.id.btn_ac_minus);
        ImageButton ac_btn_plus = view.findViewById(R.id.btn_ac_plus);
        ImageButton ac_btn_onoff = view.findViewById(R.id.btn_ac_onoff);
        SeekArc seekArkac = view.findViewById(R.id.seekArk_ac);
        TextView acTemp = view.findViewById(R.id.textView_ac_temp);

        //init
        ac_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
        if(!acOnoff){
            ac_btn_onoff.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
            ac_btn_plus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
            ac_btn_minus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
        }
        seekArkac.setProgress((int)acProgress);
        acTemp.setText(acTempInt+"°C");

        //클릭시 결과
        ac_btn_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ac_btn_minus.setImageResource(R.drawable.btn_minus);
                if(acOnoff){
                    if(acProgress > 12.5f){
                        acProgress = acProgress - 12.5f;
                        acTempInt = acTempInt - 1;
                    }
                    else {
                        acProgress = 0.0f;
                        acTempInt = 18;
                    }
                    seekArkac.setProgress((int)acProgress);
                    acTemp.setText(acTempInt+"°C");
                }
            }
        });
        ac_btn_minus.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(ac_btn_minus.getLeft(), ac_btn_minus.getTop(), ac_btn_minus.getRight(), ac_btn_minus.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        ac_btn_minus.setImageResource(R.drawable.btn_minus_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            ac_btn_minus.setImageResource(R.drawable.btn_minus);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        ac_btn_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ac_btn_plus.setImageResource(R.drawable.btn_plus);
                if(acOnoff){
                    if(acProgress < 100.0f - 12.5f){
                        acProgress = acProgress + 12.5f;
                        acTempInt = acTempInt + 1;
                    }
                    else {
                        acProgress = 100.0f;
                        acTempInt = 26;
                    }
                    seekArkac.setProgress((int)acProgress);
                    acTemp.setText(acTempInt+"°C");
                }
            }
        });
        ac_btn_plus.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(ac_btn_plus.getLeft(), ac_btn_plus.getTop(), ac_btn_plus.getRight(), ac_btn_plus.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        ac_btn_plus.setImageResource(R.drawable.btn_plus_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            ac_btn_plus.setImageResource(R.drawable.btn_plus);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        ac_btn_onoff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ac_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
                if(acOnoff){
                    ac_btn_onoff.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    ac_btn_plus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                    ac_btn_minus.setColorFilter(R.color.backGround1deep, PorterDuff.Mode.DST_IN);
                }
                else{
                    ac_btn_onoff.clearColorFilter();
                    ac_btn_plus.clearColorFilter();
                    ac_btn_minus.clearColorFilter();
                }
                acOnoff = !acOnoff;
            }
        });
        ac_btn_onoff.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(ac_btn_onoff.getLeft(), ac_btn_onoff.getTop(), ac_btn_onoff.getRight(), ac_btn_onoff.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        ac_btn_onoff.setImageResource(R.drawable.btn_onoff_on_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            ac_btn_onoff.setImageResource(R.drawable.btn_onoff_on);
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
