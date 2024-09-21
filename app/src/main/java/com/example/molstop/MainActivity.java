package com.example.molstop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button beerkezesGomb = findViewById(R.id.beerkezesBtn);
        TextView beerkezes = findViewById(R.id.beerkezesDatum);
        TextView kilepes = findViewById(R.id.kilepesDatum);
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

        beerkezesGomb.setOnClickListener(view -> {
            Calendar calendar1 = Calendar.getInstance();
            int bOra = calendar1.get(Calendar.HOUR);
            int bPerc = calendar1.get(Calendar.MINUTE);
            String beerkezesiIdo = bOra + ":" + bPerc;
            beerkezes.setText(beerkezesiIdo);
            int kOra = calendar1.get(Calendar.HOUR)+8;
            String kilepesIdo = kOra + ":" + bPerc;
            kilepes.setText(kilepesIdo);
        });

    }
}