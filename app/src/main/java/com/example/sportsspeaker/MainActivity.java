package com.example.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton imgboxing, imgkickBoxing, imgJudo , imgKarate , imgAikido, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAikido =findViewById(R.id.imgAikido);
        imgboxing=findViewById(R.id.imgBoxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate=findViewById(R.id.imgKarate);
        imgkickBoxing=findViewById(R.id.imgKickBoxing);
        imgTaekwondo=findViewById(R.id.imgTaekwondo);

        imgAikido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);
        imgkickBoxing.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgboxing.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View imageButtonView) {

        switch (imageButtonView.getId()){
            case R.id.imgAikido:
                playSportName(imgAikido.getTag().toString());

                break;
            case R.id.imgBoxing:
                playSportName(imgboxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                playSportName(imgkickBoxing.getTag().toString());

                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgTaekwondo:
                playSportName(imgTaekwondo.getTag().toString());
                break;
        }

    }

    private void playSportName(String sportName){
        MediaPlayer sportPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(sportName,"raw",getPackageName()));
        sportPlayer.start();

    }
}