package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.model.SearchCriteria;

import java.util.*;

import static com.ohgiraffers.common.Template.*;

public class Application01 {

    public static void main(String[] args) {

        MenuService menuService = new MenuService();

        // 실행 #1
//        menuService.selectMenuByPrice(5000);

        // 실행 #2
//        menuService.searchMenu(new SearchCriteria("category", "한식"));

        // 실행 #3
//        menuService.searchMenu(new SearchCriteria("name", "마늘"));

        // 실행 #4
//        SearchCriteria criteria = new SearchCriteria("value", "음료");
//        menuService.searchMenuBySubCategory(criteria);

        // 실행 #5
//        SearchCriteria criteria = new SearchCriteria("value", "음료");
//        menuService.searchMenuByRandomMenuCode(createRandomMenuCodeList());

        // 실행 #6
//        SearchCriteria criteria = new SearchCriteria("menuCode", "1");
//        menuService.searchMenuByCodeOrSearchAll(criteria);

        // 실행 #7
//        Map<String, Object> test = new HashMap<>();
//        test.put("nameValue", "새우");
//        test.put("categoryValue", "5");
//        menuService.searchMenuByNameOrCategory(test);

        // 실행 #8
        Map<String, Object> test = new HashMap<>();
        test.put("name", "보리");
        test.put("categoryCode", "5");
        test.put("orderableStatus", "Y");
        test.put("code", "1");
        menuService.modifyMenu(test);
    }

    public static List<Integer> createRandomMenuCodeList(){
        Set<Integer> set = new HashSet<>();
        while (set.size() < 5){
            int temp = ((int) (Math.random() * 21)) + 1;
            set.add(temp);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}
