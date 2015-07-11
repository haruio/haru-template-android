package com.pongdang.wegoto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends ActionBarActivity implements View.OnClickListener {

    // android weiget
    private EditText idEditTxt;
    private EditText pwEditTxt;
    private Button loginBtn;
    private TextView loseBtn;
    private TextView createBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initWeiget();
    }

    /**
     * @MethodName :initWeiget
     * @date: 2015/07/11
     * @Writer: yejin choi
     * activity_logo.xml 에 있는 android 위젯들을 모두 가져온다.
     */
    private void initWeiget(){
        idEditTxt = (EditText) findViewById(R.id.id_edit_login);
        pwEditTxt = (EditText) findViewById(R.id.pw_edit_login);
        loginBtn = (Button) findViewById(R.id.login_btn_login);
        loseBtn = (TextView) findViewById(R.id.lose_btn_login);
        createBtn = (TextView) findViewById(R.id.create_btn_login);

        // Setting clickListener
        loginBtn.setOnClickListener(this);
        loseBtn.setOnClickListener(this);
        createBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.login_btn_login:
                tryLogin();
                break;
            case R.id.lose_btn_login:
                break;
            case R.id.create_btn_login:
                break;
        }
    }

    private void tryLogin() {
        Intent intent = new Intent("com.pongdang.wegoto.MainActivity");
        startActivity(intent);
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
        finish();
    }
}
