package com.acadview.dial;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText name, email,phone,state,city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.text);
        state = findViewById(R.id.state);
        city = findViewById(R.id.city);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(name.getText().toString())){
                    name.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(email.getText().toString())){
                    email.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(phone.getText().toString())){
                    phone.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(state.getText().toString())){
                    state.setError("Required Filed");
                    return;
                }

                if(TextUtils.isEmpty(city.getText().toString())){
                    city.setError("Required Filed");
                    return;
                }



                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("subnit confirmation");
                builder.setMessage("Are you sure want to continue");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }

                });

                builder.show();
            }
        });


    }
    };

