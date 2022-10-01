package smartgrads;

public class CastingDemo {
	public static void main(String[] args) {
		int i=10;//32 bit
		
		//explicit casting
		byte b=(byte)i;//byte is 8 bit - 32 bit int will be trimmed to 8 bit
		
		i=257;
		
		b=(byte)i;
		i=b;//automatic type promotion will take place
		System.out.println(b);//when the value is greater than 127, then the value will
		//be divided by 256 in case of byte and the reminder will be stored in variable
		
		//implicit casting
		byte x=10;
		byte y=2;
		byte result=(byte)(x*y);
		int re=x*y;
		
		long l1=10;
		long l2=2;
		
		int l=(int)(l1+l2);
		
		//decimals
		
		float f=100.01f;
		int ff=(int)f;
		System.out.println(ff);
		
		//char
		
		char c=97;//even though u assign a number still it takes only 16 bit
		int cc=c;//because int is 32 bit and char is 16 bit
		
		c=(char)cc;//32 bit cannot go in 16 bit
		
	}
}
