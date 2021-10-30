package in.abc.application.util;

public class AccountNumberGen {
	public static final Long bankCode = 5959001L;
	//keepAccountNumber of 12 digits
	public static String genAcNumber(Long id) {
		//first digit after bankcode will be 0000id
		
		String num = bankCode.toString();
		return num;
	}
}
