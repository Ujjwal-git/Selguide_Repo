package testcases;

public class SubString {
	public static void main(String[] args) {

		String input = "Hello worlddddddd this is Java";
		String[] words = input.split(" ");
		int length, minLength;
		String maxString = "";
		minLength = words[0].length();

		for (String i : words) {
			int j = 1;
			length = i.substring(1).length();

			if (minLength < length) {
				minLength = length;
				maxString = words[j];
			}
			j++;
		}
		System.out.println(maxString + ": " + minLength);

	}

}
