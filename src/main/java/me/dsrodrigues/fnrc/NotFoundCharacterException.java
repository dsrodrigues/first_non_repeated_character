package me.dsrodrigues.fnrc;

public class NotFoundCharacterException extends RuntimeException {
	private static final long serialVersionUID = -8595732069151246457L;

	public NotFoundCharacterException(String message) {
		super(message);
	}
}
