package com.example.criptografie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Encoder extends AppCompatActivity {

    EditText etenc;
    TextView enctv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoder);


        etenc = findViewById(R.id.etenc);
        enctv = findViewById(R.id.enctv);

    }

    public void enc(View view){
        String temp = etenc.getText().toString();
        String rv = encode.enc(temp);
        enctv.setText(rv);
    }

    /**public void cp2(View view){
        String data = enctv.getText().toString().trim();
        if(!data.isEmpty()){
            ClipData temp = ClipData.newPlainText(label "text",data);

        }
    }*/

}