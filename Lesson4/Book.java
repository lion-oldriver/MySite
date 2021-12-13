import org.apache.commons.lang3.builder.*;
import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
  private String title;
  private Date publishDate;
  private String comment;

  public int hashCode(){
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public boolean equals(Object o){
    return EqualsBuilder.reflectionEquals(this, o);
  }

  public int compareTo(Book o){
    return CompareToBuilder.reflectionCompare(this, o);
  }

  public Book clone(){
    Book b = new Book();
    b.title = this.title;
    b.publishDate = (Date)this.publishDate.clone();
    b.comment = this.comment;
    return b;
  }
}