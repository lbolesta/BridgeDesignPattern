//ignore this class for now may be useful when more functionality is added
public class Article {
	
	private String name;
	private String desc; 
	
	public Article(String name, String desc){
		this.name = name; 
		this.desc = desc; 
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public void setDesc(String name){
		this.desc = desc;
	}
}
