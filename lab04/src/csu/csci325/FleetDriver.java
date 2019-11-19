/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;

/**
 *
 * @author jeanieherold
 */
public class FleetDriver {
    
    public static void main(String[] args) {
        
        //testing Boat class
        Boat boat = new Boat("Sunshine", 1966);
        System.out.println(boat);
        System.out.println(boat.getName());
        System.out.println(boat.getYearBuilt());
        boat.setName("Moonshine");
        boat.setYearBuilt(1968);
        System.out.println(boat);
        
        //testing SailBoat class
        SailBoat sail = new SailBoat("Sunday", 1968, 23);
        System.out.println(sail);
        System.out.println(sail.getName());
        System.out.println(sail.getYearBuilt());
        System.out.println(sail.getPassengers());
        sail.setName("Woodstock");
        sail.setPassengers(77);
        System.out.println(sail.toString());
        
        //testing TugBoat class
        TugBoat tug = new TugBoat("Tooney", 1955, 70);
        System.out.println(tug.toString());
        System.out.println(tug.getName());
        System.out.println(tug.getCapacity());
        tug.setCapacity(153);
        System.out.println(tug.getCapacity());
        System.out.println(tug.toString());
        
        //testing Fleet class
        Fleet fleetList = new Fleet();
        fleetList.addBoat(tug);
        System.out.println(fleetList.getFleet());
        fleetList.addBoat(sail);
        System.out.println(fleetList.getFleet());
        fleetList.addBoat(boat);
        System.out.println(fleetList.getFleet());
        fleetList.removeBoat("Moonshine", 1968);
        System.out.println(fleetList.getFleet());
        
        
    }
    
}
