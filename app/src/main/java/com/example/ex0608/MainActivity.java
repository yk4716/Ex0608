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

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView tV1up, tV1down, tV2up, tV2down, tV3up, tV3down;
EditText eT1, eT2, eT3;
ImageView iV1, iV2, iV3;
Button btnNew;
LinearLayout lL2, lL3;

    Random random = new Random();
    int num1Stage1, num2Stage1;
    int correctAnswerStage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        startGame();
    }


    private void initViews(){
        tV1up = findViewById(R.id.tV1up);
        tV1down = findViewById(R.id.tV1down);
        tV2up = findViewById(R.id.tV2up);
        tV2down = findViewById(R.id.tV2down);
        tV3up = findViewById(R.id.tV3up);
        tV3down = findViewById(R.id.tV3down);
        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);
        iV1 = findViewById(R.id.iV1);
        iV2 = findViewById(R.id.iV2);
        iV3 = findViewById(R.id.iV3);
        btnNew = findViewById(R.id.btnNew);
        lL2 = findViewById(R.id.lL2);
        lL3 = findViewById(R.id.lL3);
        lL2.setVisibility(View.GONE);
        lL3.setVisibility(View.GONE);
    }

private void startGame() {
    num1Stage1 = random.nextInt(90) + 10;
    num2Stage1 = random.nextInt(90) + 10;
    correctAnswerStage1 = num1Stage1 + num2Stage1;

    tV1up.setText(String.valueOf(num1Stage1));
    tV1down.setText(String.valueOf(num2Stage1));

    eT1.setText("");
    iV1.setImageResource(0);
}
public void stage01(View view){
    String answerStr = eT1.getText().toString();

    if (!answerStr.isEmpty()) {
        int playerAnswer = Integer.parseInt(answerStr);

        if (playerAnswer == correctAnswerStage1) {
            iV1.setImageResource(android.R.drawable.checkbox_on_background);
        } else {
            iV1.setImageResource(android.R.drawable.ic_delete);
        }
    }
}

public void stage02(View view){
}

public void stage03(View view){
}

}