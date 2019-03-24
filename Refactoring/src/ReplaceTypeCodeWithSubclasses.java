public class ReplaceTypeCodeWithSubclasses
{
	private enum ButtonColour
	{
		RED,
		BLUE
	}
	
	// REPLACE TYPE CODE WITH SUBCLASSES
	// This is a bit of a silly button because I don't know how much other logic
	// you would attach to the button colour, however it demonstrates the idea.
	// The getButtonCSSColour shows that if you choose type codes your logic for
	// handling all of the possible values of the type code will be all over the
	// place in your class and become difficult to maintain and potentially
	// introduce bugs when you add type codes but forget to update every place they
	// are used.  Fix with object oriented programming.
	private class Button
	{
		private final ButtonColour colour;
		
		public Button(ButtonColour colour)
		{
			this.colour = colour;
		}
		
		public String getButtonCSSColour()
		{
			if (colour == ButtonColour.RED)
			{
				return "#FF0000";
			}
			else
			{
				return "#0000FF";
			}
		}
	}
	
	public String getRedButtonColour()
	{
		Button b = new Button(ButtonColour.RED);
		return b.getButtonCSSColour();
	}

	public String getBlueButtonColour()
	{
		Button b = new Button(ButtonColour.BLUE);
		return b.getButtonCSSColour();
	}
}
