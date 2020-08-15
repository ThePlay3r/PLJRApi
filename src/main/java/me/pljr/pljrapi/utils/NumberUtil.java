package me.pljr.pljrapi.utils;

public class NumberUtil {
    public static boolean isInt(String number){
        try {
            Integer.parseInt(number);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
