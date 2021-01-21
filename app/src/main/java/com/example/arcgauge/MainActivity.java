package com.example.arcgauge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progress_tem, progress_hum, progress_air;
    TextView text_view_tem, text_view_hum, text_view_air;
    EditText editText2;
    Button button;
    double num_tem = 42, num_hum = 66.2, num_air = 14.5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress_tem = findViewById(R.id.progress_tem);
        progress_hum = findViewById(R.id.progress_hum);
        progress_air = findViewById(R.id.progress_air);
        text_view_tem = findViewById(R.id.text_view_tem);
        text_view_hum = findViewById(R.id.text_view_hum);
        text_view_air = findViewById(R.id.text_view_air);
        progress_tem.setProgress((int)num_tem);
        progress_hum.setProgress((int)num_hum);
        progress_air.setProgress((int)num_air);
        text_view_tem.setText(Double.toString(num_tem) + " độ C");
        text_view_hum.setText(Double.toString(num_hum) + " %");
        text_view_air.setText(Double.toString(num_air) + " pmm");
    }

    public void getData(View view) {

    }
}