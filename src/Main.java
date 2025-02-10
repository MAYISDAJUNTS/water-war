import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


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
      for (int i=0; i<8; i++){
                c=scanner.nextInt();
                d=scanner.nextInt();
                if((i%2==0)&&(a[c][d]==' ')){

                    a[c][d]='o';
                    printBoard(a);
                    clear();
                }
                else if((i%2==0)&&(a[c][d]!=' ')){
                    System.out.println("error");
                    i=i-1;
                    printBoard(a);

                }
                else if((i%2==0)&&(b[c][d]!=' ')){
                    System.out.println("error");
                    i=i-1;
                    printBoard(b);

                }

                else if (i%2!=0){
                    b[c][d]='o';
                    printBoard(b);
                    clear();

                }

      }
        int p;
        int o;

      for (int i=0; i<11; i++){
          System.out.println("նշիր վանդակ");
           p=scanner.nextInt();
          o= scanner.nextInt();
          if (i%2==0){
              if (b[p][o]=='o'){
                  b[p][o]='1';
              }
              if (b[p][o]==' '){
                  b[p][o]='x';
              }
              else {
                  System.out.println("սխալ");
                  i=i-1;
              }
          } else {
              if (a[p][o]=='o'){
                  a[p][o]='1';
              }
              else if (b[p][o]==' '){
                  b[p][o]='x';
              }
              else {
                  System.out.println("սխալ");
                  i=i-1;
              }
          }

      }

    }

    private static void clear() {
        try {
            Runtime.getRuntime().exec("clear");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
    }

    static void printBoard(char a[][]) {

             for (int i=0; i<a.length; i++){
                System.out.println(Arrays.toString(a[i]));
            }
        }
}
