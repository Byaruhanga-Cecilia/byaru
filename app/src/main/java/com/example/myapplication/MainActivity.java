package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   protected  void onCreate (Bundle savedInstanceState) {

       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_listview);
       Button LIST=(Button)findViewById(R.id.list);

       LIST.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               listview.setOnClickListener();{
                   Intent intent=new Intent(MainActivity.this,listview.class);
                   startActivity(intent);
               }
           }
       });
   }
    public void sendMessage(View view){
        EditText message=(EditText)findViewById(R.id.message);
        Toast.makeText(this,"send"+message.getText().toString(),Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("MESSAGE",message.getText().toString());
        startActivity(intent);
        message.setText("");

        //Toast.makeText(this,"Sending message"+message.getText().toString())
       // Toast.LENGTH_SHORT.show();
    }




    }

