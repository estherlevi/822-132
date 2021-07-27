package e.staticImport;

// static imports - for importing static members - fields or methods
import static java.lang.Math.PI;
import static java.lang.Math.random;

// regular (non-static) imports - for importing types from other packages
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// static import will save us the writing of class names
		System.out.println(PI);
		System.out.println(random());

		// import will save us the writing of fully qualified names (package name)
		Scanner sc;

	}

}
