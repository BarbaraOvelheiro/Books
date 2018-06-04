package pt.ipg.books;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class DbTableCategories implements BaseColumns {

    public static final String TABLE_NAME = "categories";
    public   static final String FIELD_NAME = "name";

    private SQLiteDatabase db;

    public DbTableCategories(SQLiteDatabase db) {
        this.db = db;
    }

    public void create() {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY,"  +
                        FIELD_NAME + " TEXT NOT NULL" +
                        ")"
        );
    }

    public long insert(ContentValues values){
        return db.insert(TABLE_NAME, null, values);
    }
}
