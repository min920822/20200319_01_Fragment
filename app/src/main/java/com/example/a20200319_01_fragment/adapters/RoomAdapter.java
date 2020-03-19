package com.example.a20200319_01_fragment.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.a20200319_01_fragment.R;
import com.example.a20200319_01_fragment.fragments.datas.Room;

import java.util.List;
import java.util.zip.Inflater;

public class RoomAdapter extends ArrayAdapter <Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater Inflater;

    public RoomAdapter(@NonNull Context context, int resource, @NonNull List<Room> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        Inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = Inflater.inflate(R.layout.room_list_item,null);

        }

        return row;

    }

    }



