package com.xr.smoke.util;

public class StringSubstring {

    public String substring(String str){
        String skr1 = str.substring(0,str.indexOf(">"));
        String str2=str.substring(skr1.length()+1, str.length());
        str = str2.substring(0,str2.indexOf("<"));
        return  str;
    }
}
