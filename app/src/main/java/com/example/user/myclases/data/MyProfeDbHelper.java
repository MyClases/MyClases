package com.example.user.myclases.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.myclases.data.MyProfeContract.MyProfeEntry;
/**
 * Created by Diego on 22-10-2014.
 */
public class MyProfeDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME="MyProfe.db";

    public MyProfeDbHelper(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {


    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String createMyProfeSql = String.format("CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "%s TEXT NOT NULL, " +
                        "%s TEXT NOT NULL, " +
                        "UNIQUE (%s ) ON CONFLICT IGNORE," +
                        "%s TEXT NOT NULL," +
                        "%s TEXT NOT NULL)",
                MyProfeEntry.TABLE_NAME, MyProfeEntry._ID,
                MyProfeEntry.COLUMN_LOGIN, MyProfeEntry.COLUMN_CLAVE,
                MyProfeEntry.COLUMN_CLAVE, MyProfeEntry.COLUMN_COMUNA,
                MyProfeEntry.COLUMN_INFOPERFIL);

        sqLiteDatabase.execSQL(createMyProfeSql);

        final String createMyProfeSql2 = String.format("CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "%s TEXT NOT NULL, " +
                        "%s TEXT NOT NULL)",
                MyProfeEntry2.TABLE_NAME2, MyProfeEntry2._ID,
                MyProfeEntry2.COLUMN_ASIGNATURA, MyProfeEntry2.COLUMN_CURSO);

        sqLiteDatabase.execSQL(createMyProfeSql2);

        final String createMyProfeSql3 = String.format("CREATE TABLE %s (" +
                        "%s TEXT NOT NULL, " +
                        "%s TEXT NOT NULL" +
                        "%s INTEGER NOT NULL" +
                        "%s INTEGER NOT NULL" +
                        "FOREIGN KEY ( %s ) REFERENCES %s (%s)" +
                        "FOREIGN KEY ( %s ) REFERENCES %s (%s) )",
                MyProfeEntry3.TABLE_NAME3,
                MyProfeEntry3.COLUMN_PRECIO,
                MyProfeEntry3.COLUMN_GRADOACADEMICO,
                MyProfeEntry3.COLUMN_USUARIOSKEY,
                MyProfeEntry3.COLUMN_ASIGNATURAKEY,
                MyProfeEntry3.COLUMN_USUARIOSKEY,
                MyProfeEntry.TABLE_NAME,
                MyProfeEntry._ID,
                MyProfeEntry3.COLUMN_USUARIOSKEY,
                MyProfeEntry2.TABLE_NAME2,
                MyProfeEntry2._ID);

        sqLiteDatabase.execSQL(createMyProfeSql3);

        final String createMyProfeSql4 = String.format("CREATE TABLE %s (" +
                        "%s TEXT NOT NULL, " +
                        "%s TEXT NOT NULL" +
                        "FOREIGN KEY ( %s ) REFERENCES %s (%s)" +
                        "FOREIGN KEY ( %s ) REFERENCES %s (%s) )",
                MyProfeEntry4.TABLE_NAME4,
                MyProfeEntry4.COLUMN_USUARIOSKEY,
                MyProfeEntry4.COLUMN_ASIGNATURAKEY,
                MyProfeEntry4.COLUMN_USUARIOSKEY,
                MyProfeEntry.TABLE_NAME,
                MyProfeEntry._ID,
                MyProfeEntry4.COLUMN_USUARIOSKEY,
                MyProfeEntry2.TABLE_NAME2,
                MyProfeEntry2._ID);

        sqLiteDatabase.execSQL(createMyProfeSql4);

    }
    public boolean insertar( String nombre, String telefono) {
        if (nombre.equals("")){return false;}
        if(telefono.equals("")){return false;}
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO MyProfe VALUES ( null, "+
                nombre+" , "+ telefono +")" );
        db.close();
        return true;
    }


}
