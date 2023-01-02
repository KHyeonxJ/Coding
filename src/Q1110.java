import java.util.Scanner;

public class Q1110 {//bronze1
    public static void main(String[] args) {
        int n,nn, cycle=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        nn=n;
        while(true) {
            if (nn < 10) {
                nn = nn * 10 + nn;
            } else {
                nn = nn % 10 * 10 + (nn / 10 + nn % 10) % 10;
            }
            cycle++;
            if(nn==n){
                System.out.println(cycle);
                break;
            }
        }

    }
}
