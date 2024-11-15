import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<Book> library = new ArrayList<Book>();
    Book harryPotter = new Novel("Harry Potter", "J.K Rowling", 5, "Fiction");
    Book percyJackson = new Novel("Percy Jackson", "Rick Riordan", 4, "Mythology");
    Book chemistry101 = new Textbook("Chemistry 101", "John", 7, true);
    Book apcsFundamentals = new Textbook("APCS Fundamentals", "Ian", 9, false);
    Book helloLife = new Book("Hello Life", "Maya");
    Book sleepingSoon = new Book("Sleeping Soon", "the dead");
    library.add(harryPotter);
    library.add(sleepingSoon);
    library.add(percyJackson);
    library.add(chemistry101);
    library.add(helloLife);
    library.add(apcsFundamentals);
    print(library);
  }
  public static void print(ArrayList<Book> a){
  	if (a.size() == 0){
      	System.out.println("{}");
	}
	else{
		System.out.print("{");
		for (int i = 0; i< a.size()-1; i++){
			System.out.print((a.get(i)).toString() + ", ");
		}
		System.out.println(a.get(a.size()-1) + "}");
	}
  }
}
