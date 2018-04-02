package com.wzk.mylibrary.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.wzk.mylibrary.R;
import com.wzk.mylibrary.base.BaseActivity;
import com.wzk.mylibrary.fragment.FirstTabFragment;

public class MainActivity extends BaseActivity {

    private FirstTabFragment firstTabFragment, secondTabFragment, thirdTabFragment, forthTabFragment;
    private RelativeLayout relaContainer;

    private String[] mTitles = {"页面1", "页面2", "页面3"};
    private Fragment[] fragments;
    private Button[] tabs;
    private int currentIndex, index = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment(savedInstanceState);
    }

    private void initFragment(Bundle savedInstanceState) {
        firstTabFragment = new FirstTabFragment();
        secondTabFragment = new FirstTabFragment();
        thirdTabFragment = new FirstTabFragment();
        forthTabFragment = new FirstTabFragment();
        fragments = new Fragment[]{firstTabFragment, secondTabFragment, thirdTabFragment, forthTabFragment};
        getSupportFragmentManager().beginTransaction().add(R.id.relaContainer, fragments[0]).add(R.id.relaContainer, fragments[1]).hide(fragments[1]).commit();
    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        relaContainer = (RelativeLayout) findViewById(R.id.relaContainer);
        tabs = new Button[4];
        tabs[0] = (Button) findViewById(R.id.tab0);
        tabs[1] = (Button) findViewById(R.id.tab1);
        tabs[2] = (Button) findViewById(R.id.tab2);
        tabs[3] = (Button) findViewById(R.id.tab3);
        tabs[0].setSelected(true);
    }

    public void onTabClick(View v) {
        switch (v.getId()){
            case R.id.tab0:
                index = 0;
                break;
            case R.id.tab1:
                index = 1;
                break;
            case R.id.tab2:
                index = 2;
                break;
            case R.id.tab3:
                index = 3;
                break;
        }
        if(index != currentIndex){
            FragmentTransaction trx = getSupportFragmentManager().beginTransaction();
            if(fragments[currentIndex].isAdded()){
                trx.hide(fragments[currentIndex]);
            }
            if(!fragments[index].isAdded()){
                trx.add(R.id.relaContainer, fragments[index]);
            }
            trx.show(fragments[index]).commit();
            tabs[index].setSelected(true);
            tabs[currentIndex].setSelected(false);
            currentIndex = index;
        }
    }

}
