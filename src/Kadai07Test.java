import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai07Test extends Kadai07 {

	@Test
	void isNumeric() {

		Kadai07 k7 = new Kadai07();
		String s1 = "123456789";
		assertEquals(true , k7.isNumeric(s1));

	}

}
