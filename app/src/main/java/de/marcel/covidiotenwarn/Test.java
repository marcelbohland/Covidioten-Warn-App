package de.marcel.covidiotenwarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
    public void open1(View v){
        Intent intent = new Intent (this, testResult_1.class);
        startActivity(intent);
    }
    public void open2(View v){
        Intent intent = new Intent (this, testResult_2.class);
        startActivity(intent);
    }
}