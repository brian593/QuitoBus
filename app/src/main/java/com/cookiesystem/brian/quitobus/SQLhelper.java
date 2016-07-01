package com.cookiesystem.brian.quitobus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 19/06/2016.
 */
public class SQLhelper extends SQLiteOpenHelper {

    public  static  String DB_PATH = "QuitoBusDB";

    public SQLhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public List<tipotransporte> recuperarTipoTransporte()
    {
        SQLiteDatabase db = getReadableDatabase();
        List<tipotransporte> lista_tt= new ArrayList<tipotransporte>();
        String[] valores_recuperar={"id","nombre"};
        Cursor c = db.query("tipotransporte", valores_recuperar,null,null,null,null, null);
        c.moveToFirst();
        do {
            tipotransporte tt = new tipotransporte(c.getInt(0), c.getString(1)
            );
            lista_tt.add(tt);
        }while (c.moveToNext());
        db.close();
        c.close();
        return  lista_tt;
    }



}


