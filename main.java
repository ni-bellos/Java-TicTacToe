package tictactoe;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.next();
        char[] array =  inputs.toCharArray();
        int n = 3;
        char[][] twoDimArray = new char[n][n];
        int counter = 0;
        for(int i = 0; i < n;i++){
            for(int j = 0; j<n;j++){
                twoDimArray[i][j] = array[j+counter];
            }
            counter = counter + 3;
        }
        System.out.println("---------");
        System.out.println("| "+twoDimArray[0][0]+" "+twoDimArray[0][1]+" "+twoDimArray[0][2]+" |");
        System.out.println("| "+twoDimArray[1][0]+" "+twoDimArray[1][1]+" "+twoDimArray[1][2]+" |");
        System.out.println("| "+twoDimArray[2][0]+" "+twoDimArray[2][1]+" "+twoDimArray[2][2]+" |");
        System.out.println("---------");
        char winner[] = new char[2];
        boolean win = false;
        int row1 = twoDimArray[0][0]+twoDimArray[0][1]+twoDimArray[0][2];
        int row2 = twoDimArray[1][0]+twoDimArray[1][1]+twoDimArray[1][2];
        int row3 = twoDimArray[2][0]+twoDimArray[2][1]+twoDimArray[2][2];
        int column1 = twoDimArray[0][0]+twoDimArray[1][0]+twoDimArray[2][0];
        int column2 = twoDimArray[0][1]+twoDimArray[1][1]+twoDimArray[2][1];
        int column3 = twoDimArray[0][2]+twoDimArray[1][2]+twoDimArray[2][2];
        int diagonal1 = twoDimArray[0][0]+twoDimArray[1][1]+twoDimArray[2][2];
        int diagonal2 = twoDimArray[0][2]+twoDimArray[1][1]+twoDimArray[2][0];
        if ((row1==264)||(row2==264)||(row3==264)||(column1==264)||(column2==264)||(column3==264)||(diagonal1==264)||(diagonal2==264)){
            winner[0] = 'X';
            win = true;
        }
        if ((row1==237)||(row2==237)||(row3==237)||(column1==237)||(column2==237)||(column3==237)||(diagonal1==237)||(diagonal2==237)){
           winner[1] = 'O';
           win = true;
        }
        boolean Impossible = false;
        if ((winner[0]=='X')&&(winner[1]=='O')){
            Impossible = true;
        }
        int Xs = 0;
        int Os = 0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (twoDimArray[i][j] == 'X'){
                    Xs = Xs + 1;
                }
                if (twoDimArray[i][j] == 'O'){
                    Os = Os + 1;
                }
            }
        }
        int difference = Math.abs(Os-Xs);
        if (difference>1){
            Impossible = true;
        }
        boolean finish = true;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if ((win==false)&&(twoDimArray[i][j]=='_')){
                    finish = false;
                }
            }
        }
        if (finish == false){
            System.out.println("Game not finished");
        }
        if ((finish == true)&&(win==false)){
            System.out.println("Draw");
        }
        if (Impossible == true){
            System.out.println("Impossible");
        }
        if ((winner[0]=='X')&&(Impossible == false)){
            System.out.println("X wins");
        }
        if ((winner[1]=='O')&&(Impossible == false)){
            System.out.println("O wins");
        }
    }
}

