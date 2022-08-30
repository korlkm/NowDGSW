package com.haker.nowdgsw5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout button1 = (LinearLayout) findViewById(R.id.button1);
        LinearLayout button2 = (LinearLayout) findViewById(R.id.button2);
        LinearLayout button3 = (LinearLayout) findViewById(R.id.button3);

        //시작 프레그먼트 지정

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "다음지도", Toast.LENGTH_SHORT).show();
                //프래그먼트 교체
                getFragmentManager().beginTransaction().replace(R.id.fragment_place, new Fragment1()).commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "즐겨찾기", Toast.LENGTH_SHORT).show();

                getFragmentManager().beginTransaction().replace(R.id.fragment_place, new Fragment2()).commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "주변맛집", Toast.LENGTH_SHORT).show();
                getFragmentManager().beginTransaction().replace(R.id.fragment_place, new Fragment3()).commit();
            }
        });

    }
}