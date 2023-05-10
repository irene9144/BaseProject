package com.gnapse.jenny.baseproject;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends BaseViewModel {

    private ItemRepository itemRepository;

//    MutableLiveData<List<String>> dataList = new MutableLiveData<>();

    public ListViewModel(@NonNull Application application) {
        super(application);
        itemRepository = ItemRepository.getInstance();
    }

    public MutableLiveData<List<Item>> getDataList() {
        return itemRepository.getListMutableLiveData();
    }

    public void loadItems() {
        itemRepository.loadItems();
    }
}
