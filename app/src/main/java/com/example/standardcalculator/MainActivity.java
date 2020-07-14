package com.example.standardcalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private int objectLength = 20;
    private TextView textView1 ;
    private TextView textView2;
    private GridLayout gridLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                textView1 =((TextView) findViewById(R.id.textView1));
                textView2 = ((TextView) findViewById(R.id.textView2));
                gridLayout1 = ((GridLayout) findViewById(R.id.gridLayout));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
       textView1.setHeight(height/8);
       textView2.setHeight(height/5);
        height = (int) ((height-(height/8)-(height/5))/6.1);
        width = width/4;
        System.out.println(width);
     buttonDetection(height,width);
    }
    private void buttonDetection(int heigth,int width) {
        Button buttons[] = new Button[objectLength];
        buttons[0] = (Button)findViewById(R.id.button5);
        buttons[1] = (Button)findViewById(R.id.button6);
        buttons[2] = (Button)findViewById(R.id.button7);
        buttons[3] = (Button)findViewById(R.id.button8);
        buttons[4] = (Button)findViewById(R.id.button9);
        buttons[5] = (Button)findViewById(R.id.button10);
        buttons[6] = (Button)findViewById(R.id.button11);
        buttons[7] = (Button)findViewById(R.id.button12);
        buttons[8] = (Button)findViewById(R.id.button13);
        buttons[9] = (Button)findViewById(R.id.button14);
        buttons[10] = (Button)findViewById(R.id.button15);
        buttons[11] = (Button)findViewById(R.id.button16);
        buttons[12] = (Button)findViewById(R.id.button17);
        buttons[13] = (Button)findViewById(R.id.button18);
        buttons[14] = (Button)findViewById(R.id.button19);
        buttons[15] = (Button)findViewById(R.id.button20);
        buttons[16] = (Button)findViewById(R.id.button21);
        buttons[17] = (Button)findViewById(R.id.button22);
        buttons[18] = (Button)findViewById(R.id.button23);
        buttons[19] = (Button)findViewById(R.id.button24);
        for (int i=0;i<=19;i++){
         buttons[i].setWidth(width);
         buttons[i].setHeight(heigth);
        }
    }
}
//ekrangenis = 400
//dikey 660