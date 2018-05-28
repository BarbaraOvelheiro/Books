package pt.ipg.books;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* ABRIR A BASE DE DADOS */
public class BooksDbOpenHelper extends SQLiteOpenHelper {

    public static final int VERSION = 1;
    public static final String DATABASE_NAME = "books.db";

    public BooksDbOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        DbTableCategories dbTableCategories = new DbTableCategories(db);
        dbTableCategories.create();


        DbTableBooks dbTableBooks = new DbTableBooks(db);
        dbTableBooks.create();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
