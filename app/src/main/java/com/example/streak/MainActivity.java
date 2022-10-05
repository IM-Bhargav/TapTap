package com.example.streak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
     int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = findViewById(R.id.streak);
        TextView t2 = findViewById(R.id.Click);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count+=1;
                String s = Integer.toString(count);
                if(count<=3){
                    t1.setText(s);
                }else{
                    t1.setText(" " + s + " 🔥");
                }

            }
        });
    }
}