package com.example.standardcalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    ButtonFunctions buttonFunctions = new ButtonFunctions();
    private String data;
    private int objectLength = 20,counter=0,negcounter=0;
   public TextView textView1 ;
    private TextView textView2;
    private GridLayout gridLayout1;
    public MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            mainActivity = new MainActivity();
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
        buttonClick(buttons);
    }
    public void buttonClick(final Button buttons[]){
        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("");
            }
        });
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter==0){
                    textView1.setText( buttonFunctions.percent(textView2.getText()));
                    textView2.setText(textView2.getText()+"%");
                }
                else {
                    textView1.setText(buttonFunctions.percent(textView1.getText()));
                    textView2.setText(textView2.getText());
                }
            }
        });
        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length = textView2.getText().length();
                int number = textView2.getText().length()-1;
                String store;
                if(length>0) {
                    StringBuilder back = new StringBuilder(textView2.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textView2.setText(store);
                }
            }
        });
        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( buttonFunctions.operatorsCheck(textView2.getText())==false){
                    textView2.setText(textView2.getText());
                }
                else {
                    textView2.setText(textView2.getText()+"/");
                }
            }
        });
            buttons[4].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    counter=0;
                   data = buttonFunctions.textviewControl(textView2.getText(),"7");
                    textView2.setText(data);
                }
            });
        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"8");
                textView2.setText(data);
            }
        });
        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"9");
                textView2.setText(data);
            }
        });
        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( buttonFunctions.operatorsCheck(textView2.getText())==false){
                    textView2.setText(textView2.getText());
                }
                else {
                    counter++;
                    textView2.setText(textView2.getText()+"X");
                }
            }
        });
        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"4");
                textView2.setText(data);
            }
        });
        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"5");
                textView2.setText(data);
            }
        });
        buttons[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"6");
                textView2.setText(data);
            }
        });
        buttons[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( buttonFunctions.operatorsCheck(textView2.getText())==false){
                    textView2.setText(textView2.getText());
                }
                else {
                    textView2.setText(textView2.getText()+"-");
                    negcounter++;
                }
            }
        });
        buttons[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"1");
                textView2.setText(data);
            }
        });
        buttons[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"2");
                textView2.setText(data);
            }
        });
        buttons[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"3");
                textView2.setText(data);
            }
        });
        buttons[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( buttonFunctions.operatorsCheck(textView2.getText())==false){
                    textView2.setText(textView2.getText());
                }
                else{
                    textView2.setText(textView2.getText()+"+");
                }
            }
        });
        buttons[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("-"+textView2.getText());
            }
        });
        buttons[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = buttonFunctions.textviewControl(textView2.getText(),"0");
                textView2.setText(data);
            }
        });
        buttons[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText(textView2.getText()+".");
            }
        });
        buttons[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView2.getText().toString().contains("X")){
                  textView1.setText(  buttonFunctions.multiply(textView2.getText()));
                  textView2.setText("");
                }
                else if (textView2.getText().toString().contains("/")){
                    textView1.setText(buttonFunctions.division(textView2.getText()));
                    textView2.setText("");
                }
                else if (textView2.getText().toString().contains("+")){
                    textView1.setText(buttonFunctions.add(textView2.getText()));
                    textView2.setText("");
                }
                else if(textView2.getText().toString().contains("-")){
                    textView1.setText(buttonFunctions.sub(textView2.getText(),negcounter));
                    textView2.setText("");
                    negcounter = 0;
                }
            }
        });
    }
}
//Screenwidth = 400
//ScreenHeigth 660