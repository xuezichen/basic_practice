package zc.itevent;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/*
对D:\\out.txt中的文本进行排序
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("d:\\out.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\secondary\\practice\\copy.txt"));
        HashMap<String,String> map = new HashMap<>();


        String s;
        while ((s = br.readLine()) != null){
            String[] split = s.split("\\.");
            map.put(split[0],split[1]);
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);

            bw.write(key+"."+value);
            bw.newLine();
        }


       /* for (int i = 1; i <= map.size(); i++) {
            String key = String.valueOf(i);
            String value = map.get(key);

            bw.write(key+"."+value);
            bw.newLine();
        }*/


        bw.close();
        br.close();
    }
}
