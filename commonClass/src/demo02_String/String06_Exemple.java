package demo02_String;

public class String06_Exemple {
    public static void main(String[] args) {
        /*
            给定一个字符串，在这个字符串中找到目标字符串出现的次数
            如：我的祖国是中国，我家乡是中国汕尾，我是中国人
            分析得到，中国出现的次数为3
         */


        String str = "我的祖国是中国，我家乡是中国汕尾，我是中国人";
        String FindStr = "中国";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(FindStr, index)) != -1) {
            count++;
            index++;
        }
        /*
            另一个方法
            while((index = str.indexOf(FindStr)) != -1){
                str.substring(index + FindStr.length);
            }

         */

        System.out.println(count);
    }
}
