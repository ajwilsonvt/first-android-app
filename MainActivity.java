package com.example.company.appname;

// These packages were imported by default by Android Studio
// A library in Java is a set of packages
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// The following packages were imported by you
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* onCreate is implemented by default in Android Studio
        when a Blank Activity is created. Everything below was
        created by you (following instructions from
        http://www.instructables.com/id/How-To-Create-An-Android
            -App-With-Android-Studio/) */

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }

    private void goToSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
