import java.util.Scanner;

public class main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        while(true) {
            String line = scan.nextLine();
            if(line.equals("ha"))break;
            if(line.length()==0 || line.charAt(0)=='#')
                continue;

            String [] word = line.split(" ");
            int [] tab = new int[word.length];
            int i = 0;
            for(String s : word){
                tab[i] = Integer.parseInt(s);
                i++;
            }
            System.out.println(meatballs(tab));
        }
    }



    public static String meatballs(int[] meatballs){
        if(meatballs[0]==0)return "";
        int S = 1;
        int E = meatballs.length-1;
        int Sm = meatballs[S];
        int Em = meatballs[E];
        while(S!=E-1){
            if(Sm >= Em){
                E--;
                Em += meatballs[E];
            }else{
                S++;
                Sm += meatballs[S];
            }
        }
        if(Sm == Em){
            return "Sam stops at position " + S + " and Ella stops at position " + E + ".";
        }
        return "No equal partitioning";
    }
}
