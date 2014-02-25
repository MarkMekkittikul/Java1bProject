

public class VideoGame extends CustomMedia {
	
	public VideoGame() {
		// TODO Auto-generated constructor stub
	}
	public VideoGame(String name, String format, String location, String notes) throws NoNameException{
		super(name, format, location, notes);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VideoGame [getName()=" + getName() + ", getLocation()="
				+ getLocation() + ", getFormat()=" + getFormat()
				+ ", getNotes()=" + getNotes() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
