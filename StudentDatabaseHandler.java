package com.example.collegelibrary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "studentsManager";
    private static final String TABLE_STUDENTS = "students";
    private static final String KEY_ID = "id";
    private static final String KEY_STUDENT_NAME = "name";
    private static final String KEY_STUDENT_ADDRESS = "address";

    public StudentDatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //3rd argument to be passed is CursorFactory instance
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_STUDENTS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_STUDENT_NAME + " TEXT,"
                + KEY_STUDENT_ADDRESS + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);

        // Create tables again
        onCreate(db);
    }

    // code to add the new contact
    void addStudent(Students students) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_STUDENT_NAME, students.getName()); // Contact Name
        values.put(KEY_STUDENT_ADDRESS, students.getAddress()); // Contact Phone

        // Inserting Row
        db.insert(TABLE_STUDENTS, null, values);
        //2nd argument is String containing nullColumnHack
        db.close(); // Closing database connection
    }


    // code to get all contacts in a list view
    public List<Students> getAllStudents() {
        List<Students> studentList = new ArrayList<Students>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_STUDENTS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Students students = new Students(cursor.getString(0),cursor.getString(1));
                // Adding contact to list
                studentList.add(students);
            } while (cursor.moveToNext());
        }

        // return contact list
        return studentList;
    }

}
