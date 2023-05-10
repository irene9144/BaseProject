package com.gnapse.jenny.baseproject;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

//    private static Retrofit mInterface;

    private ArrayList<Item> items = new ArrayList<>();
    private MutableLiveData<List<Item>> listMutableLiveData = new MutableLiveData<List<Item>>();
    private static ItemRepository sInstance;

    public static ItemRepository getInstance() {
        if(sInstance == null) {
            sInstance = new ItemRepository();
        }
        return sInstance;
    }

    public ItemRepository() {

    }

    public MutableLiveData<List<Item>> getListMutableLiveData () {
        return listMutableLiveData;
    }

    private void notifyItemsChanged() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            listMutableLiveData.setValue(items);
        } else {
            listMutableLiveData.postValue(items);
        }
    }

    public void loadItems() {
        items.clear();
        items.add(new Item("item 1", "READY"));
        items.add(new Item("item 2", "READY"));
        items.add(new Item("item 3", "READY"));
        notifyItemsChanged();
    }
}
