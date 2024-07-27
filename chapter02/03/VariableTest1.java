/*
测试整形和浮点型变量的使用


*/
class VariableTest1{
	public static void main(String[] args) {
		//1.测试整型变量的使用
		//byte(1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
		
		byte b1 = 12;
		byte b2 = 127;
		//编译不通过。因为超出了byte的存储范围
		//byte b3 = 128;
		
		short s1 = 1234;
		
		int i1 = 123234123;
		
		//①声明long类型变量时，需要提供后缀。后缀为“l”或“L”。
		long l1 = 123123123L;
		
		//②开发中，定义整型变量时，没有特殊情况的话，通常都声明为int类型。
		
		//2.测试浮点类型变量的使用
		//float \ double
		double d1 = 12.3;
		//①声明long类型变量时，需要提供后缀。后缀为“f”或“F”。
		float f1 = 12.3f;
		System.out.println("f1 = " + f1);
		
		//②开发中，定义浮点类型变量时，没有特殊情况的话，通常都声明为double类型，因为精度更高。
		//③float类型表数范围大于long类型的表数范围，但精度不高。
		
		//测试浮点型变量的精度
		//结论：通过测试发现浮点型变量的精度不高。如果在开发中，需要极高的精度，需要使用
		      //BigDecimal类替换浮点型变量。
		//测试1：
		System.out.println(0.1 + 0.2);//0.30000000000000004

		//测试2：
		float ff1 = 123123123f;
		float ff2 = ff1 + 1;
		System.out.println(ff1);
		System.out.println(ff2);
		System.out.println(ff1 == ff2);
		
	}
}
