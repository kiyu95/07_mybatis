package com.ohgiraffers.section01;

import com.ohgiraffers.section01.DTO.CategoryDTO;
import com.ohgiraffers.section01.DTO.MenuAndCategory;

import static com.common.Template.*;

public class Application01 {

    public static void main(String[] args) {

        ElementTestService service = new ElementTestService();

        // 실행 #1
//        service.selectCacheTest();

        // 실행 #2
//        service.selectResultMapTest();

        // 실행 #3
//        service.selectResultMapConstructorTest(); // 생성자 호출

        // 실행 #4
//        service.selectResultMapTest(); // setter 호출

//        MenuAndCategory menu = new MenuAndCategory();
//        menu.getCategory().setCode();
        // menu = menuAndCategory의 heap의 주소값에 접근
        // menu.getCategory() return category(type categoryDTO).setCode();

        // 실행 #5
//        service.selectResultMapAssociationTest();

        // 실행 #6
//        service.selectResultMapCollectionTest();

        // 실행 #7
//        service.selectSqlTest();

        // 실행 #8
        MenuAndCategory menuAndCategory = new MenuAndCategory();
        menuAndCategory.setName("베이글 햄버거");
        menuAndCategory.setPrice(10000);
        menuAndCategory.setOrderableStatus("Y");
        menuAndCategory.setCategory(new CategoryDTO("신규 카테고리"));

        service.insertNewMenu(menuAndCategory);
    }
}
