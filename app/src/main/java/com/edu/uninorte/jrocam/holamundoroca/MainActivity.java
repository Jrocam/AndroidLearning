package com.edu.uninorte.jrocam.holamundoroca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nota1,nota2,nota3,nota4;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        nota1 = (EditText) findViewById(R.id.nota1Text);
        nota2 = (EditText) findViewById(R.id.nota2Text);
        nota3 = (EditText) findViewById(R.id.nota3Text);
        nota4 = (EditText) findViewById(R.id.nota4Text);
    }


    public void onClickButton(View view) {
        float nFinal=0;
        //Convertir a Float
        String nota1Str = nota1.getText().toString();
        String nota2Str = nota2.getText().toString();
        String nota3Str = nota3.getText().toString();
        String nota4Str = nota4.getText().toString();


        if(nota1Str.isEmpty() || nota2Str.isEmpty() || nota3Str.isEmpty() || nota4Str.isEmpty() ){
            // 0 0 0 0 #1
            if (nota1Str.isEmpty() && nota2Str.isEmpty() && nota3Str.isEmpty() && nota4Str.isEmpty()){
                float nota1F = (float) 3.8;
                float nota2F = (float) 3.8;
                float nota3F = (float) 3.8;
                float nota4F = (float) 3.8;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 1 0 0 0 #2
            if (!nota1Str.isEmpty() && nota2Str.isEmpty() && nota3Str.isEmpty() && nota4Str.isEmpty()){

                float nota1F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota1F ) / 3;
                float nota2F = x;
                float nota3F = x;
                float nota4F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));

            }
            // 0 1 0 0 #3
            if (nota1Str.isEmpty() && !nota2Str.isEmpty() && nota3Str.isEmpty() && nota4Str.isEmpty()){

                float nota2F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota2F ) / 3;
                float nota1F = x;
                float nota3F = x;
                float nota4F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));

            }
            // 0 0 1 0 #4
            if (nota1Str.isEmpty() && nota2Str.isEmpty() && !nota3Str.isEmpty() && nota4Str.isEmpty()){

                float nota3F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota3F ) / 3;
                float nota1F = x;
                float nota2F = x;
                float nota4F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));

            }
            // 0 0 0 1 #5
            if (nota1Str.isEmpty() && nota2Str.isEmpty() && nota3Str.isEmpty() && !nota4Str.isEmpty()){
                float nota4F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota4F ) / 3;
                float nota2F = x;
                float nota3F = x;
                float nota1F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));

            }
            // 1 1 0 0 #6
            if (!nota1Str.isEmpty() && !nota2Str.isEmpty() && nota3Str.isEmpty() && nota4Str.isEmpty()){
                float nota1F = Float.parseFloat(nota1Str);
                float nota2F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota1F - nota2F ) / 2;

                float nota3F = x;
                float nota4F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));

            }
            // 1 0 1 0 #7
            if (!nota1Str.isEmpty() && nota2Str.isEmpty() && !nota3Str.isEmpty() && nota4Str.isEmpty()){
                float nota1F = Float.parseFloat(nota1Str);
                float nota3F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota1F - nota3F ) / 2;

                float nota2F = x;
                float nota4F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 1 0 0 1 #8
            if (!nota1Str.isEmpty() && nota2Str.isEmpty() && nota3Str.isEmpty() && !nota4Str.isEmpty()){
                float nota1F = Float.parseFloat(nota1Str);
                float nota4F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota1F - nota4F ) / 2;

                float nota3F = x;
                float nota2F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 0 1 1 0 #9
            if (nota1Str.isEmpty() && !nota2Str.isEmpty() && !nota3Str.isEmpty() && nota4Str.isEmpty()){
                float nota2F = Float.parseFloat(nota1Str);
                float nota3F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota2F - nota3F ) / 2;

                float nota1F = x;
                float nota4F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 0 1 0 1 #10
            if (nota1Str.isEmpty() && !nota2Str.isEmpty() && nota3Str.isEmpty() && !nota4Str.isEmpty()){
                float nota2F = Float.parseFloat(nota1Str);
                float nota4F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota2F - nota4F ) / 2;

                float nota1F = x;
                float nota3F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 0 0 1 1 #11
            if (nota1Str.isEmpty() && nota2Str.isEmpty() && !nota3Str.isEmpty() && !nota4Str.isEmpty()){
                float nota3F = Float.parseFloat(nota1Str);
                float nota4F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota3F - nota4F ) / 2;

                float nota1F = x;
                float nota2F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 1 1 1 0 #12
            if (!nota1Str.isEmpty() && !nota2Str.isEmpty() && !nota3Str.isEmpty() && nota4Str.isEmpty()){
                float nota1F = Float.parseFloat(nota1Str);
                float nota2F = Float.parseFloat(nota1Str);
                float nota3F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota1F - nota2F - nota3F ) / 1;

                float nota4F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            //1 1 0 1 #13
            if (!nota1Str.isEmpty() && !nota2Str.isEmpty() && nota3Str.isEmpty() && !nota4Str.isEmpty()){
                float nota1F = Float.parseFloat(nota1Str);
                float nota2F = Float.parseFloat(nota1Str);
                float nota4F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota1F - nota2F - nota4F ) / 1;

                float nota3F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 1 0 1 1 #14
            if (!nota1Str.isEmpty() && nota2Str.isEmpty() && !nota3Str.isEmpty() && !nota4Str.isEmpty()){
                float nota1F = Float.parseFloat(nota1Str);
                float nota3F = Float.parseFloat(nota1Str);
                float nota4F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota1F - nota3F - nota4F ) / 1;

                float nota2F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
            // 0 1 1 1 #15
            if (nota1Str.isEmpty() && !nota2Str.isEmpty() && !nota3Str.isEmpty() && !nota4Str.isEmpty()){
                float nota2F = Float.parseFloat(nota1Str);
                float nota3F = Float.parseFloat(nota1Str);
                float nota4F = Float.parseFloat(nota1Str);
                float x = ( ((float) 3.8*4) - nota2F - nota3F - nota4F ) / 1;

                float nota1F = x;

                nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

                nota1.setText(String.valueOf(nota1F));
                nota2.setText(String.valueOf(nota2F));
                nota3.setText(String.valueOf(nota3F));
                nota4.setText(String.valueOf(nota4F));
            }
        }else{ // 1 1 1 1 #16
            float nota1F = Float.parseFloat(nota1Str);
            float nota2F = Float.parseFloat(nota2Str);
            float nota3F = Float.parseFloat(nota3Str);
            float nota4F = Float.parseFloat(nota4Str);

            nFinal = (nota1F+nota2F+nota3F+nota4F)/4;

        }


        textView.setText(String.valueOf(nFinal));
    }
}
