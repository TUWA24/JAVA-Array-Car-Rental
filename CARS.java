
public class CARS {

	String[][] cars = new String[][] {
		{"Car Model ", " Car Brand ", " Availability ", " Renter "},
		{"Accent ", "    Hyundai ", "   Available ", "    None "},
		{"Ascent ", "    Subaru ", "    Available ", "    None "},
		{"Avalon ", "    Toyota ", "    Available ", "    None "},
		{"Bronco ", "    Ford ", "      Available ", "    None "}
	};
	
	
	public String Name, Avail,Renter;

	public void details() {

		for (String[] k : cars) {
			for (String e : k) {
				System.out.print(e);	
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
}