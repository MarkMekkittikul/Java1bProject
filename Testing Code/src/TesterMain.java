

public class TesterMain {

	public TesterMain() {
		
	}
	public static void main(String args[]){
		List mediaList = new List<CustomMedia>();
		try {	
			Book bookTest;
			Book bookTest1;
			Song songTest;
			Song songTest1;
			bookTest = new Book("Title", "author", "something", "I forgot", "This is the third one");
			bookTest1 = new Book("Title", "author", "something", "I forgot", "This is the third one");
			songTest = new Song("Song", "author", "something", "song", "nom nom");
			songTest1 = new Song("Song", "author", "something", "song", "nom nom");
			mediaList.add(bookTest);
			mediaList.add(bookTest1);
			mediaList.add(songTest);
			mediaList.add(songTest1);


		} catch (NoNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(mediaList);
		
		/*List sortedList = new List<CustomMedia>();
		try{
			sortedList = mediaList.returnAllOfType("Book");
		}catch(Exception e){
			
		}
		System.out.println(sortedList);*/
		List searchList = new List<CustomMedia>();
		try{
			searchList = mediaList.searchTitle("Song");
		}catch(Exception e){
			
		}
		try{
			searchList = mediaList.searchTitleAndClass("Song", "Song");
		}catch(Exception e){
			
		}
		System.out.println(searchList);
	}

}
