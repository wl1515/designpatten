package com.example.designpatten.strategy.old;

public class DiscoutWay {

    public void getDiscoutWsy(int way){
        if(way == 1){
            System.out.println("立减");
        }else if(way == 2){
            System.out.println("立折");
        }else{
            System.out.println("不打折");
        }
    }

}
