package chap09.book.exercise.p090503;

public class Anonymous {

	private int field;
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; X
		//arg2 = 20; X
		
		//var1 = 30; X
		//var2 = 30; X
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
			
		System.out.println(calc.sum());
	}
}
