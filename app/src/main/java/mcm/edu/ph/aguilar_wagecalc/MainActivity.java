package mcm.edu.ph.aguilar_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button calculate;
    EditText name, time;
    GetterSetter numbers=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate = findViewById(R.id.btnCalc);
        name = findViewById(R.id.inputName);
        time = findViewById(R.id.inputHours);


        calculate.setOnClickListener(v -> {
            numbers.setName(String.valueOf(name.getText()));
            numbers.setTime(Integer.parseInt(time.getText().toString()));

            Intent input = new Intent(MainActivity.this,ResultPage.class);
            input.putExtra("name",numbers.getName());
            input.putExtra("time",numbers.getTime());
            startActivity(input);
        });



        }
    }

