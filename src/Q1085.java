import java.util.Scanner;

public class Q1085 {//bronze3
    public static void main(String[] args) {
        int x,y,w,h,ret1,ret2;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y= sc.nextInt();
        w=sc.nextInt();
        h=sc.nextInt();
        if((1>w || w>1000) && (1>h || h>1000) && (1>x || x>w-1) && (1>y || y>h-1)) {
            System.exit(0);
        }
        else{
            ret1=Math.min(x,w-x);
            ret2=Math.min(y,h-y);
            System.out.println(Math.min(ret1, ret2));
        }
    }
}
