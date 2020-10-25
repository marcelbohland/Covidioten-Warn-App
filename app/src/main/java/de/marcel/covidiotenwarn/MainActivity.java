package de.marcel.covidiotenwarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.der-postillon.com/"));
        startActivity(browserIntent);
    }
    public void openTest(View v){
        Intent intent = new Intent (this, Test.class);
        startActivity(intent);
    }
}