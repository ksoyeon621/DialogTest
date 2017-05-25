package com.example.dialogtest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog = (Button) findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this); //onClickListner는 현재 메인액티비티에 있다.
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);//대화상자가 어느액티비티에서 만들어지는지 지정//getApplicationContext()사용가능
        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.drawable.flamingo);
        dialog.setMessage("여기는 메세지를 쓰는 곳입니다.");
        dialog.setPositiveButton("Ok", null/*처리자를 넣는곳*/);
        dialog.show();
    }
}
