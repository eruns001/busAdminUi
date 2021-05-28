package com.example.busadminui;

import android.graphics.Rect;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {


    static Integer naviIndex = 1;
    static boolean mainIsVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View viewMain = findViewById(R.id.include_main);
        //viewMain.setLayoutDirection(R.layout.fragment_ac);
        //Button testbtn = (Button) findViewById(R.id.btn_view_light);


        ImageButton toLight = findViewById(R.id.btn_view_light);
        ImageButton toAc = findViewById(R.id.btn_view_ac);
        ImageButton toDisplay = findViewById(R.id.btn_view_display);
        ImageButton toTable = findViewById(R.id.btn_view_table);

        ImageButton mainLight = findViewById(R.id.btn_main_light);
        ImageButton mainAc = findViewById(R.id.btn_main_ac);
        ImageButton mainDisplay = findViewById(R.id.btn_main_display);
        ImageButton mainTable = findViewById(R.id.btn_main_table);
        TextClock mainClock = findViewById(R.id.text_main_clock);


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.fragment_test, new FragmentAc());
        toAc.setBackgroundResource(R.drawable.btn_side_onclick);
        toAc.setImageResource(R.drawable.btn_side_ac_oc);
        fragmentTransaction.commit();

        //main화면
        View flMain = findViewById(R.id.content_main);
        flMain.setVisibility(View.VISIBLE);
        mainLight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 0;
                flMain.setVisibility(View.GONE);
                mainIsVisible = false;
                toLightFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_onclick);
                toLight.setImageResource(R.drawable.btn_side_light_oc);
                toAc.setBackgroundResource(R.drawable.btn_side_clickoff);
                toAc.setImageResource(R.drawable.btn_side_ac_bsc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_clickoff);
                toDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                toTable.setBackgroundResource(R.drawable.btn_side_clickoff);
                toTable.setImageResource(R.drawable.btn_side_table_bsc);
            }
        });
        mainLight.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(mainLight.getLeft(), mainLight.getTop(), mainLight.getRight(), mainLight.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        mainLight.setImageResource(R.drawable.btn_side_light_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            mainLight.setImageResource(R.drawable.btn_side_light_bsc);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });
        mainAc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 1;
                flMain.setVisibility(View.GONE);
                mainIsVisible = false;
                toAcFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_clickoff);
                toLight.setImageResource(R.drawable.btn_side_light_bsc);
                toAc.setBackgroundResource(R.drawable.btn_side_onclick);
                toAc.setImageResource(R.drawable.btn_side_ac_oc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_clickoff);
                toDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                toTable.setBackgroundResource(R.drawable.btn_side_clickoff);
                toTable.setImageResource(R.drawable.btn_side_table_bsc);
            }
        });
        mainAc.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(mainAc.getLeft(), mainAc.getTop(), mainAc.getRight(), mainAc.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        mainAc.setImageResource(R.drawable.btn_side_ac_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            mainAc.setImageResource(R.drawable.btn_side_ac_bsc);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });
        mainDisplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 2;
                flMain.setVisibility(View.GONE);
                mainIsVisible = false;
                toDisplayFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_clickoff);
                toLight.setImageResource(R.drawable.btn_side_light_bsc);
                toAc.setBackgroundResource(R.drawable.btn_side_clickoff);
                toAc.setImageResource(R.drawable.btn_side_ac_bsc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_onclick);
                toDisplay.setImageResource(R.drawable.btn_side_display_oc);
                toTable.setBackgroundResource(R.drawable.btn_side_clickoff);
                toTable.setImageResource(R.drawable.btn_side_table_bsc);
            }
        });
        mainDisplay.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(mainDisplay.getLeft(), mainDisplay.getTop(), mainDisplay.getRight(), mainDisplay.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        mainDisplay.setImageResource(R.drawable.btn_side_display_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            mainDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });
        mainTable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 3;
                flMain.setVisibility(View.GONE);
                mainIsVisible = false;
                toTableFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_clickoff);
                toLight.setImageResource(R.drawable.btn_side_light_bsc);
                toAc.setBackgroundResource(R.drawable.btn_side_clickoff);
                toAc.setImageResource(R.drawable.btn_side_ac_bsc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_clickoff);
                toDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                toTable.setBackgroundResource(R.drawable.btn_side_onclick);
                toTable.setImageResource(R.drawable.btn_side_table_oc);
            }
        });
        mainTable.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(mainTable.getLeft(), mainTable.getTop(), mainTable.getRight(), mainTable.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        mainTable.setImageResource(R.drawable.btn_side_table_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            mainTable.setImageResource(R.drawable.btn_side_table_bsc);
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });



        //1deepth 화면
        toLight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 0;
                toLightFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_onclick);
                toLight.setImageResource(R.drawable.btn_side_light_oc);
                toAc.setBackgroundResource(R.drawable.btn_side_clickoff);
                toAc.setImageResource(R.drawable.btn_side_ac_bsc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_clickoff);
                toDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                toTable.setBackgroundResource(R.drawable.btn_side_clickoff);
                toTable.setImageResource(R.drawable.btn_side_table_bsc);
            }
        });
        toLight.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(toLight.getLeft(), toLight.getTop(), toLight.getRight(), toLight.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        toLight.setImageResource(R.drawable.btn_side_light_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(naviIndex == 0){
                                toLight.setImageResource(R.drawable.btn_side_light_oc);
                            }
                            else {
                                toLight.setImageResource(R.drawable.btn_side_light_bsc);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        toAc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 1;
                toAcFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_clickoff);
                toLight.setImageResource(R.drawable.btn_side_light_bsc);
                toAc.setBackgroundResource(R.drawable.btn_side_onclick);
                toAc.setImageResource(R.drawable.btn_side_ac_oc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_clickoff);
                toDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                toTable.setBackgroundResource(R.drawable.btn_side_clickoff);
                toTable.setImageResource(R.drawable.btn_side_table_bsc);
            }
        });
        toAc.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(toAc.getLeft(), toAc.getTop(), toAc.getRight(), toAc.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        toAc.setImageResource(R.drawable.btn_side_ac_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(naviIndex == 1){
                                toAc.setImageResource(R.drawable.btn_side_ac_oc);
                            }
                            else {
                                toAc.setImageResource(R.drawable.btn_side_ac_bsc);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        toDisplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 2;
                toDisplayFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_clickoff);
                toLight.setImageResource(R.drawable.btn_side_light_bsc);
                toAc.setBackgroundResource(R.drawable.btn_side_clickoff);
                toAc.setImageResource(R.drawable.btn_side_ac_bsc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_onclick);
                toDisplay.setImageResource(R.drawable.btn_side_display_oc);
                toTable.setBackgroundResource(R.drawable.btn_side_clickoff);
                toTable.setImageResource(R.drawable.btn_side_table_bsc);
            }
        });
        toDisplay.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(toDisplay.getLeft(), toDisplay.getTop(), toDisplay.getRight(), toDisplay.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        toDisplay.setImageResource(R.drawable.btn_side_display_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(naviIndex == 2){
                                toDisplay.setImageResource(R.drawable.btn_side_display_oc);
                            }
                            else {
                                toDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        toTable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                naviIndex = 3;
                toTableFragment();
                toLight.setBackgroundResource(R.drawable.btn_side_clickoff);
                toLight.setImageResource(R.drawable.btn_side_light_bsc);
                toAc.setBackgroundResource(R.drawable.btn_side_clickoff);
                toAc.setImageResource(R.drawable.btn_side_ac_bsc);
                toDisplay.setBackgroundResource(R.drawable.btn_side_clickoff);
                toDisplay.setImageResource(R.drawable.btn_side_display_bsc);
                toTable.setBackgroundResource(R.drawable.btn_side_onclick);
                toTable.setImageResource(R.drawable.btn_side_table_oc);
            }
        });
        toTable.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(toTable.getLeft(), toTable.getTop(), toTable.getRight(), toTable.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        toTable.setImageResource(R.drawable.btn_side_table_td);
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(naviIndex == 3){
                                toTable.setImageResource(R.drawable.btn_side_table_oc);
                            }
                            else {
                                toTable.setImageResource(R.drawable.btn_side_table_bsc);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toLightFragment() {
        Fragment fr = new FragmentLight();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_test, fr);
        fragmentTransaction.commit();
    }
    public void toAcFragment() {
        Fragment fr = new FragmentAc();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_test, fr);
        fragmentTransaction.commit();
    }
    public void toDisplayFragment() {
        //이거 고치면 Roof, Beam 바꿀 수 있음
        Fragment fr = new FragmentDisplayRoof();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_test, fr);
        fragmentTransaction.commit();
    }
    public void toTableFragment() {
        Fragment fr = new FragmentTable();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_test, fr);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        if(mainIsVisible){
            super.onBackPressed();
        }
        else {
            findViewById(R.id.content_main).setVisibility(View.VISIBLE);
            mainIsVisible = true;
        }
    }
}