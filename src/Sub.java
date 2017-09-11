public class Sub {

	// ���� ������ ��� int�� ��ü�ȴ�.
	byte a = 7;
	byte b = 5;
	//byte c = a + b; 
	
	// long �� �ڿ� L�� �ٿ��ش�.
	int i = 5;
	long l = 5L;
	
	// �Ǽ��� ��� double�� ��ü�ȴ�.
	// float �� �ڿ� F�� �ٿ��ش�.
	float f1 = 1234.5F;
	float f2 = 1234.5F;
	double d1 = 1234.5;
	double d2 = 1234.5;
	
	// float,double ������ ���� ����(sum = f1 + f2)���� �ʴ´�.
	// �ټ��� ������ �ϰ� �ʹٸ�?
	float sum1 = Float.sum(f1, f2);
	double sum2 = Double.sum(d1, d2);	
	
	
	/**
	 * ���� : int �� String ���� ����ȯ �ϱ� ���� �Լ�
	 * 
	 * @param number
	 * @return
	 */
	public String changeNumberToString(int number) {
		// return number+"";
		return Integer.toString(number);
	}
	
	/**
	 * ���� : String �� int �� ����ȯ �ϱ� ���� �Լ�
	 * 
	 * @param word
	 * @return
	 */
	public int changeStringToNumber(String word) {
		return Integer.parseInt(word);
	}
	
	/**
	 * ���� : String �� long ���� ������ȯ �ϱ� ���� �Լ�
	 * Integer�� ������ long, float, double �� ������Ÿ���� Wrapper Ŭ������ ���� ����ȯ�� �Ѵ�.
	 * 
	 * @param word
	 * @return
	 */
	public long changeStringToLong(String word){
		return Long.parseLong(word);
	}
	
}
