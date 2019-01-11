package com.example.simar.randomselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText UserInput;
    Button Submit;
    TextView result;
    String Input;
    String Result;
    String word;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserInput = findViewById(R.id.UserInput);
        Submit = findViewById(R.id.Choose);
        result = findViewById(R.id.Result);
        Input = UserInput.getText().toString();
        Result = "Your choice should be:";
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Random random = new Random();
            Input = UserInput.getText().toString();
            String[] List = Input.split(",");
            int num = random.nextInt(List.length);
            word = List[num];
            Result = "You should choose:";
            Result = Result + word;
            result.setText(Result);
            }

        });
    }
}
