package com.tasks;

public class StringSplit {
    public static String[] solution(String s) {

        String[] results = new String[s.length()/2];
        if(s.length() % 2 ==0){
            for (int i=0; i<s.length()/2; i++){
                results[i] = s.substring(i*2,i*2+2);
            }
        } else if (s.length() % 2 != 0){
            results = new String[s.length()/2+1];
            for (int i=0; i<s.length()/2; i++){
                results[i] = s.substring(i*2,i*2+2);
            }
            results[s.length()/2] = s.substring(s.length()-1) + "_";
        }
        return results;
    }
}
