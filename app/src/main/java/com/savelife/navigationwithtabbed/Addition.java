package com.savelife.navigationwithtabbed;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by HP on 3/5/2017.
 */

public class Addition extends Activity {
    EditText f1,f2,res;
    Button btnadd;
    int n1,n2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition);
        f1=(EditText)findViewById(R.id.editText);
        f2=(EditText)findViewById(R.id.editText2);
        res=(EditText)findViewById(R.id.editText3);
        btnadd=(Button)findViewById(R.id.button2);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(f1.getText().toString());
                n2 = Integer.parseInt(f2.getText().toString());
                sum = n1 + n2;
                res.setText(Integer.toString(sum));
            }
            }
        );
    }
}
