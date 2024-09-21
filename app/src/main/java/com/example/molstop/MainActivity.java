package com.example.molstop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView maiDatum = findViewById(R.id.datum);
        Calendar calendar = Calendar.getInstance();
        int ev = calendar.get(Calendar.YEAR);
        int honap = calendar.get(Calendar.MONTH)+1;
        int nap = calendar.get(Calendar.DAY_OF_MONTH);
        int ora = calendar.get(Calendar.HOUR);
        int perc = calendar.get(Calendar.MINUTE);
        int masodperc = calendar.get(Calendar.SECOND);

        String aktualisIdo = ev + "." + honap + "." + nap + ". " + ora + ":" + perc + ":" + masodperc;
        maiDatum.setText(aktualisIdo);

    }
}