//Sheri Evangelene
//Week 4 exercises-Java
//May 25-June 10, 2026

import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {

ArrayList<String> obj = new ArrayList<String>();

/*This is how elements should be added to the array list*/

obj.add("Ajeet");
obj.add("Harry");
obj.add("Chaitanya");
obj.add("Steve");
obj.add("Anuj");

/* Displaying array list elements */

System.out.println("Currently the array list has following elements:"+obj);


/*Add element at the given index*/

obj.add(0, "Rahul");
obj.add(1, "Justin");


/*Remove elements from array list like this*/

obj.remove("Chaitanya");
obj.remove("Harry");
System.out.println("Current array list, with removed items, is:"+obj);


/*Remove element from the given index*/
obj.remove(1);
System.out.println("Current array list with removed at index, is:"+obj);


//MY WORk

System.out.println();
//add( Object o): This method adds an object o to the arraylist.
obj.add("hello");
System.out.println("added hello: " + obj);

//add(int index, Object o): It adds the object o to the array list at the given index.
obj.add(2, "bye");
System.out.println("Add obj bye at index position 2: " + obj);

//remove(Object o): Removes the object o from the ArrayList
obj.remove("hello");
System.out.println("removes hello from list: " + obj);

//remove(int index): Removes element from a given index
obj.remove(3);
System.out.println("removes the element at position 3 (Steve): " + obj);

//set(int index, Object o): Used for updating an element. It replaces the element present at the specified index with the object o.
obj.set(2, "Tom");
System.out.println("replace an obj at a specific index: " + obj);

//int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this method returns the value -1.
int pos = obj.indexOf("Tom");
System.out.println("The index of Tom is: " + pos);

//Object get(int index): It returns the object at a specified position. In this case a string because the ArrayList is a String
String str= obj.get(2);
System.out.println("return the object at index 2: " + str);

//int size(): It gives the size of the ArrayList – Number of elements of the list.
int numberofitems = obj.size();
System.out.println("The number of items in this ArrayList is: " + numberofitems);

//boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.
// obj.contains("Steve");
System.out.println("Does the ArrayList contain Steve: " + obj.contains("Steve"));

 //clear(): It is used for removing all the elements of the array list in one go.
 obj.clear();
 System.out.println("The ArrayList contains no objects: " + obj);

}

}

