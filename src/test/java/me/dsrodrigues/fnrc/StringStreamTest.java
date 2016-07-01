package me.dsrodrigues.fnrc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class StringStreamTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void illegalArgumentExceptionWithNullText() {
		new StringStream(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void illegalArgumentExceptionWithEmptyText() {
		new StringStream("");
	}
	
	@Test(expected = IllegalStateException.class)
	public void illegalStateExceptionNoExistNextCharacter() {
		Stream stream = new StringStream("d");
		stream.getNext();
		stream.getNext();
	}

	@Test
	public void firstNonRepeatCharacter() {
		assertThat(new StringStream("diego").getNext(), is('d'));
	}

	@Test
	public void hasNextCharacterTrue() {
		assertThat(new StringStream("diego").hasNext(), is(true));
	}

	@Test
	public void hasNextCharacterFalse() {
		Stream stream = new StringStream("d");
		stream.getNext();
		assertThat(stream.hasNext(), is(false));
	}
}
