// Name : Hasnat Jani Rafin
// ID : 20172507
import java.util.Scanner;
public class KeyPads {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print(" Enter a Letter : ");
        String letter = ip.nextLine();
        char ch = letter.charAt(0);
        ch = Character.toUpperCase(ch);
        int number = 0;
        if (Character.isLetter(ch)) {
            if (ch >= 'W') {
                number = 9;} else if (ch >= 'T') {
                number = 8;}
            else if (ch >= 'G') { number = 4;
            } else if (ch >= 'D') {
                number = 3; } else if (ch >= 'A') {
                number = 2;}
            else if (ch >= 'P') {
                number = 7; } else if (ch >= 'M') {
                number = 6;} else if (ch >= 'J') {
                number = 5;} 
            System.out.println("The Corresponding Number is " + number);
            System.out.println(" ***** [ Copyright (20172507) - Hasnat Jani Rafin ] *****" );
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
