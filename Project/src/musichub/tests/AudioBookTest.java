package musichub.tests;

import musichub.business.AudioBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AudioBookTest {
	
	@Test
	public void getLanguageTest() {
	AudioBook ab = new AudioBook("Dans la ville en feu","Michael Connelly", 954,"danslavilleenfeu.wav","french","novel");
	assertEquals("French", ab.getLanguage());
	}
	
	public void getCategoryTest() {
		AudioBook ab = new AudioBook("Dans la ville en feu","Michael Connelly", 954,"danslavilleenfeu.wav","french","novel");
		assertEquals("novel", ab.getCategory());
		}
	
}
