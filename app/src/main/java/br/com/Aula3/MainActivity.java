package br.com.Aula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPROCESSAR(View view){
        Toast mensagem = Toast.makeText(this,"Ola Horacio" ,Toast.LENGTH_SHORT);
        mensagem.show();
    }

}

