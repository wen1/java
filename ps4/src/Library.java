public class Library {
	// field:
	String address;
	Book[] books ;
	int numOfBooks = 0;

	// static method
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	// instance method
	Library(String addr) {
		address = addr;
		books = new Book[4];
	}

	public void addBook(Book b) {
		if (numOfBooks < 4) {
			books[numOfBooks] = b;
			numOfBooks++;
		}
	}

	public void printAddress() {
		System.out.println(address);
	}

	public int getIndexOfBookWithTitle(String bookTitle) {
		int bookIndex = -1;
		for (int i = 0; i < numOfBooks; i++) {
			if (books[i].getTitle().equals(bookTitle)) {
				bookIndex = i;
			}
		}
		return bookIndex;
	}

	public void borrowBook(String bookTitle) {
		int bookIndex = getIndexOfBookWithTitle(bookTitle);
		if (bookIndex == -1) {
			System.out.println("Sorry, this book is not in our catalog.");
		} else {
			if (!books[bookIndex].isBorrowed()) {
				books[bookIndex].rented();
				System.out.println("You successfully borrowed"
						+ books[bookIndex].getTitle());
			} else {
				System.out.println("Sorry, this book is already borrowed.");
			}

		}
	}

	public void printAvailableBooks() {
		if (numOfBooks != 0) {
			for (int i = 0; i < numOfBooks; i++) {
				if (!books[i].isBorrowed()) {
					System.out.println(books[i].getTitle());
				}
			}
		} else {
			System.out.println("No book in catalog");
		}

	}

	public void returnBook(String bookTitle) {
		int bookIndex = getIndexOfBookWithTitle(bookTitle);
		if (bookIndex != -1) {
			if (books[bookIndex].isBorrowed()) {
				books[bookIndex].returned();
				System.out.println("You successfully returned " + bookTitle);
			} else {
				System.out.println(bookTitle + " is already returned");
			}
		} else {
			System.out.println(bookTitle + " does not belong to this library");
		}
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries

		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();

	}
}