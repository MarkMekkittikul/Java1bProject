

public class Video extends CustomMedia {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Video [author=" + author + ", getAuthor()=" + getAuthor()
				+ ", getName()=" + getName() + ", getLocation()="
				+ getLocation() + ", getFormat()=" + getFormat()
				+ ", getNotes()=" + getNotes() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private String author;

	/**
	 * @return the format
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(String name, String author, String format, String location,
			String notes) throws NoNameException {
		super(name, format, location, notes);
		setAuthor(author);
	}

}
