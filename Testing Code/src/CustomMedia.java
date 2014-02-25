

public class CustomMedia {

	private String title;
	private String location;
	private String format;
	private String notes;
	/**
	 * @return the name
	 */
	public String getName() {
		return title;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.title = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public CustomMedia() {
		// TODO Auto-generated constructor stub
	}

	public CustomMedia(String name, String location, String format, String notes) throws NoNameException{
		if(name == null){
			throw new NoNameException("Please Enter a Name/Title");
		}
		this.title = name;
		this.location = location;
		this.format = format;
		this.notes = notes;
	}
}
