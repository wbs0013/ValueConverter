package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText fahrenheit, celsius, kilometers, miles, liters, gallons, kilograms, pounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahrenheit = findViewById(R.id.fahrenheit);
        celsius = findViewById(R.id.celsius);

        kilometers = findViewById(R.id.kilometers);
        miles = findViewById(R.id.miles);

        liters = findViewById(R.id.liters);
        gallons = findViewById(R.id.gallons);

        kilograms = findViewById(R.id.kilograms);
        pounds = findViewById(R.id.pounds);

        fahrenheit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (fahrenheit.hasFocus() && fahrenheit.length() > 0 && !(s.toString().equals("-"))) {
                    double f = Double.parseDouble(fahrenheit.getText().toString());
                    double c = (f - 32) * 0.5556;
                    DecimalFormat df = new DecimalFormat("##.##");
                    celsius.setText(df.format(c));

                }

                if (fahrenheit.hasFocus() && (fahrenheit.getText().toString().equals(""))) {
                    celsius.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        celsius.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (celsius.hasFocus() && celsius.length() > 0 && !(s.toString().equals("-"))) {
                    double c = Double.parseDouble(celsius.getText().toString());
                    double f = (c * 9/5) + 32;
                    DecimalFormat df = new DecimalFormat("##.##");
                    fahrenheit.setText(df.format(f));

                }

                if (celsius.hasFocus() && (celsius.getText().toString().equals(""))) {
                    fahrenheit.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        kilometers.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (kilometers.hasFocus() && kilometers.length() > 0 && !(s.toString().equals("-"))) {
                    double km = Double.parseDouble(kilometers.getText().toString());
                    double m = km / 1.609;
                    DecimalFormat df = new DecimalFormat("##.##");
                    miles.setText(df.format(m));

                }

                if (kilometers.hasFocus() && (kilometers.getText().toString().equals(""))) {
                    miles.setText("");
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        miles.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (miles.hasFocus() && miles.length() > 0 && !(s.toString().equals("-"))) {
                    double m = Double.parseDouble(miles.getText().toString());
                    double km = m * 1.609;
                    DecimalFormat df = new DecimalFormat("##.##");
                    kilometers.setText(df.format(km));

                }

                if (miles.hasFocus() && (miles.getText().toString().equals(""))) {
                    kilometers.setText("");
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        liters.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (liters.hasFocus() && liters.length() > 0 && !(s.toString().equals("-"))) {
                    double l = Double.parseDouble(liters.getText().toString());
                    double g = l / 3.785;
                    DecimalFormat df = new DecimalFormat("##.##");
                    gallons.setText(df.format(g));

                }

                if (liters.hasFocus() && (liters.getText().toString().equals(""))) {
                    gallons.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        gallons.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (gallons.hasFocus() && gallons.length() > 0 && !(s.toString().equals("-"))) {
                    double g = Double.parseDouble(gallons.getText().toString());
                    double l = g * 3.785;
                    DecimalFormat df = new DecimalFormat("##.##");
                    liters.setText(df.format(l));
                }

                if (gallons.hasFocus() && (gallons.getText().toString().equals(""))) {
                    liters.setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        kilograms.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (kilograms.hasFocus() && kilograms.length() > 0 && !(s.toString().equals("-"))) {
                    double kg = Double.parseDouble(kilograms.getText().toString());
                    double lb = kg * 2.205;
                    DecimalFormat df = new DecimalFormat("##.##");
                    pounds.setText(df.format(lb));

                }

                if (kilograms.hasFocus() && (kilograms.getText().toString().equals(""))) {
                    pounds.setText("");
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        pounds.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (pounds.hasFocus() && pounds.length() > 0 && !(s.toString().equals("-"))) {
                    double lb = Double.parseDouble(pounds.getText().toString());
                    double kg = lb / 2.205;
                    DecimalFormat df = new DecimalFormat("##.##");
                    kilograms.setText(df.format(kg));

                }

                if (pounds.hasFocus() && (pounds.getText().toString().equals(""))) {
                    kilograms.setText("");
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
