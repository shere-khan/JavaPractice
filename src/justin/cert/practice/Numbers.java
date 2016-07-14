package justin.cert.practice;

public class Numbers {
	public static void main(String[] args) {
		Byte b = 0; // 8-bit
		Short s = 0; // 16-bi
		Integer i = 0; // 32-bit
		Long l = 0L; // 64-bit
		Float f = 0.0f; // single precision 32-bit floating point
		Double d = 0.0; // double precision 64-bit floating point
		
		byte bValue = b.byteValue();
		
		Byte b2 = new Byte(bValue);
		
		boolean equalTo = b.equals(b2);
		
		System.out.println("Equals?" + equalTo);
		
		int parsedInteger = Integer.parseInt("102");
		System.out.println("pased integer value: " + parsedInteger);
	}
}
