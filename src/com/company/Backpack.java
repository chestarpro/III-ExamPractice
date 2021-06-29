package com.company;

import com.company.cylindrical.Cylindrical;
import com.company.flat.Flat;
import com.company.spherical.Apple;
import com.company.spherical.Spherical;
import com.company.spherical.TennisBall;

public class Backpack {
    private Spherical[] array;
    private Flat flat;
    private Cylindrical cylindrical;
    private final int id;
    private static int count;

    public Backpack(Spherical[] array, Flat flat, Cylindrical cylindrical) {
        this.array = array;
        this.flat = flat;
        this.cylindrical = cylindrical;
        count++;
        this.id = count;
    }

    public Spherical[] getArray() {
        return array;
    }

    public void setArray(Spherical[] array) {
        this.array = array;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Cylindrical getCylindrical() {
        return cylindrical;
    }

    public void setCylindrical(Cylindrical cylindrical) {
        this.cylindrical = cylindrical;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Backpack №%s: %s | %s | %s", id, getCount(), flat, cylindrical);
    }

    private String getCount() {
        int countApple = 0;
        int countTennis = 0;
        for (Spherical spherical : this.array) {
            if (spherical instanceof Apple) {
                countApple++;
            }
            if (spherical instanceof TennisBall) {
                countTennis++;
            }
        }
        if(countApple != 0 && countTennis == 0) {
            return countApple + " Apples";
        }
        if(countApple == 0 && countTennis != 0) {
            return countTennis + " Tennis Balls";
        }
        if(countApple != 0 & countTennis != 0) {
            return countApple + " Apples, " + countTennis + " Tennis Balls";
        }
        return "";
    }
}
