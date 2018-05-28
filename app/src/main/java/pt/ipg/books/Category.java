package pt.ipg.books;

import android.content.ContentValues;

public class Category {

    private int _id;
    private  String name;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContentValues getContentValues(){
        ContentValues values = new ContentValues();

        values.put(DbTableCategories._ID, _id);
        values.put(DbTableCategories.FIELD_NAME, name);

        return  values;
    }
}
