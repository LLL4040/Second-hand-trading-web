package secondhandtrandingbackstage.secondhandtrandingbackstage.Entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phone_number;





	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users(String username, String password, String phone_number,String email) {
		super();
		this.password = password;
		this.username = username;
		this.phone_number = phone_number;
		this.email = email;

	}
	public Users() {
		super();
	}
}
