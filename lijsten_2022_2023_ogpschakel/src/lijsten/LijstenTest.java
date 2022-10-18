package lijsten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LijstenTest {

	@Test
	void test() {
		LegeLijst ll = LegeLijst.INSTANCE;
		assertEquals(0, ll.getLengte());
		assertEquals(ll, ll);
		assertEquals("[]", ll.toString());
		
		NietLegeLijst nll1 = new NietLegeLijst(10, ll);
		NietLegeLijst nll2 = new NietLegeLijst(20, nll1);
		NietLegeLijst nll3 = new NietLegeLijst(30, nll2);
		assertEquals(3, nll3.getLengte());
		assertEquals("[30, 20, 10]", nll3 + "");
		NietLegeLijst nll4 = new NietLegeLijst(10, ll);
		NietLegeLijst nll5 = new NietLegeLijst(20, nll4);
		NietLegeLijst nll6 = new NietLegeLijst(30, nll5);
		assertEquals(nll3, nll6);
		assertNotEquals(nll3, nll5);
		assertNotEquals(nll3, ll);
	}

}
