package InterView_Question;

import java.util.ArrayList;

public class Dice {

    //NORMAL PRINT
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
        dice(p+i,target-i);
        }
    }

    //ADDING IN ARRAYlIST
    static ArrayList<String> DiceArrayList(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            list.addAll(DiceArrayList(p + i, target - i));
        }
        return list;
    }
    public static void main(String[] args) {
//        dice("",4);
        System.out.println(DiceArrayList("",6));
    }
}
