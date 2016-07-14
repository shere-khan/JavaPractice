package justin.cert.practice;

public class PracticeVariables {
	
	static int staticField;
	
	static {
		staticField = 20;
	}

	static int anotherStaticField = initialize();
	
	static int initialize() {
		return staticField * 2;
	}
	
	int myValue = 10;

	int anotherValue;
	
	{
		anotherValue = myValue * 3;
	}

	int myValue2 = initValue();
	
	final int initValue() {
		return anotherValue + 10;
	}
}
