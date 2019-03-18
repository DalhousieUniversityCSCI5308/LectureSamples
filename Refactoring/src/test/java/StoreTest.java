import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StoreTest
{
	private static IPromotionDatabase promotionDatabase;
	private static IProductDatabase productDatabase;
	private static final float ALLOWED_FLOAT_DELTA = 0.00001f;
	
	@BeforeAll
   public static void setUp()
	{
		productDatabase = new ProductDatabaseMock();
		promotionDatabase = new PromotionDatabaseMock();
	}
	
	private Address createEmptyAddress()
	{
		return new Address("", "", "", "");
	}
	
	@Test
	@DisplayName("calculateValueAllStock")
	void calculateValueAllStock()
	{
		Store store = new Store(productDatabase, promotionDatabase, createEmptyAddress());
		assertEquals(5.46f, store.calculateValueAllStock(), ALLOWED_FLOAT_DELTA);
	}
	
	@Test
	@DisplayName("calculateMarketValueAllStock")
	void calculateMarketValueAllStock()
	{
		Store store = new Store(productDatabase, promotionDatabase, createEmptyAddress());
		assertEquals(9.6564f, store.calculateMarketValueAllStock(), ALLOWED_FLOAT_DELTA);
	}
	
	@Test
	@DisplayName("getContactInfo")
	void GetContactInfo()
	{
		Address address = new Address("1 Street", "Halifax", "Nova Scotia", "B2T1A4");
		Store store = new Store(productDatabase, promotionDatabase, address);
		assertEquals("1 Street\nHalifax\nNova Scotia\nB2T1A4", store.getContactInfo());
	}
}