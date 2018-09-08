package com.example.huangjinxian.kzml.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.huangjinxian.kzml.R;
import com.example.huangjinxian.kzml.adapter.MainHeaderAdapter;
import com.example.huangjinxian.kzml.adapter.MainMenuAdapter;
import com.example.huangjinxian.kzml.util.DataUtil;



/**
 * 主界面视图
 */
public class MainFargment extends Fragment {

    protected int[] icons={R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2,R.mipmap.header_pic_ad1};
    protected ViewPager mVpagerHeaderAd;//广告头

    //菜单图标
    protected int[] menuIons={R.mipmap.menu_airport,R.mipmap.menu_car,
            R.mipmap.menu_course,R.mipmap.menu_hatol,
            R.mipmap.menu_nearby,R.mipmap.me_menu_go,
            R.mipmap.menu_ticket,R.mipmap.menu_train};
    String [] menus;
    protected RecyclerView mRecycleViewMenu;//主菜单
    //主菜单
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {


        super.onActivityCreated(savedInstanceState);
        menus=this.getActivity().getResources().getStringArray(R.array.main_menu);
        mVpagerHeaderAd=getView().findViewById(R.id.vpager_main_header_ad);
        //设置适配器
        mRecycleViewMenu=getView().findViewById(R.id.recycleview_main_menu);
        MainHeaderAdapter adapter=new MainHeaderAdapter(getActivity(), DataUtil.getHeaderAddInfo(getActivity(),icons));
        mVpagerHeaderAd.setAdapter(adapter);

        //菜单
        mRecycleViewMenu.setLayoutManager(new GridLayoutManager(getActivity(),4));
    }
}
