package me.dsrodrigues.fnrc;

public class Application {

	public static void main(String[] args) {
		if (args.length == 0)
			System.err.println("text required");
		System.out.println(firstChar(args[0]));
	}

	private static String firstChar(String text) {
		try {
			char value = StreamUtils.firstChar(new StringStream(text));
			return String.valueOf(value);
		} catch (NotFoundCharacterException ex) {
			return ex.getMessage();
		}
	}
}
