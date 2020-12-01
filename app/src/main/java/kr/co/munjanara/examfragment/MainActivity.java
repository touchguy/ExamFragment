package kr.co.munjanara.examfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ColorLisstFragment.OnColorSelectedListener {

    private ColorFragment mColorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorFragment = (ColorFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_color);
    }

    @Override
    public void onColorSelected(int color) {
        mColorFragment.setColor(color);
    }
}