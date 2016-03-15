package com.illucit.lomboktest;

public class Main {

    public static void main(String[] args) {
        Entity e = Entity.builder().name("Name").build();
        System.out.println(e.getName());
    }

}
