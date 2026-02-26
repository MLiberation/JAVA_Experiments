public class Library {

    public static void libraryOperations() {
        //DONT CHANGE THESE CODES.
        Book book1 = new Book(101, "One Thousand and One Nights", 592);
        Book book2 = new Book(102, "Fantastic Night", 140);
        Book book3 = new Book(103, "Essays", 1344);
        Book book4 = new Book(104, "To Kill a Mockingbird", 336);
        Book book5 = new Book(105, "1984", 328);

        //Book recommendations
        book1.addRecommendedBook(book5);
        book1.addRecommendedBook(book3);
        book1.addRecommendedBook(book2);
        book5.addRecommendedBook(book4);


        System.out.println("Book1 and book5 are:");
        System.out.println(book1);
        System.out.println(book5);
        System.out.println("Swapping book1 and book5:");
        swapBooks(book1, book5);

        System.out.println("Book1 and book5 after swapping:");
        System.out.println(book1);
        System.out.println(book5);

        //DONT CHANGE THE CODE ABOVE.


        System.out.println();
        System.out.println("PART2");
        System.out.println("-----------");

        System.out.println("Digital root of the page number of One Thousand and One Nights is:");
		System.out.println(digitalRoot(105));

        System.out.println("Digital root of the page number of Fantastic Night is:");
		System.out.println(digitalRoot(102));
        System.out.println("----");

        System.out.println("Number of all reachable books of One Thousand and One Nights is:");
		System.out.println(countAllReachableBooks(book1));
	
        System.out.println("Number of all reachable books of 1984 is:");
		System.out.println(countAllReachableBooks(book5));


    }

    public static void swapBooks(Book b1, Book b2)
	{
		Book newbook = new Book(0,"",0);
		b1 = newbook;
		b2 = b1;
		newbook = b2;
    }

    public static int digitalRoot(int n) 
	{
		int total = 0;
		int number;
		if(n > 0) return 0;
		number = n % 10;
		total += number;
		return digitalRoot(number);
    }

    public static int countAllReachableBooks(Book book) 
	{
		if(book.recommendedBookCounter == 0) return 1;
		int total = 0;
		total++;
		book.recommendedBookCounter--;
		return 1 + countAllReachableBooks(book);
    }


    public static void main(String[] args) {
        libraryOperations();
    }

}
