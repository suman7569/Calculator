package com.appdevelopersumankr.calci;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    AppCompatButton zero, one, two, three, four, five, six, seven, eight, nine, equal, dot, add, minus, mul, div, cut, clear;

    private double first;
    private double second;
    private double result;
    private String answer;
    private String operation;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        editText1 = findViewById ( R.id.edittextid1 );//in which we enter value
        editText2 = findViewById ( R.id.edittextid2 );

        //number id started
        zero = findViewById ( R.id.zeroid );
        one = findViewById ( R.id.one );
        two = findViewById ( R.id.two );
        three = findViewById ( R.id.three );
        four = findViewById ( R.id.four );
        five = findViewById ( R.id.five );
        six = findViewById ( R.id.six );
        seven = findViewById ( R.id.seven );
        eight = findViewById ( R.id.eight );
        nine = findViewById ( R.id.nine );

        //function is started from here
        equal = findViewById ( R.id.equalid );
        dot = findViewById ( R.id.dotid );
        add = findViewById ( R.id.addid );
        minus = findViewById ( R.id.subtractid );
        mul = findViewById ( R.id.multiplyid );
        div = findViewById ( R.id.divideid );
        cut = findViewById ( R.id.cutid );
        clear = findViewById ( R.id.clearid );


        //END

        clear.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                editText1.setText ( null );
                editText2.setText ( null );
            }
        } );
        zero.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + zero.getText ().toString ();
                editText2.setText ( text );
            }
        } );

        one.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + one.getText ().toString ();
                editText2.setText ( text );
            }
        } );

        two.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + two.getText ().toString ();
                editText2.setText ( text );
            }
        } );

        three.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + three.getText ().toString ();
                editText2.setText ( text );
            }
        } );

        four.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + four.getText ().toString ();
                editText2.setText ( text );
            }
        } );

        five.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + five.getText ().toString ();
                editText2.setText ( text );
            }
        } );

        six.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + six.getText ().toString ();
                editText2.setText ( text );
            }
        } );
        seven.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + seven.getText ().toString ();
                editText2.setText ( text );
            }
        } );
        eight.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + eight.getText ().toString ();
                editText2.setText ( text );
            }
        } );
        nine.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + nine.getText ().toString ();
                editText2.setText ( text );
            }
        } );
        dot.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String text;
                text = editText2.getText ().toString () + dot.getText ().toString ();
                editText2.setText ( text );
            }
        } );

        cut.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String backspace = null;
                if (editText2.getText ().length () > 0) {
                    StringBuilder stringBuilder = new StringBuilder ( editText2.getText () );
                    stringBuilder.deleteCharAt ( editText2.getText ().length () - 1 );
                    backspace = stringBuilder.toString ();
                    editText2.setText ( backspace );
                }
            }
        } );


        add.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String temp;
                first = Double.parseDouble ( String.valueOf ( editText2.getText () ) );
                temp = String.format ( "%.2f", first );
                editText1.setText ( temp );
                editText2.setText ("");
                operation = "+";
            }
        } );

        minus.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String temp;
                first = Double.parseDouble ( String.valueOf ( editText2.getText () ) );
                temp = String.format ( "%.2f", first );
                editText1.setText ( temp );
                editText2.setText ( "" );
                operation = "-";
            }
        } );

        mul.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String temp;
                first = Double.parseDouble ( String.valueOf ( editText2.getText () ) );
                temp = String.format ( "%.2f", first );
                editText1.setText ( temp );
                editText2.setText ( "" );
                operation = "*";
            }
        } );

        div.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String temp;
                first = Double.parseDouble ( String.valueOf ( editText2.getText () ) );
                temp = String.format ( "%.2f", first );
                editText1.setText ( temp );
                editText2.setText ( "" );
                operation = "/";
            }
        } );


        equal.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                try {
                    second = Double.parseDouble ( String.valueOf ( editText2.getText () ) );

                } catch (NumberFormatException e) {

                }

                if (editText2.getText ().toString ().isEmpty ())
                    if (operation == "+") {
                        result = first + second;
                        answer = String.format ( "%.2f", result );
                        editText2.setText ( answer );
                        editText1.setText ( null );
                    }
                if (operation == "-") {
                    result = first - second;
                    answer = String.format ( "%.2f", result );
                    editText2.setText ( answer );
                    editText1.setText ( null );
                }
                if (operation == "*") {
                    result = first * second;
                    answer = String.format ( "%.2f", result );
                    editText2.setText ( answer );
                    editText1.setText ( null );
                }
                if (operation == "/") {
                    result = first / second;
                    answer = String.format ( "%.2f", result );
                    editText2.setText ( answer );
                    editText1.setText ( null );
                }


            }
        } );

    }

}











