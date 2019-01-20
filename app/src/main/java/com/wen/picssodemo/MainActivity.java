package com.wen.picssodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_photo)
    ImageView mIvPhoto;
    String photoUrl="https://t1.hddhhn.com/uploads/tu/201901/220/1.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.btn_netWork)
    public void loadNetWorkPhoto(View view){
      Picasso.get().load(photoUrl).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(mIvPhoto);
    }
    @OnClick(R.id.btn_resize)
    public void loadResizePhoto(View view){
        Picasso.get().load(photoUrl).resize(50,100).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(mIvPhoto);
    }
    @OnClick(R.id.btn_rotate)
    public void loadrotatePhoto(View view){
        Picasso.get().load(photoUrl).rotate(180).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(mIvPhoto);
    }
    @OnClick(R.id.btn_centerInside)
    public void centerInsidePhoto(View view){
        Picasso.get().load(photoUrl).resize(50,50).centerInside().placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(mIvPhoto);
    }
    @OnClick(R.id.btn_centerCrop)
    public void centerCropPhoto(View view){
        Picasso.get().load(photoUrl).resize(50,50).centerCrop().placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(mIvPhoto);
    }
    @OnClick(R.id.btn_noFade)
    public void noFadePhoto(View view){
        Picasso.get().load(photoUrl).resize(50,50).noFade().placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(mIvPhoto);
    }
    @OnClick(R.id.btn_recyclerView)
    public void intentRecyclerView(View view){
        startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));
    }

}
