package kz.bitlab.springboot.springbootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import kz.bitlab.springboot.springbootdemo.model.Items;

import java.util.List;
import java.util.ArrayList;

@Controller
public class HomeController{
    @GetMapping
    public String index(Model model){
        List<Items> list=new ArrayList<>();
        list.add(new Items(1L, "Mac Book Pro", "8 GB RAM 256GB SSD Intel Core i7", 1999.99));
        list.add(new Items(2L, "Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1",1499.99));
        list.add(new Items(3L,"Mac Book Pro", "16 GB RAM 1024 GB SSD Apple M1", 1799.99));
        list.add(new Items(4L, "ASUS Tuf Gaming","16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        list.add(new Items(5L, "HP Laser Pro", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
        list.add(new Items(6L, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));
        list.add(new Items(7L, "Acer nitro 5", "16 GB RAM 512 GB SSD AMD Ryzen 5 6600H", 792.49));
        list.add(new Items(8L, "iPhone 15", "6 GB RAM 256 GB", 750));
        model.addAttribute("items", list);
        return "index";
    }
}