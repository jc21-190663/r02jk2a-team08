import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai02Test  extends Kadai02{

	Kadai02 k2 = new Kadai02();

	@Test
	void countString() {
		assertEquals(4,k2.countString("aaaabbccc", 'a'));//普通
		assertEquals(0,k2.countString("aaaaaaafffbbb", 'u'));//検索文字が無い
		assertEquals(8,k2.countString("AAAAAaaaggg", 'A'));//
		assertEquals(0,k2.countString("      ",'h'));
	}

}
