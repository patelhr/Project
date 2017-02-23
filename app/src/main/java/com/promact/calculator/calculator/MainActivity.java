package com.promact.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float firstVal,secondVal;
    boolean fadd,fsub,fdiv,fmul;
    TextView number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four =(Button)findViewById(R.id.four);
        Button five=(Button)findViewById(R.id.five);
        Button six=(Button)findViewById(R.id.six);
        Button seven=(Button)findViewById(R.id.seven);
        Button eight=(Button)findViewById(R.id.eight);
        Button nine=(Button)findViewById(R.id.nine);
        Button zero=(Button)findViewById(R.id.zero);
        Button addition=(Button)findViewById(R.id.addition);
        Button subtraction=(Button)findViewById(R.id.subtraction);
        Button multiplication=(Button)findViewById(R.id.multiplication);
        Button division=(Button)findViewById(R.id.division);
        Button equal=(Button)findViewById(R.id.equal);
        Button clear=(Button)findViewById(R.id.clear);
        number=(TextView)findViewById(R.id.numberText);
        TextView result=(TextView)findViewById(R.id.resultText);
        one.setOnClickListener(new View.OnClickListener() {
             public   void onClick(View v)
             {
                 number.setText(number.getText()+"1");
             }
        });
        two.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText(number.getText()+"0");
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v)
            {
                if(number==null)
                    number.setText(" ");
                else
                {
                    firstVal=Float.parseFloat(number.getText()+"");
                    fadd = true;

                }
                number.setText(null);
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                if(number==null)
                    number.setText(" ");
                else
                {
                    firstVal=Float.parseFloat(number.getText()+"");
                    fsub = true;

                }
                number.setText(null);
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                if(number==null)
                    number.setText(" ");
                else
                {
                    firstVal=Float.parseFloat(number.getText()+"");
                    fmul = true;

                }
                number.setText(null);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                if(number==null)
                    number.setText(" ");
                else
                {
                    firstVal=Float.parseFloat(number.getText()+"");
                    fdiv = true;

                }
                number.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                secondVal=Float.parseFloat(number.getText()+"");
                if(fadd==true)
                {
                    number.setText(firstVal+secondVal+"");
                    fadd=false;
                }
                if(fsub==true)
                {
                    number.setText(firstVal-secondVal+"");
                    fsub=false;
                }
                if(fmul==true)
                {
                    number.setText(firstVal*secondVal+"");
                    fmul=false;
                }
                if(fdiv==true)
                {
                    number.setText(firstVal/secondVal+"");
                    fdiv=false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v)
            {
                number.setText("");
            }
        });
   }
}
