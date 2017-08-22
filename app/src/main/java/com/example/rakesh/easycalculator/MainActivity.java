package com.example.rakesh.easycalculator;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual,rateBtn;

    EditText edt1;
    String str="";
    String exp="";
    public String historystr="";
    StringBuffer historybody;
    RatingBar rateBar;
    TextView showtext,rateText,showhistory;
    float mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rateBar = (RatingBar) findViewById(R.id.rateBar);
        rateBtn =(Button) findViewById(R.id.rateBtn);
        showhistory= (TextView) findViewById(R.id.historyid);
        rateText =(TextView) findViewById(R.id.rateTv);
        button0 = (Button) findViewById(R.id.buttonZero);
        button1 = (Button) findViewById(R.id.buttonOne);
        button2 = (Button) findViewById(R.id.buttonTwo);
        button3 = (Button) findViewById(R.id.buttonThree);
        button4 = (Button) findViewById(R.id.buttonFour);
        button5 = (Button) findViewById(R.id.buttonFive);
        button6 = (Button) findViewById(R.id.buttonSix);
        button7 = (Button) findViewById(R.id.buttonSeven);
        button8 = (Button) findViewById(R.id.buttonEight);
        button9 = (Button) findViewById(R.id.buttonNine);
        button10 = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSubtract);
        buttonMul = (Button) findViewById(R.id.buttonMultiply);
        buttonDivision = (Button) findViewById(R.id.buttonDivide);
        buttonC = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        edt1 = (EditText) findViewById(R.id.editText);
        showtext =(TextView) findViewById(R.id.infoTextView);
        historybody = new StringBuffer();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
                exp +="1";
                showtext.append("1");
                historybody.append("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
                showtext.append("2");
                exp +="2";
                historybody.append("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
                showtext.append("3");
                exp +="3";
                historybody.append("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
                showtext.append("4");
                exp +="4";
                historybody.append("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
                showtext.append("5");
                exp +="5";
                historybody.append("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
                exp +="6";
                showtext.append("6");
                historybody.append("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
                exp +="7";
                showtext.append("7");
                historybody.append("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
                showtext.append("8");
                exp +="8";
                historybody.append("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
                exp +="9";
                showtext.append("9");
                historybody.append("9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
                showtext.append("0");
                exp +="0";
                historybody.append("0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mValueOne = Float.parseFloat(exp + "");
                    mAddition = true;
                    showtext.append("+");
                    historybody.append("+");
                    edt1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true;
                showtext.append("-");
                edt1.setText(null);
                historybody.append("-");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true;
                showtext.append("*");
                historybody.append("*");
                edt1.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mDivision = true;
                showtext.append("/");
                historybody.append("/");
                edt1.setText(null);

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt1.getText() + "");


                if (mAddition == true) {

                    edt1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    edt1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    edt1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    edt1.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                str +="\r\n";
                str +="-> ";
                str += showtext.getText().toString();
                showtext.setText("");
                //historybody.append("\r\n");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+ ".");
                exp +=".";
                showtext.append(".");
                historybody.append(".");
                edt1.setText(null);
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.history:

                Intent intent1 =new Intent();
                intent1.setClass(MainActivity.this,Historyactivity.class);
                intent1.putExtra("historystr",str);
                startActivity(intent1);
                //startActivity(new Intent(this,Historyactivity.class));
                break;

            case R.id.Rateus:
                try {
                    final Dialog d = new Dialog(MainActivity.this);
                    d.setContentView(R.layout.activity_rateus);

                    rateBar = (RatingBar) d.findViewById(R.id.rateBar);

                    rateText = (TextView) d.findViewById(R.id.rateTv);

                    rateBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                        @Override
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            String rateVal = Float.toString(rateBar.getRating());
                            rateText.setText("rating : " + rateVal);
                        }
                    });

                    rateBtn = (Button) d.findViewById(R.id.rateBtn);

                    rateBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            d.dismiss();
                        }
                    });

                    d.show();
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Sorry User", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.aboutus:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(String.format("%1$s", getString(R.string.app_name)));
                builder.setMessage("This is a simple calculator which calculate the some basic Math's Function.");
                builder.setPositiveButton("OK", null);
                builder.setIcon(R.drawable.calc_icon);
                AlertDialog welcomeAlert = builder.create();
                welcomeAlert.show();
                break;
        }
        return true;
    }

}