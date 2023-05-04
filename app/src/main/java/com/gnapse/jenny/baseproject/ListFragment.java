package com.gnapse.jenny.baseproject;

import com.gnapse.jenny.baseproject.databinding.FragmentListBinding;

public class ListFragment extends BaseFragment<ListViewModel, FragmentListBinding> {


    @Override
    public void initViews() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_list;
    }

    @Override
    public ListViewModel getViewModel() {
        return null;
    }

    @Override
    public void observeViewModel() {

    }

    @Override
    public void onChanged(Object o) {

    }
}
