package kz.bitlab.springboot.springbootdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items{
    private Long id;
    private String name;
    private String description;
    private double price;
}
