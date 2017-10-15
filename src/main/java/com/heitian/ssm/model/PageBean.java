package com.heitian.ssm.model;

import java.util.List;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class PageBean<T> {
    // 传递的参数或是配置的参数
    private int currentPage; // 当前页
    private int pageSize; // 每页显示多少条记录

    // 查询数据库
    private List<T> recordList; // 本页的数据列表
    private int recordCount; // 总记录数

    // 计算
    private int pageCount; // 总页数
    private int beginPageIndex; // 页码列表的开始索引（包含）
    private int endPageIndex; // 页码列表的结束索引（包含）

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<T> getRecordList() {
        return recordList;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getBeginPageIndex() {
        return beginPageIndex;
    }

    public int getEndPageIndex() {
        return endPageIndex;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setRecordList(List<T> recordList) {
        this.recordList = recordList;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setBeginPageIndex(int beginPageIndex) {
        this.beginPageIndex = beginPageIndex;
    }

    public void setEndPageIndex(int endPageIndex) {
        this.endPageIndex = endPageIndex;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", recordList=" + recordList +
                ", recordCount=" + recordCount +
                ", pageCount=" + pageCount +
                ", beginPageIndex=" + beginPageIndex +
                ", endPageIndex=" + endPageIndex +
                '}';
    }

    public PageBean(int currentPage, int pageSize, List<T> recordList, int recordCount, int pageCount, int beginPageIndex, int endPageIndex) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.recordList = recordList;
        this.recordCount = recordCount;
        this.pageCount = pageCount;
        this.beginPageIndex = beginPageIndex;
        this.endPageIndex = endPageIndex;
    }

    public PageBean() {
    }
}
