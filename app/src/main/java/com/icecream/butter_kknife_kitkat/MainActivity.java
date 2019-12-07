package com.icecream.butter_kknife_kitkat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_title)
    TextView mainTitle;
    @BindView(R.id.sub_title)
    TextView subTitle;
    @BindView(R.id.blue_button)
    Button blueButton;
    @BindView(R.id.red_button)
    Button redButton;

    private int i = 1;
    private int j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.main_title)
    public void onViewClicked() {
        mainTitle.setText("" + ((i > j) ? "This is main title i" : "This is main title j"));
        j = (i > j) ? 1 : 0;
    }

    @OnClick({R.id.sub_title, R.id.blue_button, R.id.red_button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.sub_title:
                Toast.makeText(this, "Clicked sub title", Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue_button:
                Toast.makeText(this, "Clicked Button Blue", Toast.LENGTH_SHORT).show();
                break;
            case R.id.red_button:
                Toast.makeText(this, "Clicked Button Red", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}