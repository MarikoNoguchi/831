package edu.mnstate.cw3967me.a831;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mGreeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGreeting = (TextView) findViewById(R.id.lblGreeting);

        mGreeting.setText(R.string.greeting);
    }
}
