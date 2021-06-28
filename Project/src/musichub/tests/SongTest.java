package musichub.tests;


import musichub.business.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SongTest {
	
	@Test
	public void getArtistTest() {
		Song ae = new Song("From Time","Drake",340,"fromtime.wav","hiphop");
		assertEquals("Drake", ae.getArtist());
	}
	
	@Test
	public void getTitleTest() {
		Song ae2 = new Song("Macarena","Damso",315,"macarena.wav","hiphop");
		assertEquals("Macarena", ae2.getTitle());
	}
	
	@Test
	public void getGenreTest() {
		Song ae3 = new Song("Les Sardines","Patrick Sebastien",322,"lessardines.wav","pop");
		assertEquals("pop", ae3.getGenre());
		
	}
}
	
	
