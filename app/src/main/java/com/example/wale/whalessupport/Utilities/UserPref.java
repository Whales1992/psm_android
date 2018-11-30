package com.example.wale.whalessupport.Utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Date;

public class UserPref {
    Context context;
    SharedPreferences preferences;
    public static String user;

    public UserPref(Context context){
        this.context = context;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        user = preferences.getString("auth", "");
    }


    public UserModel getUserModel() throws JSONException {
        String u = preferences.getString("auth", "");
        JSONObject object = new JSONObject(u);
        return new UserModel(object.getInt("uid"), object.getString("full_name"), object.getString("school_id"),
                object.getString("courses_id"), object.getString("department_id"), object.getString("level_id"),
                object.getString("semester_id"), object.getString("matric_number"), object.getString("phone"),
                object.getString("avatar"), new Date(object.getString("date_of_birth")), object.getString("email"),
                object.getString("password"));
    }

    public String getUser() {
        return preferences.getString("auth", "");
    }

    public void storeUser(String json) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("auth", json);
        editor.apply();
    }

    public static boolean isLoggedIn() {
        return !user.equalsIgnoreCase("");
    }

    public void logOut() {
        SharedPreferences user = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = user.edit();
        editor.clear();
        editor.apply();
    }


}
