package org.example.IntListInterface;

import org.example.VideoStreamingService.Movie;

import java.util.Arrays;

public class IntArrayList implements IntList{
    private  int size=0;
    private  int maxSize=10;
    private  int[] numbers=new int[maxSize];
    @Override
    public void add(int number) {
        if(size<maxSize){
            numbers[size++]=number;
        }else{
            maxSize+= maxSize/2;
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
        if(id>=0&&id<maxSize) return numbers[id];
        return -1;
    }
}
