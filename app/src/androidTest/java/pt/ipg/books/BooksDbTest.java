package pt.ipg.books;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class BooksDbTest {
    @Test
    public void createDatabaseTest() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        BooksDbOpenHelper booksDbOpenHelper = new BooksDbOpenHelper(appContext);

        SQLiteDatabase db = booksDbOpenHelper.getReadableDatabase(); // CRIAÇÃO DA TABELA DE BASE DE DADOS
        assertTrue("Could not open books database" ,db.isOpen());
    }
}
