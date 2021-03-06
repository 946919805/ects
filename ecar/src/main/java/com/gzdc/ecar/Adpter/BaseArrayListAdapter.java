package com.gzdc.ecar.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.gzdc.ecar.Model.TaskModel;

import java.util.ArrayList;
import java.util.List;

public class BaseArrayListAdapter extends BaseAdapter {

    protected Context mContext;
    protected LayoutInflater mInflater;
    protected List<TaskModel.TaskBean.AddressBean> mDatas = new ArrayList<TaskModel.TaskBean.AddressBean>();

    public BaseArrayListAdapter(Context context, List<TaskModel.TaskBean.AddressBean> datas) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        if (datas != null && datas.size() > 0) {
            mDatas = datas;
        }
    }


    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
