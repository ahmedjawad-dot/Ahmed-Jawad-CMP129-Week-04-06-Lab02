/*
 * Student Name: Jawad Ahmed
 * Course: CMP 129
 * Week: 4
 * Lab: 2
 * Assignment: Sorting Algorithm Benchmark
 * Date: 10/2/2026
 */
public class SortingBenchmarks {
    public static void main(String[] args) {
        int[] original = {7,3,4,5,6,10,7,0,2,57,67,25,9,9,1,30,8,12,99,50};  //creates array with 20 declared numbers
        int[] copy = new int[original.length];                      //creates array named copy with same number of indexes

        for(int i = 0; i < original.length; i++){                   //copies every index from original to copy
            copy[i]=original[i];
        }
        int bs_exchanges =bubbleSort(copy);                                       //runs bubble sort method
        System.out.print("Bubble sort: ");
        for(int i = 0; i < copy.length; i++){       //loop to print bubble sort array
            System.out.print(copy[i] + " ");
        }
        System.out.println();
        System.out.println("Number of exchanges: " + bs_exchanges);     //prints number of bubble sort exchanges
        
        int ss_exchanges =selectionSort(original);                            //runs selection sort method
        System.out.print("Selection sort: ");
        for(int i = 0; i < original.length; i++){       //loop to print selection sort array
            System.out.print(original[i] + " ");
        }
        System.out.println();
        System.out.println("Number of exchanges: " + ss_exchanges);      //prints number of bubble sort exchanges

        if (ss_exchanges < bs_exchanges)                     //prints which sort method had the least exchanges
            System.out.println("selection sort made fewer exchanges");
        else
            System.out.println("bubble sort made fewer exchanges");
    }
    public static int selectionSort(int original[]){            //selection sort method
        int s_exchange = 0;
        for (int l = 0; l < original.length - 1; l++){      //loop for positions where l is index to be filled
            int smallest = l;                                   //start position holds smallest value
            for (int m = l+1; m < original.length; m++){        //scans array for the smallst value
                if(original[m]< original[smallest]){
                    smallest = m;                               //stores current smallest value
                }
            }
            if (smallest !=l){              //if smallest value is found in the array,
                int temp = original[l];     
                original[l]=original[smallest]; //places smallest value in position 1
                original[smallest] = temp;
                s_exchange += 1;             //accumlates number of exchanges
            }
        }
        return s_exchange;
    }

    public static int bubbleSort(int copy[]){               //bubble sort method
        int b_exchange=0;
        int temp = 0;
        for (int j = 0; j < copy.length - 1; j++){          // j loops for amount of times going through array
            for (int k = 0; k < copy.length - 1; k++)       //k compares adjacent numbers
                if (copy[k] > copy[k+1]){       //if left value is bigger than right, change order
                    temp = copy[k];             //store left value
                    copy[k] = copy[k+1];        //move right value to left spot
                    copy[k+1] = temp;       //put stored left value in right spot
                    b_exchange += 1;      //accumulates number of exchanges
                }
                
        
        }
        return b_exchange;
    }

}
