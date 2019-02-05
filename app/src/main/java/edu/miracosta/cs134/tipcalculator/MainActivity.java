package edu.miracosta.cs134.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Member variables for each component used in the app
    private EditText amountEditText;
    private TextView percentTextView;
    private TextView tipTextView;
    private TextView totalTextView;
    private SeekBar percentSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
