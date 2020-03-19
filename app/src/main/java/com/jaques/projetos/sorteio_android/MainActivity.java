package com.jaques.projetos.sorteio_android;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view){
          TextView text = findViewById(R.id.text_play);
          int number = new Random().nextInt(11);
          String textSelection = "O número selelecionado foi: ";
          text.setText(textSelection+number);
    }
}

