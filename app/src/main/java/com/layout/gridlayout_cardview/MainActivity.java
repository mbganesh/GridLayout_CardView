package com.layout.gridlayout_cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void item1(View view) {
        Toast.makeText(this,"You Selected Item 1" , Toast.LENGTH_SHORT).show();
    }

    // you can also implement your own methods....
}
