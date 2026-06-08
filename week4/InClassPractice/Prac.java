

public class Prac {
    public static void main(String[] args) {
        String s2 = new String ("Welcome to Java");
        String s1 = "Welcome to Java";


        //compares the memory address. Not the same obj because s2 is a "new" obj
          if (s1 == s2){
            System.out.println("== is true");
        }

        //compares the content
        if (s1.equals(s2)){
            System.out.println("Equals is true");
        }

        //It compares alphabetically in a String. apple < banana
        if (s1.compareTo(s2) > 0){
            System.out.println("s1 is greater than s2");
        }else if (s1.compareTo(s2) == 0){
                System.out.println("They are equal");
            }else{
                System.out.println("s2 is greater than s1");
            }
        }

    
    }
}
