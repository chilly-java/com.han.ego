package com.bjsxt.pojo;

import java.io.Serializable;

/**
 * Solr实体
 */
public class SolrItem implements Serializable {
    private Long id;
    private String title;
    private String sell_point;
    private Long price;
    private String image;
    private String name;
    private String item_desc;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSell_point(String sell_point) {
        this.sell_point = sell_point;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSell_point() {
        return sell_point;
    }

    public Long getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getItem_desc() {
        return item_desc;
    }
}
