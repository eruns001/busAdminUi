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

public class FragmentTable extends Fragment {

    static boolean tableSideOnOff1 = false;
    static boolean tableSideOnOff2 = false;
    static boolean tableSideOnOff3 = false;
    static boolean tableSideOnOff4 = false;
    static boolean tableSideOnOff5 = false;
    static boolean tableSideOnOff6 = false;
    static boolean tableMain = false;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_table, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        ImageButton table_btn_side_No1 = view.findViewById(R.id.btn_table_sidetable_No1);
        ImageButton table_btn_side_No2 = view.findViewById(R.id.btn_table_sidetable_No2);
        ImageButton table_btn_side_No3 = view.findViewById(R.id.btn_table_sidetable_No3);
        ImageButton table_btn_side_No4 = view.findViewById(R.id.btn_table_sidetable_No4);
        ImageButton table_btn_side_No5 = view.findViewById(R.id.btn_table_sidetable_No5);
        ImageButton table_btn_side_No6 = view.findViewById(R.id.btn_table_sidetable_No6);
        ImageButton table_btn_main = view.findViewById(R.id.btn_table_maintable);


        table_btn_side_No1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tableSideOnOff1){
                    table_btn_side_No1.setImageResource(R.drawable.btn_table_sidetable_off);
                }
                else{
                    table_btn_side_No1.setImageResource(R.drawable.btn_table_sidetable_on);
                }
                tableSideOnOff1 = !tableSideOnOff1;
            }
        });
        table_btn_side_No1.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(table_btn_side_No1.getLeft(), table_btn_side_No1.getTop(), table_btn_side_No1.getRight(), table_btn_side_No1.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(tableSideOnOff1){
                            table_btn_side_No1.setImageResource(R.drawable.btn_table_sidetable_on_td);
                        }
                        else{
                            table_btn_side_No1.setImageResource(R.drawable.btn_table_sidetable_off_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(tableSideOnOff1){
                                table_btn_side_No1.setImageResource(R.drawable.btn_table_sidetable_on);
                            }
                            else{
                                table_btn_side_No1.setImageResource(R.drawable.btn_table_sidetable_off);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        table_btn_side_No2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tableSideOnOff2){
                    table_btn_side_No2.setImageResource(R.drawable.btn_table_sidetable_off);
                }
                else{
                    table_btn_side_No2.setImageResource(R.drawable.btn_table_sidetable_on);
                }
                tableSideOnOff2 = !tableSideOnOff2;
            }
        });
        table_btn_side_No2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(table_btn_side_No2.getLeft(), table_btn_side_No2.getTop(), table_btn_side_No2.getRight(), table_btn_side_No2.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(tableSideOnOff2){
                            table_btn_side_No2.setImageResource(R.drawable.btn_table_sidetable_on_td);
                        }
                        else{
                            table_btn_side_No2.setImageResource(R.drawable.btn_table_sidetable_off_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(tableSideOnOff2){
                                table_btn_side_No2.setImageResource(R.drawable.btn_table_sidetable_on);
                            }
                            else{
                                table_btn_side_No2.setImageResource(R.drawable.btn_table_sidetable_off);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        table_btn_side_No3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tableSideOnOff3){
                    table_btn_side_No3.setImageResource(R.drawable.btn_table_sidetable_off);
                }
                else{
                    table_btn_side_No3.setImageResource(R.drawable.btn_table_sidetable_on);
                }
                tableSideOnOff3 = !tableSideOnOff3;
            }
        });
        table_btn_side_No3.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(table_btn_side_No3.getLeft(), table_btn_side_No3.getTop(), table_btn_side_No3.getRight(), table_btn_side_No3.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(tableSideOnOff3){
                            table_btn_side_No3.setImageResource(R.drawable.btn_table_sidetable_on_td);
                        }
                        else{
                            table_btn_side_No3.setImageResource(R.drawable.btn_table_sidetable_off_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(tableSideOnOff3){
                                table_btn_side_No3.setImageResource(R.drawable.btn_table_sidetable_on);
                            }
                            else{
                                table_btn_side_No3.setImageResource(R.drawable.btn_table_sidetable_off);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        table_btn_side_No4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tableSideOnOff4){
                    table_btn_side_No4.setImageResource(R.drawable.btn_table_sidetable_off);
                }
                else{
                    table_btn_side_No4.setImageResource(R.drawable.btn_table_sidetable_on);
                }
                tableSideOnOff4 = !tableSideOnOff4;
            }
        });
        table_btn_side_No4.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(table_btn_side_No4.getLeft(), table_btn_side_No4.getTop(), table_btn_side_No4.getRight(), table_btn_side_No4.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(tableSideOnOff4){
                            table_btn_side_No4.setImageResource(R.drawable.btn_table_sidetable_on_td);
                        }
                        else{
                            table_btn_side_No4.setImageResource(R.drawable.btn_table_sidetable_off_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(tableSideOnOff4){
                                table_btn_side_No4.setImageResource(R.drawable.btn_table_sidetable_on);
                            }
                            else{
                                table_btn_side_No4.setImageResource(R.drawable.btn_table_sidetable_off);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        table_btn_side_No5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tableSideOnOff5){
                    table_btn_side_No5.setImageResource(R.drawable.btn_table_sidetable_off);
                }
                else{
                    table_btn_side_No5.setImageResource(R.drawable.btn_table_sidetable_on);
                }
                tableSideOnOff5 = !tableSideOnOff5;
            }
        });
        table_btn_side_No5.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(table_btn_side_No5.getLeft(), table_btn_side_No5.getTop(), table_btn_side_No5.getRight(), table_btn_side_No5.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(tableSideOnOff5){
                            table_btn_side_No5.setImageResource(R.drawable.btn_table_sidetable_on_td);
                        }
                        else{
                            table_btn_side_No5.setImageResource(R.drawable.btn_table_sidetable_off_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(tableSideOnOff5){
                                table_btn_side_No5.setImageResource(R.drawable.btn_table_sidetable_on);
                            }
                            else{
                                table_btn_side_No5.setImageResource(R.drawable.btn_table_sidetable_off);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        table_btn_side_No6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tableSideOnOff6){
                    table_btn_side_No6.setImageResource(R.drawable.btn_table_sidetable_off);
                }
                else{
                    table_btn_side_No6.setImageResource(R.drawable.btn_table_sidetable_on);
                }
                tableSideOnOff6 = !tableSideOnOff6;
            }
        });
        table_btn_side_No6.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(table_btn_side_No6.getLeft(), table_btn_side_No6.getTop(), table_btn_side_No6.getRight(), table_btn_side_No6.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(tableSideOnOff6){
                            table_btn_side_No6.setImageResource(R.drawable.btn_table_sidetable_on_td);
                        }
                        else{
                            table_btn_side_No6.setImageResource(R.drawable.btn_table_sidetable_off_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(tableSideOnOff6){
                                table_btn_side_No6.setImageResource(R.drawable.btn_table_sidetable_on);
                            }
                            else{
                                table_btn_side_No6.setImageResource(R.drawable.btn_table_sidetable_off);
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP   :
                        break;
                }
                return false;
            }
        });

        table_btn_main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tableMain){
                    table_btn_main.setImageResource(R.drawable.btn_table_maintable_off);
                }
                else{
                    table_btn_main.setImageResource(R.drawable.btn_table_maintable_on);
                }
                tableMain = !tableMain;
            }
        });
        table_btn_main.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(table_btn_main.getLeft(), table_btn_main.getTop(), table_btn_main.getRight(), table_btn_main.getBottom());
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        if(tableMain){
                            table_btn_main.setImageResource(R.drawable.btn_table_maintable_on_td);
                        }
                        else{
                            table_btn_main.setImageResource(R.drawable.btn_table_maintable_off_td);
                        }
                        break;
                    case MotionEvent.ACTION_MOVE  :
                        if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                            if(tableMain){
                                table_btn_main.setImageResource(R.drawable.btn_table_maintable_on);
                            }
                            else{
                                table_btn_main.setImageResource(R.drawable.btn_table_maintable_off);
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
}
