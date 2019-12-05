package com.company;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	// At the first Go / No Go poll, every Elf is Go until the Fuel Counter-Upper. They haven't determined the amount of fuel required yet.
        //
        //Fuel required to launch a given module is based on its mass. Specifically, to find the fuel required for a module, take its mass, divide by three, round down, and subtract 2.
        //
        //For example:
        //
        //For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
        //For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
        //For a mass of 1969, the fuel required is 654.
        //For a mass of 100756, the fuel required is 33583.
        //The Fuel Counter-Upper needs to know the total fuel requirement. To find it, individually calculate the fuel needed for the mass of each module (your puzzle input), then add together all the fuel values.

        String input = "1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,13,1,19,1,19,6,23,1,23,6,27,1,13,27,31,2,13,31,35,1,5,35,39,2,39,13,43,1,10,43,47,2,13,47,51,1,6,51,55,2,55,13,59,1,59,10,63,1,63,10,67,2,10,67,71,1,6,71,75,1,10,75,79,1,79,9,83,2,83,6,87,2,87,9,91,1,5,91,95,1,6,95,99,1,99,9,103,2,10,103,107,1,107,6,111,2,9,111,115,1,5,115,119,1,10,119,123,1,2,123,127,1,127,6,0,99,2,14,0,0";

        String [] inputArr = input.split(",");
        ArrayList <Integer> intArr = new ArrayList<Integer>();

        intArr.set(1, 12);
        intArr.set(2, 2);

        for (int i = 0; i < inputArr.length; i+= 4) {

            if (intArr.get(i).equals(1)){
                intArr.set(intArr.get(i+3), intArr.get(intArr.get(i+1))+intArr.get(intArr.get(i+2)));
            }

            if (intArr.get(i).equals(99)){
                break;
            }
            if (intArr.get(i).equals(2)) {
                intArr.set(intArr.get(i+3), intArr.get(intArr.get(i+1))*intArr.get(intArr.get(i+2)));
            }
        }
        System.out.println(intArr.get(0));



    }
    public static int calcMass (int input){
        int output = (input/3)-2;

        if (output > 0) {
            return output;
        }
        else return 0;
    }


}
