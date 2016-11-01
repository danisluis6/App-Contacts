package vn.udn.dut.c.model.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vuongluis on 30/10/2016.
 */

public class OpenHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "CONTACTS";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_ACCOUNT = "ACCOUNT";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_LOGO = "Logo";
    public static final String COLUMN_PHONE = "Phone";
    public static final String COLUMN_ADDRESS = "ADDRESS";
    public static final String COLUMN_SEX = "Sex";
    public static final String COLUMN_DATE = "Date";

    public OpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase arg0) {
        arg0.execSQL("CREATE TABLE " + TABLE_ACCOUNT + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_NAME + " TEXT NOT NULL, "
                + COLUMN_LOGO + " TEXT NOT NULL, "
                + COLUMN_PHONE + " TEXT NOT NULL, "
                + COLUMN_ADDRESS + " TEXT NOT NULL, "
                + COLUMN_SEX + " TEXT NOT NULL, "
                + COLUMN_DATE + " TEXT NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        arg0.execSQL("DROP TABLE IF EXISTS " + TABLE_ACCOUNT);
        onCreate(arg0);
    }
}
