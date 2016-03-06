package com.example.administrator.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private MultiAutoCompleteTextView autoCompleteTextView2;
    private String[] res = {"beijing",
                            "beijing1",
                            "bejing2",
                            "bejing3",
                            "bejing4"};
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//           1.初始化控件
//           2.适配器
//           3.初始化数据源
//             4.将adpter与AutoCompletetextView



        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.acText);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,res);
        autoCompleteTextView.setAdapter(adapter);

//        autoCompleteTextView2 = (MultiAutoCompleteTextView)findViewById(R.id.acText1);
//        autoCompleteTextView2.setAdapter(adapter);
//        autoCompleteTextView2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}



