/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *
 * @author cooperstrahan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Object o;
        int count = 0;
        
        
        
        File fileA = new File("../csci232/sect1-3/tinyTale.txt");
        File fileB = new File("../csci232/lab1/numbers.txt");
        
        Scanner tinyT = new Scanner(fileA);
        Scanner tinyTale = new Scanner(fileA);
        Scanner rTinyTale = new Scanner(fileA);
        Scanner nums = new Scanner(fileB);
        Scanner numbers = new Scanner(fileB);
        Scanner rNumbers = new Scanner(fileB);
        
        //counting the length of the TinyTale file 
        while(tinyT.hasNext()){
            count++;
            tinyT.next();
        }
        //Create Array Stack
        ArrayStack s = new ArrayStack(count);
        
        System.out.println("ArrayStack output for TinyTale.txt file");
        //Push all of the words in Tiny Tale into an ArrayStack
        while(tinyTale.hasNext()){
            s.push(tinyTale.next());
        }
         
        //Pop and print all of the items in the ArrayStack
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
        // Counting the length of the numbers file and resetting the count variable
        count = 0;
        while(nums.hasNext()){
            count++;
            nums.next();
        }
        
        System.out.println("ArrayStack output for numbers.txt file");
        //Create an ArrayStack for the numbers file
        ArrayStack n = new ArrayStack(count);
        //Push all of the words in Tiny Tale into an ArrayStack
        while(numbers.hasNext()){
            n.push(numbers.next());
        }
        //pop and print all of the elements from the numbers ArrayStack     
        while(!n.isEmpty()){
            System.out.print(n.pop() + " ");
        }
        System.out.println();
        
        System.out.println("RArrayStack output for TinyTale.txt file");
        //Create RArrayStack
        RArrayStack rt = new RArrayStack();
        //Read File into RArrayStack
        while(rTinyTale.hasNext()){
            rt.push(rTinyTale.next());
        }
        //Pop and print contents of RArrayStack
        while(!rt.isEmpty()){
            System.out.print(rt.pop() + " ");
        }
        
        System.out.println();
        System.out.println("RArrayStack output for numbers.txt file");
        //Create RArrayStack for numbers
        RArrayStack rn = new RArrayStack();
        //Read File into numbers RArrayStack 
        while(rNumbers.hasNext()){
            rn.push(rNumbers.next());
        }
        //Pop and print contents of numbers RArrayStack
        while(!rn.isEmpty()){
            System.out.print(rn.pop() + " ");
        }
    }
    
}
