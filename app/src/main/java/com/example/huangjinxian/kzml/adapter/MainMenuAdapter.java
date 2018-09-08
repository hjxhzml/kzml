package com.example.huangjinxian.kzml.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.huangjinxian.kzml.R;

import java.util.List;

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuViewholder> {
    protected Context context;
    protected List<Menu> menus;
    public MainMenuAdapter(Context context, List<Menu> menus) {
        this.context=context;
        this.menus=menus;

    }
    @NonNull
    @Override
    public MainMenuViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu,null));
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuViewholder holder, int position) {
        menus.get(position);

    }

    @Override
    public int getItemCount() {
        return null!=menus?menus.size():0;
    }
}
class  MainMenuViewholder extends RecyclerView.ViewHolder{
    public ImageView mImgMenuIcon;
    public TextView mTextMenuName;
    public MainMenuViewholder(@NonNull View itemView) {
        super(itemView);
        mImgMenuIcon=itemView.findViewById(R.id.img_menu_icon);
        mTextMenuName=itemView.findViewById(R.id.txt_menu_name);
    }
}
