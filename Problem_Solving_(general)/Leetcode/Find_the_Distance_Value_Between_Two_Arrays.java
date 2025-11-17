package Leetcode;

public class Find_the_Distance_Value_Between_Two_Arrays {
    public static void main(String[] args) {
        System.out.println();
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int count = 0;

        for (int num : arr1) {
            boolean valid = true;

            int left = num - d;
            int right = num + d;

            for (int num2 : arr2) {
                if (num2 >= left && num2 <= right) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}
