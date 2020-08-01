/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_phan2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Week3_phan2 {

     /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b){
        if(a>=b) {
            return a;
        }
        else {
            return b;
        }
    }
    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
                
        }
        return min;
    }
    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height){
       
        String result = null;
        
        double BMI = weight/(height*height);
        
        BMI = (double) Math.round(BMI*10)/10;
        if(BMI<18.5) {
            result = "Thiếu cân";
        }
        else if (BMI >= 18.5 && BMI <= 22.9){
            result = "Bình thường";
        }
        else if (BMI >= 23 && BMI <= 24.9){
           result = "Thừa cân";
        }
        else if(BMI >= 25){
            result = "Béo phì";
        }
        return result;
    }
    
        
         
}

