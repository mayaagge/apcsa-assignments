public class Textbook extends Book{
  private int edition;
  private boolean isEbook;
  public Textbook(String title, String author, int edition, boolean isEbook){
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
