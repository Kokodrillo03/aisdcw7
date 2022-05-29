import java.util.Scanner;

public class zad2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        while(true) {
            String line = scan.nextLine();
            if(line.equals("ha"))break;
            if(line.length()==0 || line.charAt(0)=='#')
                continue;

            String [] word = line.split(" ");
            double [] tab = new double[word.length];
            int i = 0;
            for(String s : word){
                tab[i] = Double.parseDouble(s);
                i++;
            }
            System.out.println(change(tab));
        }
    }

    public static String change(double[] tab){

        tab[0] = Math.round(tab[0] * 20);
        int price = (int)tab[0]*5;
        int offer = (int)tab[1]*100;
        if(price==offer)return"Exact amount";
        if(price>offer)return"Not enough money offered";
        int[] amounts = new int[9];
        int[] nominals = new int[]{2000,1000,500,200,100,50,20,10,5};
        double rest = offer - price;
        int i = 0;
        while(rest>0&&i<nominals.length){
            if(rest<nominals[i]){
                i++;
            }else {
                rest -= nominals[i];
                amounts[i]++;
            }
        }
        String ret = "";
        if(amounts[0]!=0)ret += "$20*"+amounts[0]+ " ";
        if(amounts[1]!=0)ret += "$10*"+amounts[1]+ " ";
        if(amounts[2]!=0)ret += "$5*"+amounts[2]+ " ";
        if(amounts[3]!=0)ret += "$2*"+amounts[3]+ " ";
        if(amounts[4]!=0)ret += "$1*"+amounts[4]+ " ";
        if(amounts[5]!=0)ret += "50c*"+amounts[5]+ " ";
        if(amounts[6]!=0)ret += "20c*"+amounts[6]+ " ";
        if(amounts[7]!=0)ret += "10c*"+amounts[7]+ " ";
        if(amounts[8]!=0)ret += "5c*"+amounts[8]+ " ";
        return ret;
    }
}
