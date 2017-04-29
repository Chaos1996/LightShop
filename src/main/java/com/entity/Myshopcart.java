package com.entity;
// Generated 2017-4-28 9:10:52 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Myshopcart generated by hbm2java
 */
@Entity
@Table(name = "myshopcart", catalog = "shop")
public class Myshopcart implements java.io.Serializable {

    private Integer shopCartId;
    private Light light;
    private User user;
    private Date addDate;

    public Myshopcart() {
    }

    public Myshopcart(Light light, User user, Date addDate) {
        this.light = light;
        this.user = user;
        this.addDate = addDate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ShopCartId", unique = true, nullable = false)
    public Integer getShopCartId() {
        return this.shopCartId;
    }

    public void setShopCartId(Integer shopCartId) {
        this.shopCartId = shopCartId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LightId", nullable = false)
    public Light getLight() {
        return this.light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId", nullable = false)
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "AddDate", nullable = false, length = 19)
    public Date getAddDate() {
        return this.addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

}
