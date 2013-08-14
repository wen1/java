
public class _5_2 {
	static String decimal = "3.72";
	
	public static void main(String[] args){
		System.out.println(decimalToBinary(decimal));
		
	}
	
	public static String decimalToBinary(String d){
		int intPart = Integer.parseInt(d.substring(0,d.indexOf('.')));
		double decPart = Double.parseDouble(d.substring(d.indexOf('.')+1,d.length()));
		String intStr = "";
		while(intPart != 0){
			int digit = intPart%2;
			intPart >>= 1;
			intStr = digit + intStr;
		}
		System.out.println(intStr);
		
		String decStr = "";


		while (decPart>1){
			decPart /= 10;
		}
		
		while(decPart > 0) {
			if (decStr.length() > 32)  return "error";
//			if (decPart == 1){
//				decStr += "1";
//				break;
//			} 
			double temp = decPart *2;
			if (temp >= 1) {
				decStr += "1";
				decPart = temp - 1;
			} else {
				decStr += "0";
				decPart = temp;
			}
		}
		
		return intStr + "." + decStr;
	}
}
