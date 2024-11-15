public class Driver{
  public static void main(String[] args){
    ArrayList<Book> library = new ArrayList<Book>();
    Book harryPotter = new Novel();
    Book percyJackson = new Novel();
    Book chemistry101 = new Textbook();
    Book apcsFundamentals = new Textbook();
    Book helloLife = new Book();
    Book sleepingSoon = new Book()
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
