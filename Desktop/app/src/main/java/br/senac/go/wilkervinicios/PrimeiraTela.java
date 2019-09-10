package br.senac.go.wilkervinicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);


        Button openBT = findViewById(R.id.button2);
        openBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CronogramaActivity.class);
                intent.putExtra("teste",R.id.textView6);
                startActivity(intent);
            }
        });

        Button openBT2 = findViewById(R.id.button);
        openBT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SobreActivity.class);
                startActivity(intent);
            }
        });
    }
}
