package com.terryhilton.quoter;

/**
 * Created by hilto_000 on 12/7/2015.
 */
public class Quotebook {

    // Our Constructor for objects
    public Quotebook(String bookName, String backGround, String[] quotes){
        mBookName = bookName;
        mBackground = backGround;
        mQuotes = quotes;

    }

    private String mBookName;

    public String[] getQuotes() {
        return mQuotes;
    }

    public void setQuotes(String[] quotes) {
        mQuotes = quotes;
    }

    private String mBackground;

    public String getBackground() {
        return mBackground;
    }

    public void setBackground(String background) {
        mBackground = background;
    }

    private String[] mQuotes;

    public String getBookName() {
        return mBookName;
    }

    public void setBookName(String bookName) {
        mBookName = bookName;
    }






}
