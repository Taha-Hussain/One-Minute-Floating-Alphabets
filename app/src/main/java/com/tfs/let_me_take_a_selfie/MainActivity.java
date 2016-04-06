package com.tfs.let_me_take_a_selfie;

import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView MyTextView,Counter_TextView;
    ImageView a_ImageView,b_ImageView,c_ImageView,d_ImageView,e_ImageView,f_ImageView,g_ImageView;
    TextToSpeech MyAlphabets;
    int count_a,count_b,count_c,count_d,count_e,count_f,count_g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyAlphabets=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    MyAlphabets.setLanguage(Locale.UK);
                }
            }
        });

        MyTextView = (TextView) findViewById(R.id.MyTextView);
        Counter_TextView = (TextView) findViewById(R.id.Counter_TextView);

        a_ImageView = (ImageView) findViewById(R.id.a_ImageView);
        b_ImageView = (ImageView) findViewById(R.id.b_ImageView);
        c_ImageView = (ImageView) findViewById(R.id.c_ImageView);
        d_ImageView = (ImageView) findViewById(R.id.d_ImageView);
        e_ImageView = (ImageView) findViewById(R.id.e_ImageView);
        f_ImageView = (ImageView) findViewById(R.id.f_ImageView);
        g_ImageView = (ImageView) findViewById(R.id.g_ImageView);


        new CountDownTimer(60000, 100) {

            public void onTick(long millisUntilFinished) {


                a_ImageView.setX(millisUntilFinished/100);
                a_ImageView.setY(0);

                b_ImageView.setX(0);
                b_ImageView.setY(millisUntilFinished/70);

                c_ImageView.setX(250);
                c_ImageView.setY(millisUntilFinished/70);

                d_ImageView.setX(millisUntilFinished/100);
                d_ImageView.setY(700);

                e_ImageView.setX(millisUntilFinished/120);
                e_ImageView.setY(millisUntilFinished/260);

                f_ImageView.setX(millisUntilFinished/150);
                f_ImageView.setY(300);

                g_ImageView.setX(millisUntilFinished/200);
                g_ImageView.setY(millisUntilFinished/100);


                MyTextView.setText(""+ millisUntilFinished / 1000);
                // implement whatever you want for every tick
            }

            public void onFinish() {
                MyTextView.setVisibility(View.GONE);

                a_ImageView.setVisibility(View.GONE);
                b_ImageView.setVisibility(View.GONE);
                c_ImageView.setVisibility(View.GONE);
                d_ImageView.setVisibility(View.GONE);
                e_ImageView.setVisibility(View.GONE);
                f_ImageView.setVisibility(View.GONE);
                g_ImageView.setVisibility(View.GONE);

                Counter_TextView.setText(" A = "+count_a+"\n B = "+ count_b+"\n C = "+ count_c+"\n D = "+ count_d+"\n E = "+ count_e +"\n F = "+ count_f +"\n G = "+ count_g);

            }
        }.start();
    }

    public void Alphabet_click(View view) {
        switch (view.getId()) {
            case R.id.a_ImageView:
//                Toast.makeText(MainActivity.this, "A is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("A", TextToSpeech.QUEUE_FLUSH, null);
                count_a++;
                break;

            case R.id.b_ImageView:
//                Toast.makeText(MainActivity.this, "B is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("B", TextToSpeech.QUEUE_FLUSH, null);
                count_b++;
                break;

            case R.id.c_ImageView:
//                Toast.makeText(MainActivity.this, "C is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("C", TextToSpeech.QUEUE_FLUSH, null);
                count_c++;
                break;

            case R.id.d_ImageView:
//                Toast.makeText(MainActivity.this, "D is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("D", TextToSpeech.QUEUE_FLUSH, null);
                count_d++;
                break;

            case R.id.e_ImageView:
//                Toast.makeText(MainActivity.this, "E is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("E", TextToSpeech.QUEUE_FLUSH, null);
                count_e++;
                break;

            case R.id.f_ImageView:
//                Toast.makeText(MainActivity.this, "F is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("F", TextToSpeech.QUEUE_FLUSH, null);
                count_f++;
                break;

            case R.id.g_ImageView:
//                Toast.makeText(MainActivity.this, "F is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("G", TextToSpeech.QUEUE_FLUSH, null);
                count_e++;
                break;

        }
    }

}
