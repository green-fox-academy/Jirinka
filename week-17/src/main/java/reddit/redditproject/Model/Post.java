package reddit.redditproject.Model;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    private int votes;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date time;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public Post() {
        this.time= new Date();
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.time= new Date();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
