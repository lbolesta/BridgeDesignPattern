
public class News extends WebApplication {
	
	private String siteName;
	private String siteDesc;
	private String color;
	private String textType;
	private int textSize;
	

	public News(String color, String textType, int textSize, String siteName, String siteDesc, ThemeInterface theme) {
		super(theme);
		this.siteName = siteName;
		this.siteDesc = siteDesc; 
		this.color = color;
		this.textType = textType;
		this.textSize = textSize; 
	}
	
	@Override
	public void printType(){
		System.out.println("This is a news site");
	}

	@Override
	public void addSite() {
		theme.AddSite(siteName, siteDesc);
		
	}

	@Override
	public void addTheme() {
		theme.makeTheme(color, textType, textSize);
		
	}

	/*@Override
	public void printTheme() {
		theme.printThemeType();
		
	}*/

	

}
