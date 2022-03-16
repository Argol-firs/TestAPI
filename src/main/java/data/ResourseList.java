package data;

import java.util.List;

public class ResourseList {
        private Integer page;
        private Integer per_page;
        private Integer total;
        private Integer total_pages;
        private List<DataUserList> datalist;
        private Support support;
        private int size;

        public ResourseList(){
            super();
        }

        public ResourseList(Integer page, Integer per_page, Integer total, Integer total_pages, List<DataUserList> datalist, Support support) {
            this.page = page;
            this.per_page = per_page;
            this.total = total;
            this.total_pages = total_pages;
            this.support = support;
            this.datalist = datalist;
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

        public List<DataUserList> getData() {
            return datalist;
        }

        public void setData(List<DataUserList> datalist) {
            this.datalist = datalist;
        }

        public List<DataUserList> getDatalist() {
            return datalist;
        }

        public void setDatalist(List<DataUserList> datalist) {
            this.datalist = datalist;
        }

        public Support getSupport() {
            return support;
        }

        public void setSupport(Support support) {
            this.support = support;
        }

        public int getSize(List<DataUserList> datalist) {
            return datalist.size();
        }

        public boolean sortList(List<DataUserList> datalist) {
            for (int i = 0; i < getSize(datalist)-1; i++) {
                if (datalist.get(i).getYear() < datalist.get(i+1).getYear()) {
                    return true;
                }
            }
            return false;
        }
    }
