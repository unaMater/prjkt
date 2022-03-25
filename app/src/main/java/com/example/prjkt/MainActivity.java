package com.example.prjkt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int zhmyak = 0;
    int boom = 0;
    TextView h2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h2 = findViewById(R.id.textView2);
    }

    public void onMyButtonClick(View view) {

        TextView hi = findViewById(R.id.textView);
        hi.setText("Не надо тут тыкать!!! Уже " + ++zhmyak + " раз тыкаешь!");
    }



    public void onMyButtonClick3(View view) {
        if(boom>0)
        {
            boom--;
            h2.setText(Integer.toString(boom));
        }

    }

    public void onMyButtonClick2(View view) {
        boom++;
        h2.setText(Integer.toString(boom));
    }

    public void knopka(View view) {
        EditText a = findViewById(R.id.editTextNumberSigned);
        String stroka = a.getText().toString();
        String result = "";
        for(int i = stroka.length()-1; i>=0; i--)
        {
            result = result+stroka.charAt(i);
        }
        a.setText(result);
    }
}