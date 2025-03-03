import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] a=new char[5][5];
        char[][] b=new char[5][5];
        WaterWar.waterWarBoard(a, b, scanner);

    }
}
