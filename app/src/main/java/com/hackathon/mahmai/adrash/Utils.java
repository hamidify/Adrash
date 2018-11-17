package com.hackathon.mahmai.adrash;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Utils extends BaseActivity {
    public Drawable iconRed;
    private Context context;

    public Utils(Context context) {
        this.context = context;
        iconRed = context.getResources().getDrawable(R.drawable.ic_error_red);
        iconRed.setBounds(0, 0, iconRed.getIntrinsicWidth(), iconRed.getIntrinsicHeight());
    }




    public static String getPhoneNumber(EditText phoneNumberEditText) {
        String phoneNumber = phoneNumberEditText.getText().toString().trim().replaceAll("[^\\d]", "");
        char zero = phoneNumber.charAt(0);
        if (String.valueOf(zero).equals("0")) {
            return phoneNumber.substring(1);
        }
        return phoneNumber;
    }


    public static boolean isLoggedIn() {
//        return App.preferences.getBoolean(App.KEY_LOGGED_IN, false);
        return  true;
    }



    public static boolean validateCode(Context context, EditText codeValue) {
        Utils utils = new Utils(context);
        boolean valid = true;
        String code = codeValue.getText().toString().trim();
        if (code.isEmpty() || code.length() < 4 || code.length() > 6) {
            codeValue.setError("Code Length Must between 4 and 5", utils.iconRed);
            valid = false;
        }
        return valid;
    }

    public static boolean validatePhoneNumber(Context context, EditText number) {
        Utils utils = new Utils(context);
        boolean valid = true;
        String phoneNumber = number.getText().toString().trim();
        if (phoneNumber.isEmpty() || phoneNumber.equals(" ") || PhoneNumberUtils.isGlobalPhoneNumber(phoneNumber)) {
            number.setError("Please Enter Valid Phone number!", utils.iconRed);
            valid = false;
        } else if (phoneNumber.contains("*") || phoneNumber.contains("#") || phoneNumber.contains("+") ||
                phoneNumber.contains("/") || phoneNumber.contains(";") || phoneNumber.contains(",")) {
            number.setError("Invalid characters Detected", utils.iconRed);
            valid = false;
        }
        return valid;
    }





}
