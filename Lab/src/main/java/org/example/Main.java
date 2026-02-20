package org.example;

import org.example.IntListInterface.IntArrayList;
import org.example.IntListInterface.IntList;
import org.example.IntListInterface.IntVector;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println(roundToHundredth(BigDecimal.valueOf(4.25255)));
        System.out.println(roundToTenth(BigDecimal.valueOf(4.25255)));
    }
    public static double roundToHundredth(BigDecimal number){
        return  number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    public static BigDecimal roundToTenth(BigDecimal number){
        return  number.setScale(1, RoundingMode.HALF_UP).negate();
    }
}
