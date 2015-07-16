package com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.content.SyncStatusObserver;
import android.inputmethodservice.KeyboardView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


 public class MainActivity_BMI extends Activity {
    private EditText height = null;
    private EditText weight = null;
    private Button button2 = null;
    private Button button1 = null;
    private TextView show = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__bmi);

        Button button2=(Button)findViewById(R.id.btn2);
        Button button1=(Button)findViewById(R.id.btn);


        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        show=(TextView) findViewById(R.id.show);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //跳转第二个界面（第一个参数是Context，第二个参数是目标对象）
                Intent intent = new Intent(MainActivity_BMI.this, OtherActivity.class);//封装了Intent对象
                startActivity(intent);//启动Activity

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            double bmi = 0;

            public void onClick(View v) {

                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h / 10000);

                double final_resault = exchangeResault(bmi);
                if (bmi < 16) {

                    show.setText("体质指数：" + final_resault + "  " + "极度偏瘦");
                } else if (bmi >= 16 && bmi < 18.5) {

                    show.setText("体质指数：" + final_resault + "  " + "偏瘦");
                } else if (bmi >= 18.5 && bmi < 25) {

                    show.setText("体质指数：" + final_resault + "  " + "正常");
                } else if (bmi >= 25 && bmi < 30) {

                    show.setText("体质指数：" + final_resault + "  " + "偏胖");
                } else if (bmi >= 30 && bmi < 35) {

                    show.setText("体质指数：" + final_resault + "  " + "肥胖");
                } else if (bmi >= 35 && bmi < 40) {

                    show.setText("体质指数：" + final_resault + "  " + "重度肥胖");
                } else if (bmi > 40) {

                    show.setText("体质指数：" + final_resault + "  " + "极度肥胖");
                }
            }
        });
    }


    public double exchangeResault(double resault){
        double first =resault*100;
        double second = (int) first;

        double second_first = first-second;

        if(second_first>0.5){

            second++;
        }

        double jirguo = (double)second/100;
        return jirguo;

    }

}