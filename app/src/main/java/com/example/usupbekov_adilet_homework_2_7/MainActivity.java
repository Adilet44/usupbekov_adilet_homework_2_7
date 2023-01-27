package com.example.usupbekov_adilet_homework_2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Double first,second , result;
    private Boolean isOperationClick;
    private String operation;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:

                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
                case R.id.btn_two:

                    if (textView.getText().toString().equals("0") || isOperationClick ){
                        textView.setText("2");
                    }else {
                        textView.append("2");
                    }
                    break;
            case R.id.btn_sre:
                if (textView.getText().toString().equals("0") || isOperationClick ){
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
                break;
                case R.id.btn_fwo:
                    if (textView.getText().toString().equals("0") || isOperationClick ){
                        textView.setText("4");
                    }else {
                        textView.append("4");
                    }
                    break;
                    case R.id.btn_fyf:

                        if (textView.getText().toString().equals("0") || isOperationClick ){
                            textView.setText("5");
                        }else {
                            textView.append("5");
                        }
                        break;
                        case R.id.btn_siks:
                            if (textView.getText().toString().equals("0") || isOperationClick ){
                                textView.setText("6");
                            }else {
                                textView.append("6");
                            }
                            break;
                            case R.id.btn_seven:
                                if (textView.getText().toString().equals("0") || isOperationClick ){
                                    textView.setText("7");
                                }else {
                                    textView.append("7");
                                }
                                break;
                                case R.id.btn_ech:
                                    if (textView.getText().toString().equals("0") || isOperationClick ){
                                        textView.setText("8");
                                    }else {
                                        textView.append("8");
                                    }
                                    break;
                                    case R.id.btn_nain:
                                        if (textView.getText().toString().equals("0") || isOperationClick ){
                                            textView.setText("9");
                                        }else {
                                            textView.append("9");
                                        }
                                        break;
                    case R.id.btn_clean:
                        textView.setText("0");
                        first = 0.0 ;
                        second = 0.0;
                        break;
        }
        isOperationClick = false;
    }

    public void onOperashinClick(View view) {
        switch (view.getId()){
            case R.id.btn_pluse:
                setFirstVar();
                operation = "+";
                break;
            case R.id.btn_minus:
                setFirstVar();
                operation = "-";
                break;
                case R.id.btn_multiplication:
                    setFirstVar();
                    operation = "*";
                    break;
                    case R.id.btn_delenia:
                        setFirstVar();
                        operation = "/";
                        break;

            case R.id.btn_equal:
               setSecondVar();
               Double result = Double.valueOf(0);
               textView.setText(result.toString());
               switch (operation){
            case "+":
                result = first+ second;
                textView.setText(result.toString());
                break;
                   case "-":
                       result = first- second;
                       textView.setText(result.toString());
                       break;
                   case "*":
                       result = first * second;
                       textView.setText(result.toString());
                       break;
                   case "/":
                       result = first / second;
                       textView.setText(result.toString());
                       break;
               }


        }
        isOperationClick = true;

    }
    public void setFirstVar() {
        first = Double.parseDouble(textView.getText().toString());   }
    public void setSecondVar(){
        second = Double.parseDouble(textView.getText().toString());
    }
}