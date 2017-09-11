public class Sub {

	// 정수 연산은 모두 int로 대체된다.
	byte a = 7;
	byte b = 5;
	//byte c = a + b; 
	
	// long 은 뒤에 L을 붙여준다.
	int i = 5;
	long l = 5L;
	
	// 실수는 모두 double로 대체된다.
	// float 는 뒤에 F를 붙여준다.
	float f1 = 1234.5F;
	float f2 = 1234.5F;
	double d1 = 1234.5;
	double d2 = 1234.5;
	
	// float,double 연산은 직접 연산(sum = f1 + f2)하지 않는다.
	// 다수로 연산을 하고 싶다면?
	float sum1 = Float.sum(f1, f2);
	double sum2 = Double.sum(d1, d2);	
	
	
	/**
	 * 설명 : int 를 String 으로 형변환 하기 위한 함수
	 * 
	 * @param number
	 * @return
	 */
	public String changeNumberToString(int number) {
		// return number+"";
		return Integer.toString(number);
	}
	
	/**
	 * 설명 : String 을 int 로 형변환 하기 위한 함수
	 * 
	 * @param word
	 * @return
	 */
	public int changeStringToNumber(String word) {
		return Integer.parseInt(word);
	}
	
	/**
	 * 설명 : String 을 long 으로 형변ㅎ환 하기 위한 함수
	 * Integer를 제외한 long, float, double 등 데이터타입의 Wrapper 클래스를 통해 형변환을 한다.
	 * 
	 * @param word
	 * @return
	 */
	public long changeStringToLong(String word){
		return Long.parseLong(word);
	}
	
}
