package fan.example.model;

public class Book {

	private String id;
	
	private String title;
	
	private String text;
	
	private String authorId;
	
	public Book() {
		
	}

	public Book(String id, String title, String text, String authorId) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
		this.authorId = authorId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
}
