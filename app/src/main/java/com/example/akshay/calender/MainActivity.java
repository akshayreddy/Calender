package com.example.akshay.calender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText t;
    String store_info;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);


        calendarView.setOnDateChangeListener(new OnDateChangeListener() {


            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {


                t=(EditText) findViewById(R.id.textView);
                t.setText("");
                t.setVisibility(view.VISIBLE);

                //Toast.makeText(getApplicationContext(), "" + dayOfMonth, 0).show();// TODO Auto-generated method stub

            }
        });
    }

    public void onClick(View v){
        b=(Button) findViewById(R.id.button);
        if(v.getId()==R.id.button){
            t=(EditText) findViewById(R.id.textView);
            store_info=t.getText().toString();
            Toast.makeText(getApplicationContext(), "" + store_info, Toast.LENGTH_SHORT).show();

        }
    }
}

