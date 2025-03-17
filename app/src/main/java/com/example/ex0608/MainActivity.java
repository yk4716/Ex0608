package com.example.ex0608;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
TextView tV1up, tV1down, tV2up, tV2down, tV3up, tV3down;
EditText eT1, eT2, eT3;
ImageView iV1, iV2, iV3;
Button btnNew;
LinearLayout lL2, lL3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        tV1up = findViewById(R.id.tV1up);
        tV1down = findViewById(R.id.tV1down);
        tV2up = findViewById(R.id.tV2up);
        tV2down = findViewById(R.id.tV2down);
        tV3up = findViewById(R.id.tV3up);
        tV3down = findViewById(R.id.tV3down);
    }

public void stage01(View view){

}
}