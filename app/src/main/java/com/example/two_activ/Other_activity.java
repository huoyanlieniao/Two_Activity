package com.example.two_activ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Other_activity extends AppCompatActivity {

    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_activity);
        Intent intent=getIntent();
        str=intent.getStringExtra("message");
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void wentback(View view) {
        Intent intent=getIntent();
        if(str.equals("0")){
            intent.putExtra("result","正确");
        }else{
            intent.putExtra("result","错误");
        }
        setResult(0,intent);
        finish();
    }
}
