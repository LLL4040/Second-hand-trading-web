package Comments.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "comments")
public class Comments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "comment_id")
    private int comment_id;
    @Column(name = "username")
    private String username;
    @Column(name = "seller")
    private String seller;
    @Column(name = "comment")
    private String comment;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSeller() {
        return seller;
    }
    public void setSeller(String seller) {
        this.seller = seller;
    }
    public int getComment_id() {
        return comment_id;
    }
    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Comments(String username, String seller,String comment) {
        super();
        this.username = username;
        this.seller = seller;
        this.comment = comment;

    }
    public Comments() {
        super();
    }
}
