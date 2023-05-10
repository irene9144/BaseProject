package com.gnapse.jenny.baseproject;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.gnapse.jenny.baseproject.databinding.FragmentMainBinding;

public class MainFragment extends BaseFragment<MainViewModel, FragmentMainBinding> {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initViews() {
        mBinding.textView.setText("Changed ");
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    public MainViewModel getViewModel() {
        return ViewModelFactory.getInstance(getActivity().getApplication())
                .create(MainViewModel.class);
    }

    @Override
    public void observeViewModel() {
        getViewModel().getCurrentName().observe(this, this);
    }

    @Override
    public void onChanged(Object o) {
        String data  = (String) o;
        mBinding.textView.setText(data);
    }
}
