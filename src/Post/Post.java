package Post;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String author;
    private Date createDate;
    private String title;
    private String content;
    private Integer likesCount = 0;
    List<Comment> comments = new ArrayList<>();

    public Post(String author, Date createDate, String title, String content) {
        this.author = author;
        this.createDate = createDate;
        this.title = title;
        this.content = content;
    }

    public void addLikes(){
        likesCount++;
    }

    public void addComment(String comment){
        comments.add(new Comment(comment));
    }

    public String getAuthor() {
        return author;
    }

    public String getFormatedCreateDate() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = formatter.format(createDate);
        return s;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
