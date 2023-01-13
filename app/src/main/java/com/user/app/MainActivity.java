package com.user.app;

import android.app.*;
import android.widget.LinearLayout;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity {
    //声明要用到的组件
    private LinearLayout yanse;
    private Button huizheng;
    private Button ceshishijian;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //对应布局的组件
        yanse = (LinearLayout) findViewById(R.id.yanse);
        huizheng = (Button) findViewById(R.id.huizheng);
        ceshishijian = (Button) findViewById(R.id.ceshishijian);
        //将区域的背景颜色设为白色
        huizheng.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                yanse.setBackgroundColor(0xFFFFFFFF);
            }
        });
        //触摸事件监听
        ceshishijian.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View p1, MotionEvent p2) {
                switch (p2.getAction()) {
                case MotionEvent.ACTION_DOWN:
                //被按下执行的内容
                yanse.setBackgroundColor(0xFFFC0101);
                break;
                case MotionEvent.ACTION_UP:
                //被弹起执行的内容
                yanse.setBackgroundColor(0xFF00BCFF);
                break;
            }
            ceshishijian.onTouchEvent(p2);
            return false;
        }
        });
        
    }
}