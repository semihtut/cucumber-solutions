package VismaSolutions.POJO.Projects;

public class RootPhase{
	private String name;
	private String guid;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setGuid(String guid){
		this.guid = guid;
	}

	public String getGuid(){
		return guid;
	}

	@Override
 	public String toString(){
		return 
			"RootPhase{" + 
			"name = '" + name + '\'' + 
			",guid = '" + guid + '\'' + 
			"}";
		}
}
