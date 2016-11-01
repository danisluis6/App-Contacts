package vn.udn.dut.c.model.dao;

/**
 * Created by vuongluis on 01/11/2016.
 */


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import vn.udn.dut.c.model.bean.User;
import vn.udn.dut.c.model.database.OpenHelper;


/**
 * Created by vuongluis on 30/10/2016.
 */

public class UserDAO {

    private static final String TABLE_ACCOUNT = "ACCOUNT";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_LOGO = "Logo";
    public static final String COLUMN_PHONE = "Phone";
    public static final String COLUMN_ADDRESS = "ADDRESS";
    public static final String COLUMN_SEX = "Sex";
    public static final String COLUMN_DATE = "Date";

    private static Context context;
    private static SQLiteDatabase db;

    private OpenHelper openHelper;

    public UserDAO(Context c){
        UserDAO.context = c;
    }

    public UserDAO open() throws SQLException {
        openHelper = new OpenHelper(context);
        db = openHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        openHelper.close();
    }

    // function insert database
    public long createData(String name, String logo, String phone, String address, String sex, String date) {
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_LOGO, logo);
        cv.put(COLUMN_PHONE, phone);
        cv.put(COLUMN_ADDRESS, address);
        cv.put(COLUMN_SEX, sex);
        cv.put(COLUMN_DATE, date);
        return db.insert(TABLE_ACCOUNT, null, cv);
    }

    // Select data from database
    public List<User> getData() {
        String[] columns = new String[]{COLUMN_ID, COLUMN_NAME, COLUMN_LOGO, COLUMN_PHONE, COLUMN_ADDRESS, COLUMN_SEX, COLUMN_DATE};
        //Cursor c = db.query(TABLE_ACCOUNT, columns, COLUMN_ID+"=?", new String[]{"12"}, null, null, null);
        Cursor c = db.query(TABLE_ACCOUNT, columns, null, null, null, null, null);
        /*if(c==null)
            Log.v("Cursor", "C is NULL");*/
        String result = "";
        List<User> userList = new ArrayList<>();
        int id = c.getColumnIndex(COLUMN_ID);
        String name = String.valueOf(c.getColumnIndex(COLUMN_NAME));
        String logo = String.valueOf(c.getColumnIndex(COLUMN_LOGO));
        String phone = String.valueOf(c.getColumnIndex(COLUMN_PHONE));
        String address = String.valueOf(c.getColumnIndex(COLUMN_ADDRESS));
        String sex = String.valueOf(c.getColumnIndex(COLUMN_SEX));
        String date = String.valueOf(c.getColumnIndex(COLUMN_DATE));

        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            userList.add(new User(name,logo,phone,address,sex,date));
        }
        c.close();
        return userList;
    }

    /* Hàm đăng nhập với đối số đầu vào là tên acc và mật khẩu */
}
