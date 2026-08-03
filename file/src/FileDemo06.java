import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileDemo06 {
    public static void main(String[] args){
        /*
            需求：统计文件夹中各个文件出现的次数
         */
        File file = new File("D:\\code\\Java-leaning\\puzzlegame");
        System.out.println(getCount(file));

    }

    /**
     * 功能：统计文件夹里面的各种文件出现的次数
     * 参数：被统计的文件
     */
    public static HashMap<String, Integer> getCount(File src){
        //利用HashMap键值对，键用于存放文件的后缀，值用于统计文件出现的次数
        HashMap<String, Integer> hm = new HashMap<>();

        //遍历文件夹里面的所有文件再进行判断
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                String name = file.getName();
                String[] split = name.split("\\.");
                String endName = split[split.length - 1];
                if(split.length >= 2){
                    if(hm.containsKey(endName)){
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    }else{
                        hm.put(endName, 1);
                    }
                }
            }else{
                //下一级文件夹里面的各种文件的数量
                HashMap<String, Integer> sonMap = getCount(file);
                //需要将本级的各种文件的数量加上下一级的文件数量才是总的正确的文件数量
                //所以需要将文件取出来判断
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if(hm.containsKey(key)){
                        //算出本级的文件数量
                        int count = hm.get(key);
                        //加上下级的文件数量
                        count += value;
                        hm.put(key, count);
                    }else{
                        //本级没有下级的文件
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }
}
