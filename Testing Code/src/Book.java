

public class Book extends CustomMedia {
	private String author;

	/**
	 * @return the format
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param format the format to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String name, String author, String format, String location, String notes) throws NoNameException{
		super(name, format, location, notes);
		setAuthor(author);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [author=" + author + ", getAuthor()=" + getAuthor()
				+ ", getName()=" + getName() + ", getLocation()="
				+ getLocation() + ", getFormat()=" + getFormat()
				+ ", getNotes()=" + getNotes() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
