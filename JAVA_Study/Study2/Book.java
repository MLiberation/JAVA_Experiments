public class Book
{
	public int bookID;
	public String title;
	public int pageCount;
	public String[] recommendedBooks = new String[3];
	public int recommendedBookCounter;

	public Book(int bookID, String title, int pageCount)
	{
		this.bookID = bookID;
		this.title = title;
		this.pageCount = pageCount;
	}

	public void addRecommendedBook(Book book)
	{
		if(recommendedBookCounter == 0)
		{
			recommendedBooks[0] = book.title;
			recommendedBookCounter = 1;
		}
		else if(recommendedBookCounter == 1)
		{
			recommendedBooks[1] = book.title;
			recommendedBookCounter = 2;
		}
		else if(recommendedBookCounter == 2)
		{
			recommendedBooks[2] = book.title;
			recommendedBookCounter = 3;
		}	
	}

	@Override
	public String toString()
	{
		return ("BookId: [" + bookID + "] Title: [" + title + "] PageCount: [" + pageCount + "]");
	}
}
