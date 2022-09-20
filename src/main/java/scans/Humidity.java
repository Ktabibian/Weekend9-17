package scans;

import java.util.Scanner;

public class Humidity {

    public static String tempCheck(String temp){
        if(temp.equalsIgnoreCase("High")){
            return "sunblock may be needed";
        }else if(temp.equalsIgnoreCase("Low")){
            return "a coat may be needed";
        }else if(temp.equalsIgnoreCase("Humid")){
            return "it's muggy!";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        String temp;
        System.out.println("What is the temperature?");
        temp = check.next();
        while(!(temp.equalsIgnoreCase("High")) && !(temp.equalsIgnoreCase("Low")) && !(temp.equalsIgnoreCase("Humid"))) {
            System.out.println("What is the temperature?");
            temp = check.next();
        }
        System.out.println(tempCheck(temp));

//        }if(temp.equalsIgnoreCase("High")){
//            System.out.println("sunblock may be needed");
//        }else if(temp.equalsIgnoreCase("Low")){
//            System.out.println("a coat may be needed");
//        }else if(temp.equalsIgnoreCase("Humid")){
//            System.out.println("it's muggy!");
//        }
    }
}
