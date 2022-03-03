/*
 *THis is Builder Pattern with Java!
*/

public  class Student{
	private final String studentName;
	private final int personalNumber;
	private final int english;
	private final int math;
	private final int phisics;
	
	public static class Builder {
		/*
		 * necessary parameter
		 */
		private final String studentName;
		private final int personalNumber;
		
		/*
		 * optional parameter
		 */
		private int english = 0;
		private int math = 0;
		private int phisics = 0;
		
		public Builder(String studentName, int personalNumber) {
			this.studentName = studentName;
			this.personalNumber = personalNumber;
		}
		
		public Builder math(int score) {
			this.math = score;
			return this;
		}
		
		public Builder english(int score) {
			this.english = score;
			return this;
		}
		
		public Builder phisics(int score) {
			this.phisics = score;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	
	}
	private Student(Builder bld) {
			studentName = bld.studentName;
			personalNumber = bld.personalNumber;
			math = bld.math;
			english = bld.english;
			phisics = bld.phisics;
		}
}
