/*
	案例1：定义圆周率并赋值为3.14，现有3个圆的半径分别为1.2、2.5、6，求它们的面积。
*/
class FloatDoubleExer {
	public static void main(String[] args) {
		//定义圆周率变量
		double pi = 3.14;
		
		//定义三个圆的半径
		double redius1 = 1.2;
		double redius2 = 2.5;
		int redius3 = 6;
		
		//计算面积
		double area1 = pi * redius1 * redius1;
		double area2 = pi * redius2 * redius2;
		double area3 = pi * redius3 * redius3;
		
		//输出
		System.out.println("圆1的半径为：" + redius1 + "，面积为：" + area1);
		System.out.println("圆2的半径为：" + redius2 + "，面积为：" + area2);
		System.out.println("圆3的半径为：" + redius3 + "，面积为：" + area3);
	}
}
