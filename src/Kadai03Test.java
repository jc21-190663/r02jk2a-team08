import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai03Test {

	@Test
	void TestcharacterList() {
		Kadai03 k = new Kadai03();
		String s = "Applepie";
		assertArrayEquals(new  char[]{'A','E','I','L','P'},k.CharacterList(s));
		assertNull(k.CharacterList(null)) ;
	}


}
