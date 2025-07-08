package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Bedroom bedroom = new Bedroom("sena",
        new Wall("sağ"),
                new Wall("sol"),
                new Wall("kuzey"),
                new Wall("güney"),
                new Ceiling(10, PaintColor.RED),
                new Bed("kral tipi", 3, 200, 200, 200),
                new Lamp(LampType.LAVA, true, 3),
                new Wardrobe(1,1,1.1),
                new Carpet(1,1,PaintColor.GREEN)
        );

        System.out.println(bedroom);


    }
}