package practicum.Observer;

public class Client
{
	public void auctionAnItem()
	{
		// Create an auctioneer, a singleton and concrete Subject class.
		Subject auctioneer = Auctioneer.instance();
		
		// Create 3 bidder objects with different max bids, attach them to the subject.
		
		// Start the auction at 1.
		auctioneer.notify(1);
	}
}
