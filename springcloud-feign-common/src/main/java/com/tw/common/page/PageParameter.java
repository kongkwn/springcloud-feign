package com.tw.common.page;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: tanwei
 * @Description:
 * @Date: Create in 16:03 2019/6/26
 */
@Data
public class PageParameter implements Serializable {

    private static final long serialVersionUID = -5922222313555828183L;

    private static final int DEFAULT_PAGE_SIZE = 10;

    private int currentPage;

    private int prePage;

    private int nextPage;

    private int pageSize;

    private int offset;

    private int totalPage;

    private int totalCount;

    public PageParameter() {
        this.currentPage = 1;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    /**
     * PageParameter.
     *
     * @param currentPage current page.
     * @param pageSize    page size.
     */
    public PageParameter(final Integer currentPage, final Integer pageSize) {
        this.currentPage = currentPage == null || currentPage <= 0 ? 1 : currentPage;
        this.pageSize = pageSize == null || pageSize <= 0 ? DEFAULT_PAGE_SIZE : pageSize;
        this.offset = (this.currentPage - 1) * this.pageSize;
    }

    /**
     * PageParameter.
     *
     * @param currentPage current page.
     * @param pageSize    page size.
     * @param totalCount  total count.
     */
    public PageParameter(final int currentPage, final int pageSize, final int totalCount) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = (int) Math.ceil((double) totalCount / (double) pageSize);
        this.prePage = currentPage <= 1 ? 1 : currentPage - 1;
        this.nextPage = currentPage >= this.totalPage ? this.totalPage : currentPage + 1;
    }

}
