package com.alejandrolora.seccion_04_realm_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alejandrolora.seccion_04_realm_lab.activities.AddEditCityActivity;

public class Intro extends AppCompatActivity {


    private View btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
//codigo para pasar de un layout a otra
        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(Intro.this,AddEditCityActivity.class);
                startActivity(intent);
            }
        });
        //aca termina :v
    }
}
