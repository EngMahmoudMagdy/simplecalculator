package com.example.android.samplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn0 ,btn1 ,btn2 ,btn3 ,btn4 ,btn5 ,btn6 ,btn7 ,btn8 ,btn9 ,btnPlus ,btnMinus ,btnEqual ,btnDiv ,btnMul ,btnDot ,btnClearall ,btndel ;
    double operand, eq , per , previous ;
    char operation ;
    TextView textPanel , opPanel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(this);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);
        btnMul = (Button)findViewById(R.id.btnMult);
        btnMul.setOnClickListener(this);
        btnDot = (Button)findViewById(R.id.buttondot);
        btnDot.setOnClickListener(this);
        btnClearall = (Button)findViewById(R.id.btnClearall);
        btnClearall.setOnClickListener(this);
        btndel = (Button)findViewById(R.id.btnDel);
        btndel.setOnClickListener(this);
        textPanel = (TextView)findViewById(R.id.textpanel);
        opPanel = (TextView)findViewById(R.id.op);
        operand = 0 ;
        eq = 0;
        previous=0;
        per = 1;
        operation = ' ';
    }

    void calculate ()
    {
        if(operation=='+')
        {
            previous =  previous + operand;
        }
        else if(operation=='-')
        {
            previous =  previous - operand ;
        }
        else if(operation=='*')
        {
            previous =  previous * operand ;
        }
        else if(operation=='/')
        {
            if(previous==0)
            {
                opPanel.setText(String.format("%c",'∞'));

            }
            else
            {
                previous = previous / operand;
            }
        }

        textPanel.setText(String.format("%f",previous));
        if(operation==' ')
        {
            textPanel.setText(String.format("%f",operand));
        }


    }
    @Override
    public void onClick(View view) {
        if(view == btn0 )
        {
            operand = operand *10 ;
            if(operand !=0)
            {
//                textPanel.setText( String.format("%f",operand));
                textPanel.setText(String.format("%s%d",textPanel.getText().toString(),0));
            }
        }
        else
        if(view == btn1 )
        {

            operand = operand *10 + 1*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btn2)
        {
            operand = operand *10 + 2*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btn3)
        {
            operand = operand *10 + 3*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btn4)
        {
            operand = operand *10 + 4*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }else
        if(view == btn5)
        {
            operand = operand *10 + 5*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btn6)
        {
            operand = operand *10 + 6*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btn7)
        {
            operand = operand *10 + 7*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btn8)
        {
            operand = operand *10 + 8*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btn9)
        {
            operand = operand *10 + 9*per ;
            per = Math.pow(per,2);
            textPanel.setText( String.format("%f",operand));
        }
        else
        if(view == btnPlus)
        {

            calculate();

            operation= '+' ;

            opPanel.setText(String.format("%c",operation));
            operand = 0 ;

        }
        else
        if(view == btnMinus)
        {

            calculate();
            operation= '-' ;
            opPanel.setText(String.format("%c",operation));
            operand = 0 ;


        }
        else
        if(view == btnMul)
        {
            calculate();
            operation= '*' ;
            opPanel.setText(String.format("%c",operation));
            operand = 0 ;

        }
        else
        if(view == btnDiv)
        {
            calculate();
            operation= '/' ;
            opPanel.setText(String.format("%c",operation));
            operand = 0 ;

        }
        else
        if(view == btnDot)
        {
            per = .1;

        }
        else
        if(view == btndel)
        {

            if(operand%1==0)
            {
                operand=(int)(operand/10); // just get the number after dividing by 10 //ex: 478/10 >> 47 only
            }
            else
            {
                int op2 = ((int)operand) ; // get the integer without fraction // ex: 75.486 >> op2 = 75
                double k = operand/ op2 , u = operand%1 , temp , newFrac;
                // k = the fraction of operand only //ex: 75.486 >> k = 75.486 / 75 = 0.486
                // u = the fraction but as integer //ex: 75.486 >> u  = 486

                temp = k / u ; // temp = 0.486 / 486 >> .001
                u = (int)(u/10);// u = 486 /10 in integer >> u = 48 only
                newFrac = u * temp*10; // the new fraction = 48 * .001 *10 >> 48 * .01 >> 0.48
                operand =  op2 + newFrac  ; // concatenate the number again
            }
            textPanel.setText(String.format("%f",operand)); // the new number

        }
        else
        if(view == btnClearall)
        {
            operand = 0 ;
            previous = 0 ;
            textPanel.setText(String.format("%f",operand)); // the new number
            opPanel.setText(" ");

        }
        else
        if(view == btnEqual)
        {
            calculate();
            per = 1 ;
            operand =0 ;
            /*operation = ' ';*/

        }



    }
}
