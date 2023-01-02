import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {//sliver5
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(bf.readLine());

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(list);
        for(int value:list){
            bw.write(value+"\n");
        }
        bw.flush();
        bw.close();
    }
}
