package Collect.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.models.auth.In;

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
    private Integer goods_id;


    public Integer getCollect_id() {
        return collect_id;
    }
    public void setCollect_id(Integer collect_id) {
        this.collect_id = collect_id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getGoods_id() {
        return goods_id;
    }
    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Collect(String username, Integer goods_id) {
        super();
        this.username = username;
        this.goods_id = goods_id;
    }
    public Collect() {
        super();
    }
}
