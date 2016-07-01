package me.dsrodrigues.fnrc;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StreamUtilsTest {

	@Test
	public void firstCharWithoutRepeat() {
		assertThat(StreamUtils.firstChar(new StringStream("abacBCabcaDACdebABdDA")), is('e'));
	}

	@Test(expected = NotFoundCharacterException.class)
	public void notFoundUniqueCharacter() {
		StreamUtils.firstChar(new StringStream("abacBCabcaDACdebABdDAe"));
	}
}
