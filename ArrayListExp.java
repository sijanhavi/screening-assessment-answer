import java.util.ArrayList;

public class ArrayListExp {
public static void main(String[] args) {

ArrayList<String> arrayList = new ArrayList<>();
// Adding elements to the ArrayList
   arrayList.add("kiwi");
   arrayList.add("orange");
   arrayList.add("banana");
   arrayList.add("apple");
   arrayList.add("litchi");
   System.out.println("ArrayList: " + arrayList);
   if (!arrayList.isEmpty()) {
   String firstElement = arrayList.get(0);
   System.out.println("First Element: " + firstElement);
   }
   if (!arrayList.isEmpty()) {
   String lastElement = arrayList.get(arrayList.size() - 1);
   System.out.println("Last Element: " + lastElement);
   }
   String elementToFind = "papaya";
   if (arrayList.contains(elementToFind)) {
   System.out.println(elementToFind + " exists in the ArrayList.");
   } else {
   System.out.println(elementToFind + " does not exist in the ArrayList.");
   }
   String elementToRemove = "orange";
   if (arrayList.contains(elementToRemove)) {
   arrayList.remove(elementToRemove);
   System.out.println("Removed " + elementToRemove + " from the ArrayList.");
   } else {
   System.out.println(elementToRemove + " does not exist in the ArrayList.");
   }
   if (arrayList.isEmpty()) {
   System.out.println("ArrayList is empty.");
   } else {
   System.out.println("ArrayList is not empty.");
 
  }
}

}
 