package jobsheet13;

import java.util.Iterator;
import java.util.Stack;
import java.util.Collections;

public class LoopCollection25 {
  public static void main(String[] args) {
    Stack<String> fruits = new Stack<>();
    fruits.push("Banana");
    fruits.add("Orange");
    fruits.add("Watermelon");
    fruits.add("Leci");
    fruits.push("Salak");

    for (String fruit : fruits) {
      System.out.printf("%s ", fruit);
    }
    System.out.println("\n" + fruits.toString());

    while (!fruits.empty()) {
        System.out.printf("%s ", fruits.pop());
    }

    fruits.push("Melon");
    fruits.push("Durian");
    fruits.push("Strawberry"); 
    fruits.add("Mango");  
    fruits.add("Guava");
    fruits.add("Avocado");

    Collections.sort(fruits);

    System.out.println("\nFruits after sorting :");
    for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
      String fruit = it.next();
      System.out.printf("%s ", fruit);
    }
    System.out.println();

    fruits.stream().forEach(e -> {
        System.out.printf("%s ", e);
    });
    System.out.println();

    for (int i = 0; i < fruits.size(); i++) {
      System.out.printf("%s ", fruits.get(i));
    }
    System.out.println();
  }
}