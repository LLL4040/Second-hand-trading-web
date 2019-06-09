package Entity;




import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table(name = "goods")
public class Goods implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "goods_id")
	private int goods_id;
	@Column(name = "cover")
	private int cover;
	@Column(name = "title")
	private String title;
	@Column(name = "detail")
	private String detail;
	@Column(name = "username")
	private String username;
	@Column(name = "contact")
	private String contact;
	@Column(name = "status")
	private int status;

	
	
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getCover() {
		return cover;
	}
	public void setCover(int cover) {
		this.cover = cover;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public Goods(int goods_id, int cover, String title,String detail,String username,String contact,int status) {
		super();
		this.goods_id = goods_id;
		this.cover = cover;
		this.title = title;
		this.detail = detail;
		this.username = username;
		this.contact = contact;
		this.status = status;

	}
	public Goods() {
		super();
	}
}
