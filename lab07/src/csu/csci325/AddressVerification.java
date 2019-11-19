/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author jeanieherold
 */
public class AddressVerification {
    
    //fields
    String eMessage;
    
    //constructor
    
    //methods
    public Boolean validateAddress (String add) {
        
        String[] addressParts = add.split(",");
        
        boolean isValidAddress = false;
        
        //check format has 3 sections
        try {
            if (checkFormat(add)) {
                isValidAddress = true;
            }
        } catch (InvalidAddressException e) {
            System.out.println(eMessage);
            isValidAddress = false;
            return isValidAddress;
        }
        
        //check street address has 2 valid portions
        try {
            if (checkStreetAdd(addressParts[0])) {
                isValidAddress = true;
            }
        } catch (InvalidAddressException e) {
            System.out.println(eMessage);
            isValidAddress = false;
            return isValidAddress;
        }

        //check city
        try {
            if (checkCity(addressParts[1])) {
                isValidAddress = true;
            }
        } catch (InvalidAddressException e) {
            System.out.println(eMessage);
            isValidAddress = false;
            return isValidAddress;
        }

        //check state and zip
        try {
            if (checkStateZip(addressParts[2])) {
                isValidAddress = true;
            } 
        } catch (InvalidAddressException e) {
            System.out.println(eMessage);
            isValidAddress = false;
            return isValidAddress;
        }
    
        System.out.println("Address is Valid");
        return isValidAddress;  
    }
    
    //check address has 3 parts separated by a comma
    public Boolean checkFormat (String sAddress) throws InvalidAddressException {
        
        boolean hasThree = false;
        int commaCount = 0;
        
        for (int i = 0; i < sAddress.length() - 1; i++) {
            if (sAddress.charAt(i) == ',') {
                commaCount++;
            } 
        }
        
        if (commaCount == 2) {
            hasThree = true;
        } else {
            eMessage = "You have entered an invalid address, goodbye.";
            throw new InvalidAddressException();
        }
        
        return hasThree;
    }
    
    //check valid street address
    public Boolean checkStreetAdd (String streetAdd) throws InvalidAddressException {
        
        boolean streetHasTwo = false;
        
        String[] arrStreetAddParts = streetAdd.split(" ");
        
        if (arrStreetAddParts.length < 2) {
            eMessage = "You have entered an invalid street address, goodbye.";
            throw new InvalidAddressException();
        }
        
        if (arrStreetAddParts[0].matches("[0-9]+")) {
            streetHasTwo = true;
        } else {
            eMessage = "You have entered an invalid street number, goodbye.";
            throw new InvalidAddressException();
        }
        
        if (arrStreetAddParts.length == 2) {
            if (arrStreetAddParts[1].length() == 1) {
                eMessage = "You have entered an invalid street name, goodbye";
                throw new InvalidAddressException();
            }
        } 
        return streetHasTwo;
    }
    
    //check city
    public Boolean checkCity (String city) throws InvalidAddressException {
        boolean isCity = false;
        
        city = city.trim();
        if (city.length() <=2) {
            eMessage = "You have entered an invalid city, goodbye";
            throw new InvalidAddressException();
        } else {
            isCity = true;
        }

        return isCity;
    }
    
    //check state zip
    public boolean checkStateZip (String stateZip) throws InvalidAddressException {
        boolean isStateZip = false;
        
        stateZip = stateZip.trim();
        String[] arrStZip = stateZip.split(" ");
        
        if (arrStZip[0].length() != 2 || arrStZip.length == 1) {
            eMessage = "You have entered an invalid state, goodbye.";
            throw new InvalidAddressException();
        } 
        
        if (arrStZip[1].matches("[0-9]+") && arrStZip[1].length() == 5 ) {
            isStateZip = true;
        } else {
            eMessage = "You have entered an invalid zip code, goodbye.";
            throw new InvalidAddressException();
        }

        return isStateZip;
    }
    
}
