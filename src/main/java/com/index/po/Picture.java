package com.index.po;

/**
 * Created by Administrator on 2017/6/3.
 */
public class Picture {
    Integer id;
    String name;
    String desc;
    String path;

    public Picture(Integer id, String name, String desc, String path) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.path = path;
    }

    public Picture() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "PictureMapper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
