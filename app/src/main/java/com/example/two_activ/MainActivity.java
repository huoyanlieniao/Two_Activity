package com.example.two_activ;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wentsecond(View view) {
        Intent intent=new Intent(MainActivity.this,Other_activity.class);
        String str=((EditText)findViewById(R.id.text)).getText().toString();
        System.out.println(str);
        intent.putExtra("message",str);
        startActivityForResult(intent,0);
    }

    @Override
    public void onActivityResult(int requstCode, int resultCode, Intent data) {
        super.onActivityResult(requstCode, resultCode, data);
        if(requstCode==0&&resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }



    }
}
