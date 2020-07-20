package tictactoe;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.next();
        char[] array =  inputs.toCharArray();
        char first = array[0];
        char second = array[1];
        char third = array[2];
        char fourth = array[3];
        char fifth = array[4];
        char sixth = array[5];
        char seventh = array[6];
        char eighth = array[7];
        char ninth = array[8];
        System.out.println("---------");
        System.out.println("| "+first+" "+second+" "+third+" |");
        System.out.println("| "+fourth+" "+fifth+" "+sixth+" |");
        System.out.println("| "+seventh+" "+eighth+" "+ninth+" |");
        System.out.println("---------");
    }
}
