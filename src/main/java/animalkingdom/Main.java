package animalkingdom;

import java.util.Scanner;

public class Main {

    public static void mealPlan(Pets[] arr){
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j].getName() + " " + arr[j].getFood());
        }
    }

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petCount = info.nextInt();
        Pets allPets[] = new Pets[petCount];
        for(int i = 0; i < petCount; i++){
            System.out.println("What is pet " + (i + 1));
            String type = info.next();
            System.out.println("What is the name of " + (i + 1));
            String name = info.next();
            if(type.equalsIgnoreCase("Lizard")){
                allPets[i] = new Lizard(name);
            }else if(type.equalsIgnoreCase("Cat")){
                allPets[i] = new Cat(name);
            }else if(type.equalsIgnoreCase("Dog")){
                allPets[i] = new Dog(name);
            }else{
                allPets[i] = new Pets(name, "kibbles");
            }
        }

        for(int j = 0; j < petCount; j++){
            System.out.println(allPets[j].getName() + " " + allPets[j].speak());
        }

        mealPlan(allPets);

    }
}
