
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner for input
        Scanner input = new Scanner(System.in);
        //get numbers
        System.out.println("Please enter 4 numbers on separate lines");
        //four separate lines
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();
        double numberFour = input.nextDouble();
        //print numbers out
        System.out.println("Your numbers are " + numberOne + "," + numberTwo + "," + numberThree + "," + numberFour);

    }
}