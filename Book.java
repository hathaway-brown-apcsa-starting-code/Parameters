
/**
 * This class represents a book including its title, author, number of pages, 
 * publication year, and current page
 *
 * @author Maxine Gilligan and APCS-A
 * @version (2019-09-17)
 */
public class Book
{
    private String title;
    private String author;
    private int numPages;
    private int publicationYear;
    private int currentPage;

    /**
     * Constructor for objects of class book
     * @param title               Title of the book
     * @param author              Author of the book
     * @param numPages            Number of pages in the book
     * @param publicationYear     Publication year of the book
     */
    public Book(String t, String a, int n, int y)
    {
        this.title = t;
        this.author = a;
        this.numPages = n;
        this.publicationYear = y;
        this.currentPage = 0;
    }

    /**
     * Returns the title of the book
     * @return the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the author of the book
     * @return the author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns the number of pages in the book
     * @return the number of pages in the book
     */
    public int getNumPages()
    {
        return numPages;
    }
    
    /**
     * Returns the publication year of the book
     * @return the publication year of the book
     */
    public int getPublicationYear()
    {
        return publicationYear;
    }
    
    /**
     * Returns the current page of the book
     * @return the current page of the book
     */
    public int getCurrentPage()
    {
        return currentPage;
    }
    
    /**
     * Checks if new current page is greater than the number of pages in the book
       * @return the current page of the book
     */
    public int setCurrentPage(int n)
    {
        if (n <= numPages)
        {
            currentPage = n;
        }
        return currentPage;
    }
    
    /**
     * Returns a message stating the title, author, number of pages, and publication year of the book
     * @return  the title, author, number of pages, and publication year of the book
     */
    public String toString()
    {
        return (title + " by " + author + ", " + numPages + " pages (" + publicationYear + ")");
    }
}
