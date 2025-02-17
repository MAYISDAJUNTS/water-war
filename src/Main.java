import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Runtime runtime = Runtime.getRuntime();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int c;
        int d;
        char[][] a=new char[5][5];
        char[][] b=new char[5][5];
      for (int i=0; i<a.length; i++){
          for (int j=0; j<b.length; j++){
              a[i][j]=' ';
              b[i][j]=' ';
          }
      }
      printBoard(a);
      for (int i=0; i<a.length; i++){
                c=scanner.nextInt();
                d=scanner.nextInt();
                if(i%2==0){
                    System.out.println();
                    a[c][d]='o';
                    printBoard(a);
                    clear();
                } else if (i%2!=0){
                    b[c][d]='o';
                    printBoard(b);
                    clear();

          }
      }

    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void printBoard(char a[][]) {

            for (int i=0; i<a.length; i++){
                System.out.println(Arrays.toString(a[i]));
            }
        }
}
