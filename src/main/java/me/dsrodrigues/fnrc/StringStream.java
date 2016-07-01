package me.dsrodrigues.fnrc;

import org.apache.commons.lang.StringUtils;

public class StringStream implements Stream {

	private final char[] content;
	private int position;

	public StringStream(String text) {
		if (StringUtils.isBlank(text))
			throw new IllegalArgumentException("Text is blank");

		this.content = text.toCharArray();
		this.position = 0;
	}

	public char getNext() {
		if (!this.hasNext())
			throw new IllegalStateException("stream end");
		return content[position++];
	}

	public boolean hasNext() {
		return position < content.length;
	}

}
