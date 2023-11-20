package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.section01.xmlconfig.controller.MenuController;

import java.util.HashMap;
import java.util.Map;

import static com.ohgiraffers.common.Template.*;

public class Application {

    public static void main(String[] args){
//        System.out.println(getSqlSession()); // 잘 동작되는지 먼저 확인
        MenuController menuController = new MenuController();
//
//        Map<String, String> test = new HashMap<>();
//        test.put("code", "4");
//        menuController.selectMenuByCode(test);
//
//        System.out.println("==========");
//
//        Map<String, String> test2 = new HashMap<>();
//        test2.put("name", "테스트 메뉴");
//        test2.put("price", "3000");
//        test2.put("category" , "4");
//        menuController.registMenu(test2);
//
//        System.out.println("==========");
//        Map<String, String> test3 = new HashMap<>();
//        test3.put("name", "테스트 메뉴");
//        test3.put("code", "4");
//        test3.put("status", "Y");
//        test3.put("price", "3000");
//        test3.put("category", "4");
//        menuController.modifyMenu(test3);

//        System.out.println("==========");
//        menuController.deleteMenu(110);

        menuController.selectAllMenu();

    }
}
