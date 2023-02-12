package com.abhijit.Assignment1.dto;

import java.util.Random;

public class AccountName {

    private static  final String vowels="aeiou";
    private static final String consonants="bcdfghjklmnpqrstvwxyz";
    private  String firstname;
    private String Lastname;

    public AccountName(String firstname, String lastname) {
        firstname=generate(4,vowels,consonants);
        lastname=generate(4,vowels,consonants);
    }

    public  String generate(Integer len,String vowels,String consonants){
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            if(i%2==0){
                sb=sb.append(consonants.charAt(r.nextInt(consonants.length())));
            }
            else{
                sb=sb.append(vowels.charAt(r.nextInt(vowels.length())));
            }
        }
        return capitalizeInitial(sb.toString());
    }

    private String capitalizeInitial(String s) {
        return s.substring(0,1).toUpperCase()+s.substring(1);
    }

    public String getFirstname(){
        return  firstname;
    }

    public String getLastname() {
        return Lastname;
    }
    public String getFullname(){
        return firstname+" "+Lastname;
    }

}
