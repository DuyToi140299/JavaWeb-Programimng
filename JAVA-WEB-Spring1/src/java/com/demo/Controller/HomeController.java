/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.Controller;

import com.demo.dto.products;
import com.demo.model.ProductManager;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class HomeController {
    
    @RequestMapping("/home")
    public String home(Model model) throws ClassNotFoundException, SQLException{
        ProductManager prodM = new ProductManager();
        List<products> list = prodM.getProducts();
        model.addAttribute("list", list);
        return "home";
    }
}
