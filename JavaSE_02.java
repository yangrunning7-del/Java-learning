public class JavaSE_02{
	public static void main(String[] args){

	// 转义字符
		//需求：将 ' 存入char类型变量中，在'前面加一个反斜杠\
		
		char c = '\'';
		
		System.out.println(c);
		
		char c2 = '\"';
		
		System.out.println(c2);
		
		//  \ 将“本身具有特殊含义的字符” 转换成 “普通字符”
		//  \ 将“普通字符” 转换成 “本身具有特殊含义的字符”
		
		System.out.print("Hello\tWorld\n"); //缩进一个制表位（4个空格）
		
		System.out.println("你好世界");
		
		System.out.println("\\");


		System.out.println("\n");

		// 字符串
		String str1 = "HelloWorld";
		
		System.out.println(str1);
		
		System.out.println("Hello Everyone");
		
        //在字符串中添加了空格
		String str2 = "        Hello";
		
		System.out.println(str2);
	}
}
