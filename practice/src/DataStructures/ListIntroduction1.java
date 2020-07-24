package DataStructures;

import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //Create an empty list which will contain names (strings)
        //Print out the number of elements in the list
        //Add William to the list
        //Print out whether the list is empty or not
        //Add John to the list
        //Add Amanda to the list
        //Print out the number of elements in the list
        //Print out the 3rd element

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        if (names.isEmpty()) {
            System.out.println("empty list");
        } else System.out.println("list is not empty");

        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        //Iterate through the list and print out each name
        for (String name: names) {
            System.out.println(name);
        }
        //Iterate through the list and print
        for (int i = 0; i < names.size() ; i++) {
            System.out.println((i+1) + ". " + names.get(i));
        }
        // Remove the 2nd element
        names.remove(1);
        //Iterate through the list in a reversed order and print out each name
        for (int i = names.size()-1; i >=0; i--) {
            System.out.println(names.get(i));
        }
        //Remove all elements
        names.clear();
        System.out.println(names.size());

        }

    }



