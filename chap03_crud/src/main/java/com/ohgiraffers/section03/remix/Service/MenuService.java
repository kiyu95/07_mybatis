package com.ohgiraffers.section03.remix.Service;

import com.ohgiraffers.dto.MenuDTO;
import com.ohgiraffers.section03.remix.model.RemixMenuDAO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getJavaSqlSession;
import static com.ohgiraffers.common.Template.getRemixSqlSession;

public class MenuService {

    private RemixMenuDAO menuDAO;

    public List<MenuDTO> selectAllMenu(){
        SqlSession session = getRemixSqlSession();

        menuDAO = session.getMapper(RemixMenuDAO.class);

        List<MenuDTO> menuList = menuDAO.selectAllMenu(session);
        session.close();
        return menuList;
    }

    public MenuDTO selectByMenuCode(int code) {
        SqlSession session = getRemixSqlSession();

        menuDAO = session.getMapper(RemixMenuDAO.class);

        MenuDTO menu = menuDAO.selectByMenuCode(code);
        session.close();
        return menu;
    }

    public boolean registMenu(MenuDTO menu) {
        SqlSession session = getRemixSqlSession();

        menuDAO = session.getMapper(RemixMenuDAO.class);

        int result = menuDAO.registMenu(menu);

        if (result > 0){
            session.commit();
        } else {
            session.rollback();
        }
        session.close();

        return result > 0 ? true : false;
    }

    public boolean modifyMenu(MenuDTO menu) {
        SqlSession session = getRemixSqlSession();

        menuDAO = session.getMapper(RemixMenuDAO.class);

        int result = menuDAO.modifyMenu(session, menu);

        if (result > 0){
            session.commit();
        } else {
            session.rollback();
        }
        session.close();

        return result > 0 ? true : false;

    }

    public boolean deleteMenu(int code) {
        SqlSession session = getRemixSqlSession();

        menuDAO = session.getMapper(RemixMenuDAO.class);

        int result = menuDAO.deleteMenu(session, code);

        if (result > 0){
            session.commit();
        } else {
            session.rollback();
        }
        session.close();

        return result > 0 ? true : false;
    }
}
