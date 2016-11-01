package vn.udn.dut.c.view;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vn.udn.dut.c.R;
import vn.udn.dut.c.controller.UserAdapter;
import vn.udn.dut.c.model.bean.User;

public class MainActivity extends AppCompatActivity {

    private UserAdapter userAdapter;
    private List<User> mUsers;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsers = new ArrayList<>();
        mListView = (ListView)findViewById(R.id.listAddress);

        mUsers.add(new User("Nguyen Van Vuong","a.png","0972248187","DaNang","Nam","26/07/1994"));
        mUsers.add(new User("Nguyen Van Vuong","a.png","0972248187","DaNang","Nam","26/07/1994"));
        mUsers.add(new User("Nguyen Van Vuong","a.png","0972248187","DaNang","Nam","26/07/1994"));
        mUsers.add(new User("Nguyen Van Vuong","a.png","0972248187","DaNang","Nam","26/07/1994"));

        userAdapter = new UserAdapter(this, mUsers);
        mListView.setAdapter(userAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User user = (User) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, user.getName() + "--" + user.getAddress(), Toast.LENGTH_LONG).show();
            }
        });

        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                showAlertDialog(position);
                return false;
            }
        });

        mListView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Toast.makeText(MainActivity.this, "Scroll", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            }
        });
    }
    private void showAlertDialog(final int position) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
        builder1.setTitle("Confirm Delete");
        builder1.setMessage("Do you want delete item!!");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        mUsers.remove(position);
                        userAdapter.notifyDataSetChanged();
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}
