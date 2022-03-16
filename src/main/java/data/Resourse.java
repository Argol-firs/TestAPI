package data;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Resourse {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<DataUser> data;
    private List<String> avatars;
    private Support support;

    public Resourse(){
        super();
    }

    public Resourse(Integer page, Integer per_page, Integer total, Integer total_pages, List<DataUser> data, Support support, List<String> avatars) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
        this.support = support;
        this.avatars = avatars;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    public List<DataUser> getData() {
        return data;
    }

    public void setData(List<DataUser> data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public List<String> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<String> avatars) {
        this.avatars = avatars;
    }

    public static int getSize(List<DataUser> data) {
        return data.size();
    }

    public static List<String> replaseAvatars(List<DataUser> data) {
        List<String> avatars = new ArrayList<>();
        for (int i = 0; i < getSize(data); i++) {
            avatars.add(FilenameUtils.getBaseName(data.get(i).getAvatar()));
        }
        return avatars;
    }
}


