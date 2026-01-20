package exam;

public class Methodproblem {
	public static void main(String[] args) {
//		printSum(20);
//		printPrime(20);
//		printMax(20, 10);
//		printAge(10);
//		printAge(20);
//		getFizzBuzz();
//		getUniqueNumbers();
//		getEvenOdd(4, 5);
//		getEvenOdd(3, 5);
//		getSumOfFive(1, 2, 3, 4, 5);
//		getAverage(150, 3);
//		getGrade(95);
//		getGrade(85);
//		getGrade(75);
//		System.out.println(nextChar('a'));
//		System.out.println(getCharacters('a', 'z'));
//		System.out.println(getLowerCaseAlpha('a', 25));
		System.out.println(convertUpperCase('a'));
		
	}

	private static char convertUpperCase(char str) {
		str -= 32;
		return str;
	}

	private static char getLowerCaseAlpha(char str, int num) {
		if (num > 25 || num < 0) {
			return ' ';
		}
		str += num;
		return str;
		
	}

	private static String getCharacters(char str1, char str2) {
		int numChar1 = str1;
		int numChar2 = str2;

		char[] array = new char[numChar2 - numChar1];
		String arrayString = null;
//		
		for (int i = 0; i < numChar2 - numChar1; i++) {
			array[i] = (char) (numChar1 + i);
			arrayString = String.valueOf(array);
		}
		return arrayString;
	}
	
	

	public static void printSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void printPrime(int num) {
		boolean isPrime = false;
		for (int i = 2; i <= num; i++) {
			isPrime = false;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + "\t");
			}
		}
	}

	public static void printMax(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}

	public static void printAge(int age) {
		if (age > 19) {
			System.out.println("성인 입니다");
		} else {
			System.out.println("미성년자 입니다");
		}
	}

	public static String getFizzBuzz(int ranNum) {
		if (ranNum % 3 == 0) {
			return "Fizz";
		} else if (ranNum % 5 == 0) {
			return "Buzz";
		} else if (ranNum % 3 == 0 && ranNum % 5 == 0) {
			return "FizzBuzz";
		}
		return ranNum + "";
	}

	public static void getUniqueNumbers() {
		int[] ranNumArray = new int[7];
		for (int i = 0; i < ranNumArray.length; i++) {
			ranNumArray[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (ranNumArray[i] == ranNumArray[j]) {
					i--;
					break;
				}
			}

			System.out.println(ranNumArray[i]);
		}
	}

	public static void getEvenOdd(int num1, int num2) {
		int mul = num1 * num2;
		if (mul % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

	public static void getSumOfFive(int num1, int num2, int num3, int num4, int num5) {
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);
	}

	public static void getAverage(int score, int count) {
		double avrage = Math.round(score / count * 1000) / 1000;
		System.out.println(avrage);
	}

	public static void getGrade(int score) {
		if (score >= 95) {
			System.out.println("A");
		} else if (score >= 85) {
			System.out.println("B");
		} else if (score >= 75) {
			System.out.println("C");
		} else if (score >= 65) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	public static char nextChar(char str) {
		str += 1;

		return str;
	}

}
