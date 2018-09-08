package com.example.huangjinxian.kzml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.huangjinxian.kzml.fragment.FindFragment;
import com.example.huangjinxian.kzml.fragment.MainFargment;
import com.example.huangjinxian.kzml.fragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected LinearLayout mMenuMain;
    protected LinearLayout mMenuFind;
    protected LinearLayout mMenume;
    protected MainFargment mMainFragment=new MainFargment();//首页
    protected FindFragment mFindFragment=new FindFragment();//发现
    protected MeFragment mMeFragment=new MeFragment();//我的
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        //获取管理类
        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_content,mMainFragment)
                .add(R.id.container_content,mFindFragment)
                .hide(mFindFragment)//隐藏
                .add(R.id.container_content,mMeFragment)
                .hide(mMeFragment)//隐藏
        //事务添加 默认：显示首页  其他页面：隐藏
        //提交
        .commit();
    }


    public void initView() {
        mMenuMain=this.findViewById(R.id.menu_main);
        mMenuFind=this.findViewById(R.id.menu_find);
        mMenume=this.findViewById(R.id.menu_me);

        mMenuMain.setOnClickListener(this);
        mMenume.setOnClickListener(this);
        mMenuFind.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.menu_main:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(mMainFragment)
                        .hide(mFindFragment)
                        .hide(mMeFragment)
                        .commit();
                break;
            case R.id.menu_find:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mMainFragment)
                        .show(mFindFragment)
                        .hide(mMeFragment)
                        .commit();
                break;
            case R.id.menu_me:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mMainFragment)
                        .hide(mFindFragment)
                        .show(mMeFragment)
                        .commit();
                break;
        }
    }
}
