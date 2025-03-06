package com.java8works;
import java.util.*;

public class Solution {
    
    public static int findVirusApplication(int[] applications) {
        List<Integer> appList = new ArrayList<>();
        for (int app : applications) {
            appList.add(app);
        }

        while (appList.size() > 1) {
            // Calculate group value using floor division
            int sum = 0;
            for (int id : appList) {
                sum += id;
            }
            int groupValue = sum / 2;  // Floor division

            // Find the closest ID to the group value
            int closestId = appList.get(0);
            int minDifference = Math.abs(groupValue - closestId);

            for (int id : appList) {
                int diff = Math.abs(groupValue - id);
                if (diff < minDifference) {
                    minDifference = diff;
                    closestId = id;
                }
            }

            // Remove the closest ID from the list
            appList.remove(Integer.valueOf(closestId));
        }

        // The remaining application ID is the virus
        return appList.get(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the number of running applications
        int N = in.nextInt();
        int[] applications = new int[N];

        // Input application IDs
        for (int i = 0; i < N; i++) {
            applications[i] = in.nextInt();
        }

        // Find and print the virus application ID
        int virusId = findVirusApplication(applications);
        System.out.println(virusId);
    }
}
