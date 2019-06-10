package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "collect")
public class Collect implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name = "username")
	private String username;
	@Column(name = "goods_id")
	private int goods_id;






	public String getUserame() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public Collect(String username, int goods_id) {
		super();

		this.username = username;
		this.goods_id = goods_id;


	}
	public Collect() {
		super();
	}
}
