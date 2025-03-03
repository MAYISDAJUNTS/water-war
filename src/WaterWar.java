import java.util.Arrays;
import java.util.Scanner;

public class WaterWar {

    private static void clear() {
        for (int y=0; y<=20; y++) {
            System.out.println("\n\n\n\n\n");
        }
    }

    static void waitForEnter(){
        System.out.println("գրիր next որպեսզի շարունակնեք");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        clear();


    }

    static void printBoard(char a[][]) {

        for (int i=0; i<a.length; i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }

    static void waterWarBoard(char[][] a, char[][] b, Scanner scanner) {
        int c;
        int d;
        for (int i = 0; i< a.length; i++){
            for (int j = 0; j< b.length; j++){
                a[i][j]=' ';
                b[i][j]=' ';
            }
        }
        for (int i=0; i<8; i++){
            if (i%2==0){
                printBoard(a);
            } else {
                printBoard(b);
            }
            if (i%2==0) {
                System.out.println("նշիր վանդակը խաղացող առաջին");
            } else {
                System.out.println("նշիր վանդակը խաղացող երկրորդ");
            }
            c = scanner.nextInt();
            d = scanner.nextInt();
            if(i%2==0){
                if (a[c][d]==' ') {
                    a[c][d] = 'o';
                    printBoard(a);
                    waitForEnter();
                } else {
                    System.out.println("error");
                    System.out.println("կրկին նշիր");
                    i=i-1;
                }
            } else {
                if (b[c][d] == ' '){
                    b[c][d]='o';
                    printBoard(b);
                    waitForEnter();
                } else{
                    System.out.println("error");
                    System.out.println("կրկին նշիր");
                    i=i-1;
                }

            }

        }
        hit(a, b);
    }

    public static void hit(char[][] a, char[][] b) {
        Scanner scanner=new Scanner(System.in);
        boolean win1 = false;
        boolean win2 = false;
        int f = 0;
        int y = 0;
        int q;
        int w;
        qanak(a,f);
        qanak(b, y);
        for (int i = 0; i < 1; i--) {
           if (i%2==0) {
               System.out.println("նշիր վանդակ, որտեղ պետք է հարվածես խաղացող առաջին");
           } else {
               System.out.println("նշիր վանդակ, որտեղ պետք է հարվածես խաղացող երկրորդ");
           }
            q=scanner.nextInt();
            w=scanner.nextInt();

            if (i%2==0){
                if (b[q][w]=='o'){
                    b[q][w]='1';
                    System.out.println("հարվածեցիք");
                    qanak(b, y);

                } else if (b[q][w]==' ') {
                    b[q][w]=' ';
                    System.out.println("չհարվածեցիք");
                }  else if ((b[q][w]=='1')||(b[q][w]=='x')) {
                    System.out.println("կրկին փորձեք");
                    i=i-1;
                }
                if (isAlive(y)){
                 break;
                }
            }  else{
                if (a[q][w]=='o'){
                    a[q][w]='1';
                    System.out.println("հարվածեցիք");
                    qanak(a, f);
                } else if (a[q][w]==' ') {
                    a[q][w]=' ';
                    a[q][w]='x';
                    System.out.println("չհարվածեցիք");
                } else if ((a[q][w]=='1')||(a[q][w]=='x')) {
                    System.out.println("կրկին փորձեք");
                    i=i-1;
                }

               if (isAlive(f)){
                   break;
               }
            }

        }
    }

    static void qanak(char[][] a, int f){
        f=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j]=='o'){
                    f=f+1;
                }
            }
        }
    }

    static boolean isAlive(int f){
        if (f==0){
            return false;
        }
        return true;
    }

}
