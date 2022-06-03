package mcm.edu.ph.aguilar_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    TextView name, type, totalWage, regWage, OTWage, time, OT;
    Button back;

    GetterSetter methods=new GetterSetter();
    Controller numbers=new Controller();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result_page);
        getSupportActionBar().hide();

        name = findViewById(R.id.outputName);
        type = findViewById(R.id.outputType);
        totalWage = findViewById(R.id.outputTotal);
        regWage = findViewById(R.id.outputReg);
        OTWage = findViewById(R.id.outputOT);
        time = findViewById(R.id.outputHours);
        OT = findViewById(R.id.outputOTT);


        //back button
        back = findViewById(R.id.btnBack);
        back.setOnClickListener(v -> {
            Intent back = new Intent(this, MainActivity.class);
            startActivity(back);
        });

        //intent
        Intent output = getIntent();
        String Name = output.getStringExtra("name");
        String Type = output.getStringExtra("type");
        int Time = output.getIntExtra("time",0);
        name.setText(Name);
        type.setText(Type);
        Controller.Calculator(Type, Time);
        Controller.Output(totalWage, regWage, OTWage, time, OT);

    }
}