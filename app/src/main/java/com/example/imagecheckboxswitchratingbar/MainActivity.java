package com.example.imagecheckboxswitchratingbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Switch switch1;
    Button button;

    CheckBox cbYes;
    CheckBox cbNo;

    RatingBar ratingBar;

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        switch1=findViewById(R.id.switch1);
        button=findViewById(R.id.button);
        cbYes=findViewById(R.id.cbYes);
        cbNo=findViewById(R.id.cbNo);
        ratingBar=findViewById(R.id.ratingBar);
        imageView=findViewById(R.id.imageView);
        button.setOnClickListener(this);

        cbYes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


                Log.d("mytag",compoundButton.getText().toString());
                Log.d("mytag",""+b);
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                Log.d("mytag",""+ratingBar.getRating());
                Log.d("mytag",""+v);

            }
        });

        ratingBar.setRating(2.0f);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.button)
        {
            Log.d("mytag","OnClick");

            Log.d("mytag",""+switch1.isChecked());
            Log.d("mytag",""+switch1.isChecked());
            Log.d("mytag","Yes => "+cbYes.isChecked());
            Log.d("mytag","No => "+cbNo.isChecked());
            Log.d("mytag",""+ratingBar.getRating());

            //imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background,null));
            imageView.setVisibility(View.INVISIBLE);
        }

    }
}