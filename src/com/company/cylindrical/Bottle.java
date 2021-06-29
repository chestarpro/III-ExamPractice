package com.company.cylindrical;

import com.company.liquid.Liquid;

public class Bottle extends Cylindrical {
    private Liquid liquid;

    public Bottle(Liquid liquid) {
        this.liquid = liquid;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return "Bottle of " + liquid;
    }
}
