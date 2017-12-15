package com.example.fragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
//初始化Fragment，將Fragment覆寫原UI區域
//1個Adapter控制多個RecyclerView
public class MainActivity extends FragmentActivity {
    ListAdapter listAdapter;

    public ListAdapter getListAdapter() {
        return listAdapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAdapter = new ListAdapter();

        ListFragment fragment = new ListFragment(this);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder, fragment);
        fragmentTransaction.commit();
    }
}