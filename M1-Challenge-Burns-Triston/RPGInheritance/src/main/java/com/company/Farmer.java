package com.company;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Character {
    private boolean plowing = false;
    private boolean harvesting = false;

    public Farmer(String name) {
        this.setName(name);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }

    public List<String> plowCrops(List<String> crops) {
        List<String> plowedCrops = new ArrayList<String>();

        this.setPlowing(true);
        for(int i = 0; i < crops.size(); i++) {
            System.out.println("Farmer is plowing " + crops.get(i));
            plowedCrops.add(crops.get(i));
        }

        this.setPlowing(false);
        return plowedCrops;
    }

    public String harvestCrop(String crop) {
        this.setHarvesting(true);
        System.out.println("Farmer is harvesting: " + crop);
        return crop;
    }

    public void stopHarvesting() {
        this.setHarvesting(false);
        System.out.println("Farmer has stopped harvesting.");
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}
