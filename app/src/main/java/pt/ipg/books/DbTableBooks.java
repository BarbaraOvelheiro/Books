package pt.ipg.books;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class DbTableBooks implements BaseColumns{

    public static final String TABLE_NAME = "books";
    public static final String FIELD_TITLE = "title";
    public static final String FIELD_PRICE = "price";
    public static final String FIELD_ID_CATEGORY = "idCategory";

    private SQLiteDatabase db;

    public DbTableBooks(SQLiteDatabase db) {
        this.db = db;
    }

    public void create() {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        FIELD_TITLE + " TEXT NOT NULL," +
                        FIELD_PRICE + " REAL," +
                        FIELD_ID_CATEGORY + " INTEGER" +
                        ")"
        );
    }

    public long insert(ContentValues values){
        return db.insert(TABLE_NAME, null, values);
    }

    public int update(ContentValues values, String where, String[] whereArgs){
        return db.update(TABLE_NAME, values, where, whereArgs);
    }
}
