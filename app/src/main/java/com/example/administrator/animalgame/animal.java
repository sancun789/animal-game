package com.example.administrator.animalgame;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class animal extends AppCompatActivity {

    private TextView mTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);



        Button btn1 = (Button) findViewById(R.id.btn1);



        btn1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

        Intent i = new Intent(animal.this , game.class);

       startActivity(i);
}
   });



    }

}
