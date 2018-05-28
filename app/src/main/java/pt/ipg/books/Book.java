package pt.ipg.books;

import android.content.ContentValues;

public class Book {

    private int id;
    private String title;
    private double price;
    private int idCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public ContentValues getContentValues(){
        ContentValues values = new ContentValues();

        values.put(DbTableBooks._ID, id);
        values.put(DbTableBooks.FIELD_PRICE, title);
        values.put(DbTableBooks.FIELD_PRICE, price);
        values.put(DbTableBooks.FIELD_ID_CATEGORY, idCategory);

        return values;
    }

}
