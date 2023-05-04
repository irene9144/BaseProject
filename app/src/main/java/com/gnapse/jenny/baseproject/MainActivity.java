package com.gnapse.jenny.baseproject;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.gnapse.jenny.baseproject.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<BaseViewModel, ActivityMainBinding> {

    private static final String TAG = MainActivity.class.getSimpleName();
    MainFragment mainFragment;
    ListFragment listFragment;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void initViews() {
        mainFragment = new MainFragment();
        replaceFragment(mainFragment, mBinding.container.getId());

        listFragment = new ListFragment();

        mBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(mainFragment, mBinding.container.getId());
            }
        });

        mBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(listFragment, mBinding.container.getId());
            }
        });
    }

    @Override
    public BaseViewModel getViewModel() {
        return null;
    }

    @Override
    public void observeViewModel() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


}