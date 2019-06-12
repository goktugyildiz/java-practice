package day49_inheritance02;

public class BookStore {

	public static void main(String[] args) {
		
		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		///
		ebook.readEBook(10);

		ebook.readEBook(621);
		
		//
			AudioBook list1 = new AudioBook();
			list1.setTitle("OCA prepration");
			list1.setAuthor("Jeanne");
			list1.setNarrator("Marufjon");
			list1.listen();
			
			PaperBack pb = new PaperBack();
			pb.setAuthor("Malcom Gladwill");
			pb.setTitle("Outliers");
			pb.setType("Biograpfy");
			pb.setPrice(20);
			pb.setPages(304);
		
			System.out.println(pb.toString());

	}

}
