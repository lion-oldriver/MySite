import java.util.*;
public class Book implements Comparable<Book>, Cloneable{
  private String title;
  private Date publishDate;
  private String comment;

  public int hashCode(){
    int result = 17;
    result = result * 31 + title.hashCode();
    result = result * 31 + publishDate.hashCode();
    return result;
  }

  public boolean equals(object o){
    if(o == this) {
      return true;
    }
    if(o == null) {
      return false;
    }
    if(!(o instanceof Book)) {
      return false;
    }
    Book b = (Book)o;
    if(!this.title.equals(b.title)){
      return false;
    }
    if(!this.publishDate.equals(b.publishDate)){
      return false;
    }
    return true;
  }

  public int compareTo(Book o){
    return this.publishDate.compareTo(o.publishDate);
  }

  public Book clone(){
    Book result = new Book();
    result.title = this.title.clone();
    result.publishDate = this.publishDate.clone();
    result.comment = this.comment.clone();
    return result;
  }
}