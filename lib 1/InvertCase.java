package lib1;

public class InvertCase {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);

			if (Character.isUpperCase(ch))
				sb.setCharAt(i, Character.toLowerCase(ch));
			else
				sb.setCharAt(i, Character.toUpperCase(ch));
		}

		System.out.println(sb);
	}

}
