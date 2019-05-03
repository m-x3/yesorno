package com.examplcoue.mazen.yesorno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView quText;
    Button startBtn,yesBtn,noBtn;
    ArrayList<String> qu=new ArrayList<>();
    byte yes,no,i,st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quText=findViewById(R.id.quText);
        startBtn=findViewById(R.id.startBtn);
        yesBtn=findViewById(R.id.yesBtn);
        noBtn=findViewById(R.id.noBtn);

    }


    public void startBtn(View view) {
        st++;
        if (st<4) {
            i=0;
            yes=0;
            no=0;
            Collections.addAll(qu,"arabic","english","hebrew","french");
            quText.setText("Can you speak "+qu.get(i));
            yesBtn.setEnabled(true);
            noBtn.setEnabled(true);
        }
        else{
            finish();
        }
    }

    public void yesBtn(View view) {
        i++;
        yes++;
        Collections.shuffle(qu);
        if (i<4)
        {

            quText.setText("Can you speak "+qu.get(i));

        }
        else
        {
            Toast.makeText(this, "Yes is"+yes, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "No is"+no, Toast.LENGTH_SHORT).show();
            yesBtn.setEnabled(false);
            noBtn.setEnabled(false);
        }
    }

    public void noBtn(View view) {
        i++;
        no++;
        Collections.shuffle(qu);

        if (i<4)
        {

            quText.setText("Can you speak "+qu.get(i));


        }
        else
        {
            yesBtn.setEnabled(false);
            noBtn.setEnabled(false);
            Toast.makeText(this, "Yes is "+yes, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "No is "+no, Toast.LENGTH_SHORT).show();

        }
        
    }

}
