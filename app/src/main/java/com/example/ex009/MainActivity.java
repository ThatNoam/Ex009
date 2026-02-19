package com.example.ex009;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    String text;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextNumber);
        btn = findViewById(R.id.button);
    }

    public void clicked(View view)
    {
        text = et.getText().toString();
        num = Integer.parseInt(text);

        if ((num % 7) == 0)
        {
            btn.setText("BOOM!");
            et.setText("");
        }

        else
        {
            btn.setText(text);
            et.setText("");
        }
    }

}