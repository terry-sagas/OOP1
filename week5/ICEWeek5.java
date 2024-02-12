package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ICEWeek5 {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names? ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Enter name " + (i + 1) + ":");
            names.add(scanner.nextLine());
        }
        
        System.out.println(names);

        System.out.println("Choose a name to delete: ");
        String nameToDelete = scanner.nextLine();
        names.remove(nameToDelete);

        System.out.println("Names: " + names);
        names.add(1, "Tray");
        System.out.println("Names: " + names);
        names.add("Mike");
        System.out.println("Names: " + names);
        System.out.println("Choose a name to replace:");
        String nameToReplace = scanner.nextLine();
        System.out.println("What name will replace it?");
        String replacementName = scanner.nextLine();
        int index = names.indexOf(nameToReplace);
        if (index != -1) {
            names.set(index, replacementName);
        }
        System.out.println("Names: " + names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println("How old is " + names.get(i) + "?");
            String age = scanner.nextLine();
            names.add(i + 1, age);
            i++;
        }
        System.out.println("Names and ages: " + names);
        scanner.close();
    }
}

    

