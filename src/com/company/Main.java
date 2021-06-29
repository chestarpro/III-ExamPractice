package com.company;

import com.company.cylindrical.Bottle;
import com.company.flat.Book;
import com.company.flat.Folder;
import com.company.liquid.CocaCola;
import com.company.liquid.Water;
import com.company.spherical.Apple;
import com.company.spherical.Spherical;
import com.company.spherical.TennisBall;

public class Main {

    public static void main(String[] args) {
        Spherical[] apples = new Apple[20];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple();
        }
        Backpack backpack1 = new Backpack(apples, new Book("Jamila", "Chyngyz Aitmatov"), new Bottle(new CocaCola()));

        Spherical[] tennisBalls = new TennisBall[50];
        for (int i = 0; i < tennisBalls.length; i++) {
            tennisBalls[i] = new TennisBall();
        }
        Backpack backpack2 = new Backpack(tennisBalls, new Folder(), new Bottle(new Water()));

        Spherical[] appleAndBalls = new Spherical[13];
        for (int i = 0; i < appleAndBalls.length; i++) {
            if(i < 10) {
                appleAndBalls[i] = new Apple();
            } else  appleAndBalls[i] = new TennisBall();
        }
        Backpack backpack3 = new Backpack(appleAndBalls, new Folder(), new Bottle(new CocaCola()));

        System.out.println(backpack1);
        System.out.println(backpack2);
        System.out.println(backpack3);
    }
}
