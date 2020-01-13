/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirTicketing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class CSVCodes {
    
    
    /**
     * 
     * Method to save data to a csv file
     * 
     */    
    public static void saveTicket(String name,String contact,String flightDetail,String fromTo,String departureDate,String airline,String flightClass,String time,String flightId,Integer total){
      
        /**
         * 
         * File Path to our existing CSV file
         * 
         */
        String filepath="passengers.txt";
        try{
            
            /**
             * 
             * 
             * Open the file and setting boolean to true to allow append data to the file
             * 
             */
            FileWriter fw=new FileWriter(filepath,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            
            //Writing to the file
            pw.println(name+","+contact+","+flightDetail+","+fromTo+","+departureDate+","+airline+","+flightClass+","+time+","+flightId+","+total);
            /**
             * 
             * Flush() to commit changes
             * Close() to close the opened file 
             * 
             */
            pw.flush();
            pw.close();
        }catch(Exception E){
            E.printStackTrace();
        }
    
    }
    
    /**
     * 
     * Method to read data from CSV file
     * Takes a file and a JTable as its parameter
     * 
     */
    public static void readCSV(File file,JTable table){        
        try{
            //Scanner reads a file
            Scanner inputStream=new Scanner(file);
            DefaultTableModel model=(DefaultTableModel) table.getModel();     
            //Loop until the file has next line
            while(inputStream.hasNext()){         
                //Storing value of next line in data Variable
                String data=inputStream.nextLine();
                //Spliting the data using ',' and storing the new array in rows
                String[] rows=data.split(",");            
                //adding rows to our table
                model.addRow(rows);               
                
            }
            //closing the Scanner
            inputStream.close();
        }catch(FileNotFoundException exp){
            exp.printStackTrace();
        }      
        
    }     
    
}
