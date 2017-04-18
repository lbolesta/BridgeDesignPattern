
public abstract class WebApplication {
	protected ThemeInterface theme; 
	
	public WebApplication(ThemeInterface theme){
		this.theme = theme; 
	}
	
	public abstract void printType();
	//public abstract void printTheme(); possibly add later
	public abstract void addSite();
	public abstract void addTheme();
}
