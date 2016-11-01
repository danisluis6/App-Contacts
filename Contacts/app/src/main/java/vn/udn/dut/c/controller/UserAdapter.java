package vn.udn.dut.c.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vn.udn.dut.c.model.bean.User;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by Binc on 03/04/2016.
 */
public class UserAdapter extends ArrayAdapter<User> {

    private List<User> mUsers;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public UserAdapter(Context context, List<User> users) {
        super(context, 0, users);
        mContext = context;
        mUsers = users;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        if (mUsers.isEmpty()) {
            return 0;
        }
        return mUsers.size();
    }

    // View lookup cache
    private static class ViewHolder {
        ImageView tvLogo;
        TextView tvName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final User user = mUsers.get(position);
        ViewHolder viewHolder;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item_listview_user, null, false);
            // Lookup view for data population
            viewHolder = new ViewHolder();

            viewHolder.tvLogo = (ImageView) convertView.findViewById(R.id.logo);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Populate the data into the template view using the data object
        if(user.getSex().equals("Nam")){
            viewHolder.tvLogo.setImageResource(R.drawable.a);
        }else{
            viewHolder.tvLogo.setImageResource(R.drawable.b);
        }
        viewHolder.tvName.setText(user.getName());
        // Return the completed view to render on screen
        return convertView;
    }
}
