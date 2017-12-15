package com.example.fragmenttest;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 易辰 on 2017/12/15.
 */
//RecyclerView控制
@SuppressLint("ValidFragment")
public class ListFragment extends Fragment {
    ListAdapter listAdapter;
    @SuppressLint("ValidFragment")
    public ListFragment(MainActivity mainActivity){
        listAdapter = mainActivity.getListAdapter();
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.fragment_list, container , false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listRecyclerView);

//        ListAdapter listAdapter = new ListAdapter( );
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
