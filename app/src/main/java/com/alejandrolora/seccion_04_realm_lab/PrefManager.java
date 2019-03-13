package com.alejandrolora.seccion_04_realm_lab;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    //shared pref mode
    int PRIVATE_MODE=0;
    //Shared preference file name
    private static final String PREF_NAME ="aplicacionesandroid-bienvenido";
    private static final String IS_FIRST_TIME_LAUNCH ="IsFirstTimeLaunch";

    public PrefManager(Context context){
        this._context=context;
        pref=_context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor= pref.edit();
    }
    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();
    }
    public boolean isFirstTimeLaunch(){
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH,true);

    }
}
