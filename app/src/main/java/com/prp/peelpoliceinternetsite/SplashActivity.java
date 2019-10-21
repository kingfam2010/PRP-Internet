package com.prp.peelpoliceinternetsite;

/*
 * Created by Dan Kral #2775 on 16-OCT-2019
 * Test App for the PRP issued Samsung Android phone work profile
 */
 
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}