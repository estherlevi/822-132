package b.conditions;

public class Demo4 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 11);
		System.out.println("grade is: " + grade);

		if (grade < 6) {
			System.out.println("fail");
		} else if (grade == 6) {
			System.out.println("pass");
		}else if(grade <= 8) {
			System.out.println("good");
		}else {
			System.out.println("excelent");
		}

	}

}
