
public class Book extends TangibleAsset {
    private String isbn;
    public Book(String name, int pricce, String color, String isbn){
	    super(name,price,color);
	    this.isbn = isbn;
    }
    public String getlsbn(){ return this.isbn; }
}
