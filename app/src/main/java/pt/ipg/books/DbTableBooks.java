package pt.ipg.books;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class DbTableBooks implements BaseColumns{

    private static final String TABLE_NAME = "books";
    private static final String FIELD_TITLE = "title";
    private static final String FIELD_PRICE = "price";
    private static final String FIELD_ID_CATEGORY = "idCategory";

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
}
