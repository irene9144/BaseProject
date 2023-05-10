package com.gnapse.jenny.baseproject;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.gnapse.jenny.baseproject.databinding.FragmentListBinding;
import java.util.ArrayList;

public class ListFragment extends BaseFragment<ListViewModel, FragmentListBinding> {

    private ItemListAdapter itemListAdapter;

    @Override
    public void initViews() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mBinding.recyclerView.setLayoutManager(layoutManager);
        mBinding.recyclerView.setHasFixedSize(true);

        itemListAdapter = new ItemListAdapter();
        mBinding.recyclerView.setAdapter(itemListAdapter);



    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_list;
    }

    @Override
    public ListViewModel getViewModel() {
        return ViewModelFactory.getInstance(getActivity().getApplication())
                .create(ListViewModel.class);
    }

    @Override
    public void observeViewModel() {
        getViewModel().getDataList().observe(this, this);
        getViewModel().loadItems();
    }

    @Override
    public void onChanged(Object o) {
        ArrayList<Item> list = (ArrayList) o;
        itemListAdapter.setItems(list);
    }
}
