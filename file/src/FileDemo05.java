import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileDemo05{
    public static void main(String[] args) throws IOException {
        /*
            需求：需要统计文件夹中各种文件出现的次数
         */
        File file = new File("D:\\code\\test_code");
        System.out.println(getCount(file));
    }

    /**
     *
     * @param src 表示被统计的文件夹
     */
    public static HashMap<String, Integer> getCount(File src){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                //先获取键
                String Name = file.getName();
                String[] arr = Name.split("\\.");
                String endName = arr[arr.length - 1];
                if(arr.length >= 2){
                    if(hm.containsKey(endName)){
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    }else{
                        hm.put(endName, 1);
                    }
                }else{
                    //子文件夹中所有文件的数量
                    HashMap<String, Integer> sonMap = getCount(file);
                    //将所有的子文件数量更新到hm中
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String Key = entry.getKey();
                        Integer value = entry.getValue();
                        if(hm.containsKey(Key)){
                            int count = hm.get(Key);//本级已经有的文件数量
                            count += value;//value为下级已经有的文件数量，加上本级有的，统计出来为所有的文件数量
                            hm.put(Key, count);
                        }else{
                            hm.put(Key, value);
                        }
                    }
                }
            }
        }
        return hm;
    }

}