//main class


public class BridgeDemo {
	public static void main (String args[]){
		
		WebApplication newsLight = new News("Grey and white", "Helvetica", 12, 
				"Daily Herald", "Chicago news site", 
				new LightTheme());
		newsLight.printType();
		newsLight.addSite();
		newsLight.addTheme();
		
		WebApplication blogLight = new Blog("Pink and White", "Arial", 11, 
				"Cooking Daily", "Cooking site with recipes added daily", 
				new LightTheme());
		blogLight.printType();
		blogLight.addSite();
		blogLight.addTheme();
		
		WebApplication newsDark = new Blog("Black and Silver", "Times New Roman", 10, 
				"Washington Post", "national news site", 
				new DarkTheme());
		newsDark.printType();
		newsDark.addSite();
		newsDark.addTheme();
		
		WebApplication blogDark = new Blog("Navy Blue and White ", "Century", 12, 
				"Sailor's guide", "Blog about sailing with articles, news and merchandise", 
				new LightTheme());
		blogDark.printType();
		blogDark.addSite();
		blogDark.addTheme();
	}
}
