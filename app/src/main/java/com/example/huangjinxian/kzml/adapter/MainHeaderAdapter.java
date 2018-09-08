package com.example.huangjinxian.kzml.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;


public class MainHeaderAdapter extends PagerAdapter {

    protected Context context;
    protected List<ImageView> images;
    public MainHeaderAdapter(Context context, List<ImageView> images) {
        this.context=context;
        this.images=images;

    }
    @Override
    public int getCount() {
        return null!=images?images.size():0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(images.get(position));
        return images.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(images.get(position));
    }
}
