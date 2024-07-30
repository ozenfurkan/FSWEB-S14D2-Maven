package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(12, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 24, 3, 2);
        Lamp lamp = new Lamp(LampType.NEON, true, 75);
        Wardrobe wardrobe = new Wardrobe(72, 36, 120.5);  // 'Wardrope' yerine 'Wardrobe'
        Carpet carpet = new Carpet(10, 8, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom",
                wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("Bedroom Name: " + bedroom.getName());
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();

        System.out.println("Wall 1 direction: " + bedroom.getWall1().getDirection());
    }
}
