package com.example.sergio.joysticksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.erz.joysticklibrary.JoyStick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        JoyStick joyStick = (JoyStick) findViewById(R.id.joy1);
        TextView text = (TextView) findViewById(R.id.text);

        joyStick.setType(JoyStick.TYPE_2_AXIS_UP_DOWN);
//JoyStickListener Interface


//Set JoyStickListener
        joyStick.setListener((JoyStick.JoyStickListener) this);
//Set JoyStickListener
//        joyStick.onDown(text.setText(String.valueOf(joyStick.getDirection())));
//        joyStick.onMove
        Log.d("JOYS", "Valor Joystick:"+String.valueOf(joyStick.getAngle()));

    }
    public interface JoyStickListener {
        void onMove(JoyStick joyStick, double angle, double power, int direction);
        void onTap();
        void onDoubleTap();
    }


}
