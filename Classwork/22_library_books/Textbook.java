public class Textbook extends Book{
  private int edition;
  public boolean isEbook;
  public TextBook(String title, String author, int edition, boolean isEbook){
    super(title, author);
    this.edition = edition;
    this.isEbook = isEbook;
  }
  public boolean getEbook(){
    return isEbook;
  }
  //Override
  public String toString(){
    return "Textbook edition # " + this.edition;
  }
}
