package org.example._20241002ordersysrestaurantmanager.service;

import org.example._20241002ordersysrestaurantmanager.entity.Menu;
import org.example._20241002ordersysrestaurantmanager.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public Menu getMenuById(Long id) {
        return menuRepository.findById(id).orElse(null);
    }

    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu updateMenu(Long id, Menu menuDetails) {
        Menu menu = menuRepository.findById(id).orElse(null);
        if (menu != null) {
            menu.setMenuName(menuDetails.getMenuName());
            menu.setMenuDescribe(menuDetails.getMenuDescribe());
            menu.setMenuStatus(menuDetails.getMenuStatus());
            menu.setMenuImage(menuDetails.getMenuImage());
            return menuRepository.save(menu);
        }
        return null;
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }
}