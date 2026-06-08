//Sheri Evangelene
//Week 4 exercises-Java
//May 25-29, 2026

import java.util.Arrays;

public class arraysExercise { 
    //  int[] arr =new int[3] when you don't provide values. ={} when you provide values
    int[] arr = {1,2,3,4,5,6,7,8,9,10}; 
    

//1.Java Method to Calculate Sum & Average of all elements of an integer Array size 10.
//void = this method does not return a value
    void sumAndAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println((double) sum / arr.length);
    }

//2. Java Method to Increment Every Element of the Array by One & Print Incremented Array
    void arrayIncrement (int[] arr){
        int increment;
    for (int i = 0; i < arr.length; i++){
        increment = arr[i] +1; 
        System.out.println(increment);   
    }    
    } 

//3. Java Method to Input an Array, Store the Squares and cubes of these elements in new Arrays & Print those.   
    void squaresAndCubes(int[] arr){
        int[] arrSquare = new int[arr.length];
        int[] arrCube = new int[arr.length];

         for (int i = 0; i < arr.length; i++){
            arrSquare[i] =arr[i] *arr[i];
            arrCube[i] = arr[i] *arr[i] *arr[i];

            System.out.println(arrSquare[i]);
            System.out.println(arrCube[i]);
         }
    }

// 4. Java Method that finds largest element present in an integer array. It must also print the location or index at which maximum element occurs in array.
    void largestElement(int[] arr){
        int largest = arr[0];
        int largestIndex = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
                largestIndex =i;
            }
        }
        System.out.println(largest);
        System.out.println(largestIndex);
    }    
    
//5. Java Method to Read an Array and Search for an Element
        void readAndSearch(int[] arr, int target){
            boolean found = false;
            for (int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                    System.out.println(i);
                    found = true;
                }
                }
                if (!found){
                    System.out.println("Element not found");
            }
        }

//6. Java Method to Print the Number of Odd & Even Numbers in an Array        
      void oddandEven (int arr[]){
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                evenCount += 1;
            }else{
                oddCount += 1;
            }
        }
        System.out.println("There are " + evenCount + " even numbers in the array");
        System.out.println("There are " + oddCount + " odd numbers in the array");
      }

//7. Java Method to Sort the Array in an Ascending Order and Descending Order     
      void acsendingAndDesecending(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--){
        System.out.println(arr[i]);
        }
      }

//8. Java Method to Find the Second Largest & Smallest Elements in an Array      
        void secondLargestAndSmallest (int[] arr){
            Arrays.sort(arr);
            System.out.println("The second smallest number is " + arr[1]);
            System.out.println("The second largest number is " + arr[arr.length -2]);
        }

//9. Java Method to Print All the Repeated Numbers with Frequency in an Array
        void repeatedNumbers(int[] arr){
            for (int i = 0; i < arr.length; i++){
                int count =0;
                 for (int j = 0; j < arr.length; j++){
                    if (arr[j] == arr[i]){
                        count++;
                    }
                 }
                if (count > 1){
                    System.out.println(arr[i] + "appears " + count + " times");
                } 
            }
        } 
        
//10. Java Method to Merge the Elements of 2 Sorted Array 
//System.arraycopy(src, srcStart, dest, destStart, length); 
        void sortedArrayMerge(int[] arr1, int[]arr2){
            int[] arr =new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, arr, 0, arr1.length);
            System.arraycopy(arr2,0, arr, arr1.length, arr2.length );
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        }

//11. Java Method to Insert an Element in a Specified Position in a given Array
//System.arraycopy(src, srcStart, dest, destStart, length)
        void insertElement(int[] arr, int element, int position){
            int[] newArr= new int[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, position);
            newArr[position]= element;
            System.arraycopy(arr, position, newArr, position +1, arr.length-position);
             for (int i = 0; i < newArr.length; i++){
                 System.out.println(newArr[i]);
             }

        }

//12. Java Method to Delete the Specified Integer from an Array 
//System.arraycopy(src, srcStart, dest, destStart, length)     
        void deleteInteger(int[] arr, int index){
            int[] newArr= new int[arr.length - 1];
            System.arraycopy(arr,0,newArr,0, index);
            System.arraycopy(arr, index +1,newArr, index ,arr.length -index -1);
             for (int i = 0; i < newArr.length; i++){
                 System.out.println(newArr[i]);
             }            
        }

    public static void main(String args[]){
        arraysExercise arr1 = new arraysExercise();
        
        arr1.sumAndAverage(arr1.arr);
        System.out.println();
        arr1.arrayIncrement(arr1.arr);
        System.out.println();
        arr1.squaresAndCubes(arr1.arr);
        System.out.println();
        arr1.largestElement(arr1.arr);
        System.out.println();
        arr1.readAndSearch(arr1.arr, 4);
        System.out.println();
        arr1.oddandEven(arr1.arr);
        System.out.println();
        int[] arr2 = {2,6,7,5,4,9,1,2,9,10};
        arr1.acsendingAndDesecending(arr2);       
        System.out.println();
        arr1.secondLargestAndSmallest(arr2);
        System.out.println();
        arr1.repeatedNumbers(arr2);
        System.out.println();
        arr1.sortedArrayMerge(arr1.arr, arr2);
        System.out.println();
        arr1.insertElement(arr1.arr, 99, 3);
        System.out.println();
        arr1.deleteInteger(arr1.arr, 4);

    }

    
   

}