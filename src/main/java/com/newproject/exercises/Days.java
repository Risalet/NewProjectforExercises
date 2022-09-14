package com.newproject.exercises;

public class Days {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n);
        String [] week = new String[7];
        week[0] = "日" ;
        week[1] = "月" ;
        week[2] = "火" ;
        week[3] = "水" ;
        week[4] = "木" ;
        week[5] = "金" ;
        week[6] = "土" ;

        for (int i = n; i <= week.length; i++){
            System.out.print(week[i]);
            int surplus = week.length % 7;
            if (surplus != 0 ){
                for(int j = 0; j < n; j++){
                    System.out.print(week[j]);
                }
            }else{
                break;
            }
        }
    }
}
