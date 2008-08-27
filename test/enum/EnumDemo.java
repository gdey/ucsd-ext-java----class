

public final class EnumDemo {
	enum Day {
		SUNDAY(0),
		MONDAY(1),
		TUESDAY(2);
		
		private final int value;
		Day(int value) { this.value = value;}	
		public String bah() {
			return " BAX "+this.value+" : " + this;
		}
	}
	public static void main(String[] args) {
		System.out.println("Day" + Day.SUNDAY);
		System.out.println("Day" + Day.SUNDAY.bah());
		System.exit(0);
	}
}
