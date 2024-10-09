package InterView_Question;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberSubset {
    static List<String> phone(String procedded,String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(procedded);
            return list;
        }
        //CONVERT STRING NUMBER TO INTEGER
        int digit=str.charAt(0) -'0';
        //CREATE A ARRAYLIST TO ADD ANS
        ArrayList<String> list=new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch= (char) ('a'+i);
            list.addAll(phone(procedded+ch,str.substring(1)));
        }
        return list;
    }
    public static List<String> letterCombinations(String digits) {
        String p=null;
        if(digits.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int num=digits.charAt(0)+'0';
        ArrayList<String> list=new ArrayList<>();
        for (int i = (num-1)*3; i <num*3 ; i++) {
            char ch=(char) ('a'+i);
            list.addAll((letterCombinations(digits.substring(1)+ch)));
        }
       return list;
    }
    public static void main(String[] args) {
//        System.out.println(phone("","12"));

    }
}
