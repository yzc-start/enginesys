package com.example.demo.service.ServiceImpl;

import com.example.demo.mapper.MenuMapper;
import com.example.demo.model.Menu;
import com.example.demo.service.IMenueService;
import org.springframework.stereotype.Service;
import sun.util.resources.cldr.rof.CalendarData_rof_TZ;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class IMenuServiceImpl implements IMenueService {
    @Resource
    MenuMapper menuMapper;

    @Override
    public List<Menu> selectMenu() {
        List<com.example.demo.model.Menu> menus = menuMapper.selectMenu();
//        System.out.println(menus);
        //传递到前端
        ArrayList<Menu> meunList = new ArrayList<>();

        //数据处理
        for (Menu fmenu : menus) {
            Integer id = fmenu.getId();
            ArrayList<Menu> zmenuList = new ArrayList<>();
            for (Menu zmenu : menus) {
                if (zmenu.getFid()==id){
                    zmenuList.add(zmenu);
                    fmenu.setChildren(zmenuList);
                }
            }
            if (fmenu.getFid()==null){
                meunList.add(fmenu);
            }

        }
        return meunList;
    }
}
