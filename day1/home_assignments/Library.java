package week1.home_assignments;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		System.out.println(bookTitle);
		return bookTitle;
	}
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book = new Library();
		book.addBook("The Secret");
		book.issueBook();

	}

}
