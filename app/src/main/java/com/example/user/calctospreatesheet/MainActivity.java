package com.example.user.calctospreatesheet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {
    /*TODO TAGの参照先*/
    public final static String TAG = MainActivity.class.getSimpleName();
    Button mButton[];
    ArrayList<Integer> mButtonID = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//TODO int型に入れる
//TODO hashmapに入れることを検討する
//TODO 計算優先順位を検討する。より簡単、やりやすい方法を
//TODO 優先計算を検討する。
//TODO よりメモリの使わない方法を検討する

        final TextView inputResult = (TextView) findViewById(R.id.ResultView);
        /*ボタンIDを一応をint型配列で管理する*/
        /*拡張性を考慮すること！
        * 例えば、今後、ユーザーカスタマイズで　キーの増加減少を管理をどうすること*/
        /*mButtonID[]= {
                R.id.Button_0, R.id.Button_1,
                R.id.Button_2, R.id.Button_3,
                R.id.Button_4, R.id.Button_5,
                R.id.Button_6, R.id.Button_7,
                R.id.Button_8, R.id.Button_9,
                R.id.Button_0, R.id.Button_00
        };*/
        /*もう少しかっこい方法はないのかな？n*/


        mButtonID.add(R.id.Button_0);
        mButtonID.add(R.id.Button_1);
        mButtonID.add(R.id.Button_2);
        mButtonID.add(R.id.Button_3);
        mButtonID.add(R.id.Button_4);
        mButtonID.add(R.id.Button_5);
        mButtonID.add(R.id.Button_6);
        mButtonID.add(R.id.Button_7);
        mButtonID.add(R.id.Button_8);
        mButtonID.add(R.id.Button_9);
        mButtonID.add(R.id.Button_00);
        mButtonID.add(R.id.Button_addtion);
        mButtonID.add(R.id.Button_division);
        mButtonID.add(R.id.Button_Multiplication);
        mButtonID.add(R.id.Button_subtraction);
        mButtonID.add(R.id.Button_Point);

       /* int test = 93;
        Integer test1 = test;
        int test2 = test1.intValue();*/
        /*button を取り組むイベント生成*/
        for (int i = 0; i <= mButtonID.size(); i++) {
            /**/
//            int mButtonIDTmp = Integer.parseInt(mButtonID.get(i));
//
            int test = mButtonID.get(i).intValue();
            int test2=0;


//            mButton[i] = (Button) findViewById(mButtonID.get(i).intValue());

            /*ボタンのクリック処理*/
//            mButton[i].setOnClickListener(this);
        }


/*        findViewById(R.id.Button_1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean isFirst = false;

                String inputText = inputResult.getText().toString();

                if (!isFirst) {
                    inputResult.setText("1");
                }
                Log.d(TAG, "1");
            }
        });*/
        /*ここからが簡単なロジック処理*/
       /* Button B_1 = (Button) findViewById(R.id.Button_1);
        Button B_2 = (Button) findViewById(R.id.Button_2);
        Button B_3 = (Button) findViewById(R.id.Button_3);
        Button B_4 = (Button) findViewById(R.id.Button_4);
        Button B_5 = (Button) findViewById(R.id.Button_5);
        Button B_6 = (Button) findViewById(R.id.Button_6);
        Button B_7 = (Button) findViewById(R.id.Button_7);
        Button B_8 = (Button) findViewById(R.id.Button_8);
        Button B_9 = (Button) findViewById(R.id.Button_9);
        Button B_0 = (Button) findViewById(R.id.Button_0);
        Button B_Addtion = (Button) findViewById(R.id.Button_addtion);
        Button B_subtraction = (Button) findViewById(R.id.Button_subtraction);
        Button B_multiplication= (Button) findViewById(R.id.Button_Multiplication);
        Button B_division= (Button) findViewById(R.id.Button_division);*/
        //Button B_00 = (Button) findViewById(R.id.Button_00);

//


    }

    /*onClick処理*/
    public void onClick(View view) {
        for (int i = 0; i <= mButtonID.size(); i++) {

        }
    }

    /*最初の入力かどうかの処理*/
    private boolean isFirstInput() {
        boolean judge = false;
        TextView text = (TextView) findViewById(R.id.ResultView);
        if (text.getText() == "0") {
            judge = true;
        }

        return judge;
    }

}




