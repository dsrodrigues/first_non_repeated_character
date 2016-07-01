package me.dsrodrigues.fnrc;

import java.util.ArrayList;
import java.util.List;

public class StreamUtils {

	public static char firstChar(Stream stream) {
		List<Character> unique = new ArrayList<Character>();
		List<Character> others = new ArrayList<Character>();

		while (stream.hasNext()) {
			char next = stream.getNext();
			if (others.contains(next))
				continue;
			int idx = unique.indexOf(next);
			if (idx == -1) {
				unique.add(next);
			} else {
				others.add(next);
				unique.remove(idx);
			}
		}

		if (unique.isEmpty())
			throw new NotFoundCharacterException("Not Found Unique Character");
		return unique.get(0);
	}

}
