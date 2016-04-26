package com.sockfoxdesign.musicfortheblind;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private SoundPool sp;

    private int sound1Id;
    private int sound2Id;
    private int sound3Id;
    private int sound4Id;
    private int sound5Id;
    private int sound6Id;
    private int sound7Id;
    private int sound8Id;
    private int sound9Id;
    private int sound10Id;
    private int sound11Id;
    private int sound12Id;
    private int sound13Id;
    private int sound14Id;
    private int sound15Id;
    private int sound16Id;
    private int sound17Id;
    private int sound18Id;
    private int sound19Id;
    private int sound20Id;
    private int sound21Id;
    private int sound22Id;
    private int sound23Id;
    private int sound24Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp= new SoundPool(24,AudioManager.STREAM_MUSIC,0);

        //get pointers to buttons
        Button button1= (Button) findViewById(R.id.button1);
        Button button2= (Button) findViewById(R.id.button2);
        Button button3= (Button) findViewById(R.id.button3);
        Button button4= (Button) findViewById(R.id.button4);
        Button button5= (Button) findViewById(R.id.button5);
        Button button6= (Button) findViewById(R.id.button6);
        Button button7= (Button) findViewById(R.id.button7);
        Button button8= (Button) findViewById(R.id.button8);
        Button button9= (Button) findViewById(R.id.button9);
        Button button10= (Button) findViewById(R.id.button10);
        Button button11= (Button) findViewById(R.id.button11);
        Button button12= (Button) findViewById(R.id.button12);
        Button button13= (Button) findViewById(R.id.button13);
        Button button14= (Button) findViewById(R.id.button14);
        Button button15= (Button) findViewById(R.id.button15);
        Button button16= (Button) findViewById(R.id.button16);
        Button button17= (Button) findViewById(R.id.button17);
        Button button18= (Button) findViewById(R.id.button18);
        Button button19= (Button) findViewById(R.id.button19);
        Button button20= (Button) findViewById(R.id.button20);
        Button button21= (Button) findViewById(R.id.button21);
        Button button22= (Button) findViewById(R.id.button22);
        Button button23= (Button) findViewById(R.id.button23);
        Button button24= (Button) findViewById(R.id.button24);

        //load sound clips
        sound1Id= sp.load(this, R.raw.sound1, 1);
        sound2Id= sp.load(this, R.raw.sound2, 1);
        sound3Id= sp.load(this, R.raw.sound3, 1);
        sound4Id= sp.load(this, R.raw.sound4, 1);
        sound5Id= sp.load(this, R.raw.sound5, 1);
        sound6Id= sp.load(this, R.raw.sound6, 1);
        sound7Id= sp.load(this, R.raw.sound7, 1);
        sound8Id= sp.load(this, R.raw.sound8, 1);
        sound9Id= sp.load(this, R.raw.sound9, 1);
        sound10Id= sp.load(this, R.raw.sound10, 1);
        sound11Id= sp.load(this, R.raw.sound11, 1);
        sound12Id= sp.load(this, R.raw.sound12, 1);
        sound13Id= sp.load(this, R.raw.sound13, 1);
        sound14Id= sp.load(this, R.raw.sound14, 1);
        sound15Id= sp.load(this, R.raw.sound15, 1);
        sound16Id= sp.load(this, R.raw.sound16, 1);
        sound17Id= sp.load(this, R.raw.sound17, 1);
        sound18Id= sp.load(this, R.raw.sound18, 1);
        sound19Id= sp.load(this, R.raw.sound19, 1);
        sound20Id= sp.load(this, R.raw.sound20, 1);
        sound21Id= sp.load(this, R.raw.sound21, 1);
        sound22Id= sp.load(this, R.raw.sound22, 1);
        sound23Id= sp.load(this, R.raw.sound23, 1);
        sound24Id= sp.load(this, R.raw.sound24, 1);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1: sp.play(sound1Id, 1, 1, 0, 0, 1); break;
            case R.id.button2: sp.play(sound2Id, 1, 1, 0, 0, 1); break;
            case R.id.button3: sp.play(sound3Id, 1, 1, 0, 0, 1); break;
            case R.id.button4: sp.play(sound4Id, 1, 1, 0, 0, 1); break;
            case R.id.button5: sp.play(sound5Id, 1, 1, 0, 0, 1); break;
            case R.id.button6: sp.play(sound6Id, 1, 1, 0, 0, 1); break;
            case R.id.button7: sp.play(sound7Id, 1, 1, 0, 0, 1); break;
            case R.id.button8: sp.play(sound8Id, 1, 1, 0, 0, 1); break;
            case R.id.button9: sp.play(sound9Id, 1, 1, 0, 0, 1); break;
            case R.id.button10: sp.play(sound10Id, 1, 1, 0, 0, 1); break;
            case R.id.button11: sp.play(sound11Id, 1, 1, 0, 0, 1); break;
            case R.id.button12: sp.play(sound12Id, 1, 1, 0, 0, 1); break;
            case R.id.button13: sp.play(sound13Id, 1, 1, 0, 0, 1); break;
            case R.id.button14: sp.play(sound14Id, 1, 1, 0, 0, 1); break;
            case R.id.button15: sp.play(sound15Id, 1, 1, 0, 0, 1); break;
            case R.id.button16: sp.play(sound16Id, 1, 1, 0, 0, 1); break;
            case R.id.button17: sp.play(sound17Id, 1, 1, 0, 0, 1); break;
            case R.id.button18: sp.play(sound18Id, 1, 1, 0, 0, 1); break;
            case R.id.button19: sp.play(sound19Id, 1, 1, 0, 0, 1); break;
            case R.id.button20: sp.play(sound20Id, 1, 1, 0, 0, 1); break;
            case R.id.button21: sp.play(sound21Id, 1, 1, 0, 0, 1); break;
            case R.id.button22: sp.play(sound22Id, 1, 1, 0, 0, 1); break;
            case R.id.button23: sp.play(sound23Id, 1, 1, 0, 0, 1); break;
            case R.id.button24: sp.play(sound24Id, 1, 1, 0, 0, 1); break;
        }
    }

}
