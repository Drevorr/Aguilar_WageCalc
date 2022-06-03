package mcm.edu.ph.aguilar_wagecalc;

import android.annotation.SuppressLint;
import android.widget.TextView;

public class Controller { static GetterSetter variable = new GetterSetter();

    public static void Calculator(String type, int time) {
        //regular hours
        if(time <= 8) {
            variable.setTime(time);
            variable.setOTWage(0);
            variable.setOT(0);
            switch (type) {
                case "Regular":
                    variable.setRegWage(variable.getTime()*100);
                    break;
                case "Probationary":
                    variable.setRegWage(variable.getTime()*90);
                    break;
                case "Part-time":
                    variable.setRegWage(variable.getTime()*75);
            }
            variable.setTotalWage(variable.getRegWage());
        } else {
            //Overtime
            variable.setTime(time);
            variable.setOT(time - 8);
            switch (type) {
                case "Regular":
                    variable.setOTWage(variable.getOT()*115);
                    variable.setRegWage(800);
                    break;
                case "Probationary":
                    variable.setOTWage(variable.getOT()*100);
                    variable.setRegWage(720);
                    break;
                case "Part-time":
                    variable.setOTWage(variable.getOT()*90);
                    variable.setRegWage(600);
            }
            variable.setTotalWage(variable.getOTWage() + variable.getRegWage());
        }
    }

    @SuppressLint("SetTextI18n")
    public static void Output(TextView wageOutput, TextView regOutput, TextView OTwageOutput, TextView timeOutput, TextView OTOutput) {
        wageOutput.setText(Integer.toString(variable.getTotalWage()));
        regOutput.setText(Integer.toString(variable.getRegWage()));
        OTwageOutput.setText(Integer.toString(variable.getOTWage()));
        timeOutput.setText(Integer.toString(variable.getTime()));
        OTOutput.setText(Integer.toString(variable.getOT()));
    }
}
