/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirTicketing;

import java.util.LinkedList;

/**
 *
 * @author Dell
 */
public class BinarySearch {
    public int binarySearch(LinkedList<Integer>arr,int low,int high,int value){
       if(high>=low){
           int mid=(low+high)/2;
           if(arr.get(mid)==value){
               return mid;
           }else if(arr.get(mid)>value){
               return binarySearch(arr, low, mid-1, value);
           }else{
               return binarySearch(arr, mid+1, high, value);
           }
       }
       return -1;
    }
}
