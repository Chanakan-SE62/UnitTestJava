
public class Calculator {
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public float divide(int num1, int num2) {
		try { //ถ้าหารได้
			return num1/num2;
		}catch (Exception e){ //ถ้าหารไม่ได้
			return 0;
		}
	}
	public boolean match(int num1, int num2) {
		if(num1==num2) {
			return true;
		}else {
			return false;
		}
	}
}
