package secondhandtrandingbackstage.secondhandtrandingbackstage.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "collect")
public class Collect implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name = "collect_id")
    @JsonBackReference
    @JsonManagedReference
    private Integer collect_id;

    @Column(name = "username")
    private String username;
    @Column(name = "goods_id")
    private int goods_id;





    public int getCollect_id() {
        return collect_id;
    }
    public void setCollect_id(int collect_id) {
        this.collect_id = collect_id;
    }
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

    public Collect(int collect_id,String username, int goods_id) {
        super();
        this.collect_id=collect_id;
        this.username = username;
        this.goods_id = goods_id;


    }
    public Collect() {
        super();
    }
}

