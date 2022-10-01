package smartgrads;

public class HelloWorld {
	public static void main(String[] args) {
		//VARIABLE INITIALIZATION
		int i=10;
		byte b=127;//8 bit
		
		int a=10;
		
		short s=32767;//16 bit
		s=-32768;
		
		int ii=2147483647;
		
		ii=-21_474_836_48;
		
		ii=21400_00_00_4;//the underscore concept was introduced in jdk5
		
		int x=100_100;
		int y=100_100;
		
		int sum=x+y;//32 bit
		System.out.println(sum);
		
		long dis=-9223372036854775808L;//64 bit - but be default he will take only 32
		
		float f=100;//valid
		f=32678.34f;//compusorily you should use f
		double d=9223372036854775807.454D;//default 32 bit, but with D it takes 64 bit
		
		char c='a';//16 bit
		c=120;
		System.out.println(c);
		
		boolean boo=true;
		boo=false;
	}
}
