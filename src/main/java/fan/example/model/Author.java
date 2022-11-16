package fan.example.model;

public class Author {

	private String id;

	private String name;
	
	private String thumbnail;
	
	private int age;
	
	public Author() {
	}

	public Author(String id, String name, String thumbnail, int age) {
		super();
		this.id = id;
		this.name = name;
		this.thumbnail = thumbnail;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
}
