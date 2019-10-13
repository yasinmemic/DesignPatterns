
public class StrategyPatternDemo {
	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());	
		System.out.println(" 10 + 5 = "+ context.executeStrategy(10, 5)+ "  -----------> Addition");
		
		context = new Context(new OperationMultiply());
		System.out.println(" 10 * 5 = "+ context.executeStrategy(10, 5)+ "  -----------> Multiplication");
		
		context = new Context(new OperationSubstract());
		System.out.println(" 10 - 5 = "+ context.executeStrategy(10, 5)+ "   -----------> Substraction");
	}

}

