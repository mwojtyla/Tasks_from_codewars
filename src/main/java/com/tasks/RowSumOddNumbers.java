package com.tasks;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int firstNumberInRow = 0;
        if (n==1){
            sum = 1;
        } else if (n>1){
            firstNumberInRow = n*(n-1) + 1;
            for (int i=0; i<n; i++){
                sum += firstNumberInRow + i*2;
            }
        }
        return sum;
    }
}