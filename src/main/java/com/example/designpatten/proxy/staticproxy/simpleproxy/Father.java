package com.example.designpatten.proxy.staticproxy.simpleproxy;

import com.example.designpatten.proxy.Person;

public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findlove(){
        System.out.println("开始物色对象");
        this.person.findLove();
        System.out.println("双方同意，开始相处 ");
    }
}
