package com.tasks;

public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int yearCounter = 1;
        int inhabitantsSum = p0 + (int)(p0*percent/100) + aug;

        while(inhabitantsSum < p){
            inhabitantsSum = inhabitantsSum + (int)(inhabitantsSum*percent/100) + aug;
            yearCounter++;
        }

        if (inhabitantsSum >= p){
            return yearCounter;
        }

        return yearCounter;
    }
}
