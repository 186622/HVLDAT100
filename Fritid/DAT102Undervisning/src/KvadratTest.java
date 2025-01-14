import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class KvadratTest {
	@Test // Slik vi annoterer og viser til t est
	void fungererArealOgOmkrets() {
		Figur2D k = new Kvadrat(3);
		
		assertEquals(9.0, k.areal()); // 9.0 Er det vi forventer at k.areal skal gi ut
		assertEquals(12.0, k.omkrets());
		
	}
}
