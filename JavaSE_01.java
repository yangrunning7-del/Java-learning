public class JavaSE_01{
	public static void main(String[] args){
		// 变量声明
		int money;
		// 赋值
		money = 100;
		// 输出变量
		System.out.println(money);

		// 单精度浮点值，为其赋值时需要在后面加f或者F
		float f = 1.2F;
		System.out.println(f);

		//科学计数法赋值
		// double d5 = 2E3;//2*10^3
		// System.out.println(d5);
		double d5 = 2E3;
		System.out.println(d5);


		// 布尔值
		boolean flag = true;
		System.out.println("flag");
		boolean flag1 = 5 > 1;
		System.out.println(flag1);


		// 字符串
		char c = 'A'; //B
		System.out.println(c);
		
		char c2 = 65; //66
		System.out.println(c2);
		
		char c3 = '\u0041'; // '\u0042' 16进制66
		System.out.println(c3);


		System.out.println("\n");
		


	}
}