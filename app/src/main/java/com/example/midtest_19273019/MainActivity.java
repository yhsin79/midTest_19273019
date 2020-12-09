package com.example.midtest_19273019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    Button BTN4;
    Button BTN5;
    Button BTN6;

    int changeIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 =findViewById(R.id.image1);
        image2 =findViewById(R.id.image2);
        BTN4 =findViewById(R.id.button4);
        BTN5 =findViewById(R.id.button5);
        BTN6 =findViewById(R.id.button6);
    }
  public void onButtonDog(View v){
        changeDog();
  }
  private void changeDog(){
            image1.setVisibility(View.VISIBLE);
            image2.setVisibility(View.INVISIBLE);

  }
    public void onButtonCat(View v){
        changeCat();
    }
    public void changeCat(){
        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.VISIBLE);

    }
    public void onButtonNumber(View v){
        Toast.makeText(this,"19273019 유혜신",Toast.LENGTH_LONG).show();
    }
    public void onButtonGoogle(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(myIntent);
    }
    public void onButtonCall(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(myIntent);
    }
    public void onButtonChange(View v){
        changeButton();
    }
    public void changeButton(){
        if (changeIndex == 0){
            BTN4.setVisibility(View.VISIBLE);
            BTN5.setVisibility(View.VISIBLE);
            BTN6.setVisibility(View.VISIBLE);
            changeIndex = 1;
        }
        else if(changeIndex == 1){
            BTN4.setVisibility(View.INVISIBLE);
            BTN5.setVisibility(View.INVISIBLE);
            BTN6.setVisibility(View.INVISIBLE);
            changeIndex = 0;
        }
    }
}