package com.example.arcgauge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ProgressBar progress_tem, progress_hum, progress_air;
    TextView text_view_tem, text_view_hum, text_view_air;
    double num_tem = 42, num_hum = 66.2, num_air = 14.5;
    LineChart mpLineChart;

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

        mpLineChart = (LineChart) findViewById(R.id.lineChart);
        LineDataSet lineDataSet1 = new LineDataSet(dataValues1(), "Air Quality");
        LineDataSet lineDataSet2 = new LineDataSet(dataValues2(), "Temperature");
        LineDataSet lineDataSet3 = new LineDataSet(dataValues3(), "Humidity");
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);
        dataSets.add(lineDataSet2);
        dataSets.add(lineDataSet3);

        LineData data = new LineData(dataSets);
        mpLineChart.setData(data);
        mpLineChart.invalidate();
        Description description = new Description();
        description.setText("");
        mpLineChart.setDescription(description);

    }

    private ArrayList<Entry> dataValues1() {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(5, 10));
        dataVals.add(new Entry(10, 11));
        dataVals.add(new Entry(15, 12));
        dataVals.add(new Entry(20, 13));
        dataVals.add(new Entry(25, 14));
        dataVals.add(new Entry(30, 15));
        dataVals.add(new Entry(35, 16));
        dataVals.add(new Entry(40, 17));
        dataVals.add(new Entry(45, 18));
        dataVals.add(new Entry(50, 19));
        return dataVals;
    }

    private ArrayList<Entry> dataValues2() {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(5, 20));
        dataVals.add(new Entry(10, 21));
        dataVals.add(new Entry(15, 22));
        dataVals.add(new Entry(20, 23));
        dataVals.add(new Entry(25, 24));
        dataVals.add(new Entry(30, 25));
        dataVals.add(new Entry(35, 26));
        dataVals.add(new Entry(40, 27));
        dataVals.add(new Entry(45, 28));
        dataVals.add(new Entry(50, 29));
        return dataVals;
    }

    private ArrayList<Entry> dataValues3() {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(5, 30));
        dataVals.add(new Entry(10, 31));
        dataVals.add(new Entry(15, 32));
        dataVals.add(new Entry(20, 33));
        dataVals.add(new Entry(25, 34));
        dataVals.add(new Entry(30, 35));
        dataVals.add(new Entry(35, 36));
        dataVals.add(new Entry(40, 37));
        dataVals.add(new Entry(45, 38));
        dataVals.add(new Entry(50, 39));
        return dataVals;
    }
}