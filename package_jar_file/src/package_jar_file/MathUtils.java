package package_jar_file;

public class MathUtils {
	public static double sumListNumber(int n) {
		return n * (n + 1) / 2;
	}

	public static double factorial(int n) {
		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}

	public static double finbonaci(int n) {
		if (n == 1)
			return 1;

		if (n == 2)
			return 1;

		return finbonaci(n - 1) + finbonaci(n - 2);
	}
}
