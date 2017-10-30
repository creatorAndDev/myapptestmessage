package yuri.kl.com.ua.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("HI!");
        textView.setTextSize(44);
        textView.setTextColor(Color.RED);

//        setContentView(R.layout.activity_main);
        setContentView(textView);
    }
}
