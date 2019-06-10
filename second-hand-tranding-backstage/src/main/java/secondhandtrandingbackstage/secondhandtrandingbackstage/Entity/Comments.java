package secondhandtrandingbackstage.secondhandtrandingbackstage.Entity;

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
    @Column(name = "comments_id")
    private int comments_id;
    @Column(name = "username")
    private String username;
    @Column(name = "seller")
    private String seller;
    @Column(name = "comment")
    private String comment;





    public String getUserame() {
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
    public int getComments_id() {
        return comments_id;
    }
    public void setComments_id(int comments_id) {
        this.comments_id = comments_id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Comments(int comments_id, String username, String seller,String comment) {
        super();
        this.comments_id = comments_id;
        this.username = username;
        this.seller = seller;
        this.comment = comment;

    }
    public Comments() {
        super();
    }
}
