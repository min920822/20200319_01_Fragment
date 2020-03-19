package com.example.a20200319_01_fragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.a20200319_01_fragment.R;
import com.example.a20200319_01_fragment.adapters.RoomAdapter;
import com.example.a20200319_01_fragment.databinding.FragmentRoomListBinding;
import com.example.a20200319_01_fragment.fragments.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomListFragment extends Fragment {

    List<Room> roomList = new ArrayList<>();

    RoomAdapter adapter = null;

    FragmentRoomListBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_room_list,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adapter = new RoomAdapter(getActivity(),
                R.layout.room_list_item,roomList);

        binding.roomListView.setAdapter(adapter);
        roomList.add(new Room(5000,"서울시 은평구"));
        adapter.notifyDataSetChanged();

    }
}
