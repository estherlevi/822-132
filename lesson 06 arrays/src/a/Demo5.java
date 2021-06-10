package a;

public class Demo5 {

	public static void main(String[] args) {

		int[][] gradeMatrix = new int[20][5];
		gradeMatrix[0][0] = 100;
		gradeMatrix[0][1] = 90;

		System.out.println(gradeMatrix[0][1]);

		for (int i = 0; i < gradeMatrix.length; i++) {
			System.out.print("student #" + i + ":\t");
			for (int j = 0; j < gradeMatrix[i].length; j++) {
				gradeMatrix[i][j] = (int) (Math.random() * 101);
				System.out.print(gradeMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
