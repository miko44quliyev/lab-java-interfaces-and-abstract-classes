package org.example.IntListInterface;

import java.util.Arrays;

public class IntVector implements IntList{
    private static int size=0;
    private static int maxSize=10;
    private static int[] numbers=new int[maxSize];
    @Override
    public void add(int number) {
        if(size<maxSize){
            numbers[size++]=number;
        }else{
            maxSize*= 2;
            int[] newNumbers=new int[maxSize];
            for(int i=0;i<numbers.length;i++) {
                newNumbers[i] = numbers[i];
            }
            numbers=newNumbers;
            System.out.println(maxSize);
        }
    }

    @Override
    public int get(int id) {
        return numbers[id];
    }
}
