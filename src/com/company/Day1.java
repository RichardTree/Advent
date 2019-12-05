//package com.company;
//
//import java.sql.Array;
//import java.util.ArrayList;
//
//public class Main {
//
//  public static void main(String[] args) {
//
//    // At the first Go / No Go poll, every Elf is Go until the Fuel Counter-Upper. They haven't determined the amount of fuel required yet.
//    //
//    //Fuel required to launch a given module is based on its mass. Specifically, to find the fuel required for a module, take its mass, divide by three, round down, and subtract 2.
//    //
//    //For example:
//    //
//    //For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
//    //For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
//    //For a mass of 1969, the fuel required is 654.
//    //For a mass of 100756, the fuel required is 33583.
//    //The Fuel Counter-Upper needs to know the total fuel requirement. To find it, individually calculate the fuel needed for the mass of each module (your puzzle input), then add together all the fuel values.
//
//    String input = "51585\n"
//        + "137484\n"
//        + "73634\n"
//        + "71535\n"
//        + "87274\n"
//        + "74243\n"
//        + "127025\n"
//        + "66829\n"
//        + "138729\n"
//        + "145459\n"
//        + "118813\n"
//        + "82326\n"
//        + "82518\n"
//        + "145032\n"
//        + "148699\n"
//        + "105958\n"
//        + "103969\n"
//        + "72689\n"
//        + "145061\n"
//        + "70385\n"
//        + "53104\n"
//        + "107851\n"
//        + "103392\n"
//        + "107051\n"
//        + "123475\n"
//        + "123918\n"
//        + "56709\n"
//        + "89284\n"
//        + "86208\n"
//        + "71943\n"
//        + "109257\n"
//        + "108272\n"
//        + "124811\n"
//        + "142709\n"
//        + "115650\n"
//        + "53607\n"
//        + "142891\n"
//        + "144135\n"
//        + "114277\n"
//        + "138671\n"
//        + "111998\n"
//        + "70838\n"
//        + "69802\n"
//        + "107210\n"
//        + "103319\n"
//        + "60377\n"
//        + "58639\n"
//        + "131863\n"
//        + "100807\n"
//        + "118360\n"
//        + "52573\n"
//        + "108207\n"
//        + "128009\n"
//        + "96180\n"
//        + "148492\n"
//        + "112914\n"
//        + "72867\n"
//        + "140991\n"
//        + "131267\n"
//        + "125123\n"
//        + "58393\n"
//        + "129615\n"
//        + "87239\n"
//        + "63085\n"
//        + "59231\n"
//        + "95007\n"
//        + "147712\n"
//        + "109838\n"
//        + "89829\n"
//        + "55634\n"
//        + "96163\n"
//        + "52323\n"
//        + "106701\n"
//        + "141511\n"
//        + "125349\n"
//        + "137267\n"
//        + "50694\n"
//        + "53692\n"
//        + "57466\n"
//        + "117769\n"
//        + "63535\n"
//        + "101708\n"
//        + "113593\n"
//        + "79163\n"
//        + "112327\n"
//        + "91994\n"
//        + "129674\n"
//        + "58076\n"
//        + "145062\n"
//        + "122730\n"
//        + "102481\n"
//        + "109994\n"
//        + "136271\n"
//        + "111178\n"
//        + "117920\n"
//        + "107933\n"
//        + "104305\n"
//        + "99613\n"
//        + "68482\n"
//        + "126543";
//
//    String [] inputArr = input.split("\n");
//    ArrayList <Integer> intArr = new ArrayList<Integer>();
//
//    int total = 0;
//    int remainder = 0;
//    for (int i = 0; i < inputArr.length; i++) {
//      intArr.add(Integer.parseInt(inputArr[i]));
//      total += calcMass(intArr.get(i));
//
//      boolean remaindernotzero = false;
//      remainder = calcMass(intArr.get(i));
//
//      while (remaindernotzero == false)
//
//        if (calcMass(remainder) > 0) {
//          total += calcMass(remainder);
//          remainder = calcMass(remainder);
//        } else {
//          remaindernotzero = true;
//        }
//    }
//    System.out.println(total);
//
//
//
//  }
//  public static int calcMass (int input){
//    int output = (input/3)-2;
//
//    if (output > 0) {
//      return output;
//    }
//    else return 0;
//  }
//
//
//}
