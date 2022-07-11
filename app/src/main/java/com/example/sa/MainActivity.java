package com.example.telassa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Login;
    private Button Cadastrar;
    private Button Explorar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = findViewById(R.id.loginButton);
        Cadastrar = findViewById(R.id.cadastroButton);
        Explorar = findViewById(R.id.explorarButton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

                startActivity(intent);

            }
        });

    }
}
















