package secondhandtrandingbackstage.secondhandtrandingbackstage.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "follow")
public class Follow implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name = "username")
	private String username;
	@Column(name = "seller")
	private String seller;






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

	public Follow(String username, String seller) {
		super();

		this.username = username;
		this.seller = seller;


	}
	public Follow() {
		super();
	}
}
