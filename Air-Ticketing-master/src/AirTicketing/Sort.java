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
public class Sort {
    
      public void sort(LinkedList<Integer> a){
        for(int i=0;i<a.size()-1;i++){
            int minPos=smallestNumb(a, i);
            swap(a,minPos,i);
        }
    }
      
    public int smallestNumb(LinkedList<Integer> a,int from){
        int minPos= from;
        for(int i=from+1;i<a.size();i++){
            if(a.get(i)<a.get(minPos)){
                minPos=i;
            }
        }
        return minPos;
    }    
  
    public void swap(LinkedList<Integer> a,int minPos,int maxPos){
        var temp=a.get(minPos);
        a.set(minPos,a.get(maxPos));
        a.set(maxPos,temp);
    }    
}
