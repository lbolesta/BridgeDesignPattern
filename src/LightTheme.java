
public class LightTheme implements ThemeInterface{

	@Override
	public void makeTheme(String color, String textType, int textSize) {
		System.out.println("Light Theme... " + "\n"+ "    Color: " + color + 
				"\n" + "    Text Type: " + textType + "\n" + "    Text Size: " + textSize + "\n");
		
	}


	@Override
	public void AddSite(String siteName, String siteDesc) {
		System.out.println("    Site name: " + siteName 
				+ "\n" + "    Site Description: " + siteDesc);
		
	}


	/*@Override
	public void printThemeType() {
		System.out.println("The theme of this website is light");
		
	}*/

}
