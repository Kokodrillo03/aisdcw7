import java.util.Scanner;


public class zad3 {
    static boolean flag;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++){
            String[] word = scan.nextLine().split(" ");
            int [] tab = new int[word.length];
            int a = 0;
            for(String s : word){
                tab[a] = Integer.parseInt(s);
                a++;
            }
            System.out.println("Data set " + i+1 + ": " + tab[0] + " " + tab[1] + " " + lottery(tab));
        }


    }

    public static int lottery(int[] tab){
        return 0;
    }
}
