package com.java8works;

import java.util.*;

public class Sample {
    
    public static int[] arrangeFlowers(int[] flowerStems, int K) {
        int N = flowerStems.length;
        int[] answer = Arrays.copyOf(flowerStems, N);
        
        // Sorting the first K elements in increasing order
        Arrays.sort(answer, 0, K);
        
        // Sorting the remaining elements in decreasing order
        Arrays.sort(answer, K, N);
        for (int i = K, j = N - 1; i < j; i++, j--) {
            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }
        
        return answer;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        // Input for the number of flowers (N)
//        int N = in.nextInt();
        int[] flowerStems = {11,7,5,43,16,8,0,2};

        // Input for flower stem lengths
//        for (int i = 0; i < N; i++) {
//            flowerStems[i] = in.nextInt();
//        }

        // Input for K (number of elements to be sorted in ascending order)
//        int K = in.nextInt();

        // Validating K to prevent errors
//        if (K < 0 || K > N) {
//            System.out.println("Invalid value of K");
//            return;
//        }

        // Getting the arranged flower order
        int[] arrangedFlowers = arrangeFlowers(flowerStems, 3);

        // Output the final arrangement
        for (int length : arrangedFlowers) {
            System.out.print(length + " ");
        }
    }
}

