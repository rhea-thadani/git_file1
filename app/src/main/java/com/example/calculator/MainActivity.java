package com.example.calculator;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub,
            mul, div, clear, equal;
    EditText disp;
    int op1, op2;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        equal = (Button) findViewById(R.id.equal);
        clear = (Button) findViewById(R.id.clear);
        disp = (EditText) findViewById(R.id.disp);

        try {
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            clear.setOnClickListener(this);
            equal.setOnClickListener(this);
        } catch (Exception e) {

        }
    }

    public void onClick(View arg0) {
        Editable str = disp.getText();
        switch (arg0.getId()) {
            case R.id.one:
                str = str.append(one.getText());
                disp.setText(str);
                break;
            case R.id.two:
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.three:
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.four:
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.five:
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.six:
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.seven:
                str = str.append(seven.getText());
                disp.setText(str);
                break;
            case R.id.eight:
                str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.nine:
                str = str.append(nine.getText());
                disp.setText(str);
                break;
            case R.id.zero:
                str = str.append(zero.getText());
                disp.setText(str);
                break;
            case R.id.add:
                op = "+";
                op1 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                break;
            case R.id.sub:
                op = "-";
                op1 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                break;
            case R.id.mul:
                op = "*";
                op1 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                break;
            case R.id.div:
                op = "/";
                op1 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                break;
            case R.id.clear:
                op1 = 0;
                op2 = 0;
                disp.setText("");
                break;
            case R.id.equal:
                if (op.equals("+")) {
                    op2 = Integer.parseInt(disp.getText().toString());
                    op1 = op1 + op2;
                    disp.setText(Integer.toString(op1));
                } else if (op.equals("-")) {
                    op2 = Integer.parseInt(disp.getText().toString());
                    op1 = op1 - op2;
                    disp.setText(Integer.toString(op1));
                } else if (op.equals("*")) {
                    op2 = Integer.parseInt(disp.getText().toString());
                    op1 = op1 * op2;
                    disp.setText(Integer.toString(op1));
                } else if (op.equals("/")) {
                    op2 = Integer.parseInt(disp.getText().toString());
                    op1 = op1 / op2;
                    disp.setText(Integer.toString(op1));
                }

        }
    }

}