package secondhandtrandingbackstage.secondhandtrandingbackstage.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "follow")
public class Follow implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	@Column(name = "follow_id")
	@JsonBackReference
	@JsonManagedReference
	private Integer follow_id;
	@Column(name = "username")
	private String username;
	@Column(name = "seller")
	private String seller;


	public Integer getFollow_id() {
		return follow_id;
	}

	public void setFollow_id(Integer follow_id) {
		this.follow_id = follow_id;
	}
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
