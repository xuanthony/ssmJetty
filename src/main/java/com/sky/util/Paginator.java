package com.sky.util;

import java.io.Serializable;

/**
 * 分页器
 *
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/17 22:00 xuxinbin Exp $$
 */
public class Paginator<P> implements Serializable {

    private static final long serialVersionUID = -1798760343404603214L;

    /**
     * 默认每页显示的数量
     */
    public static Integer DEFAULT_PAGE_SIZE = 10;

    /**
     * 每页显示的数量
     */
    private Integer pageSize;

    /**
     * 起始位置
     */
    private Integer offIndex;

    /**
     * 查询参数（待定）
     */
    private P parameter;

    public Paginator(int currentPage) {
        this.offIndex = (currentPage - 1) * DEFAULT_PAGE_SIZE;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    public Paginator(int currentPage, int pageSize) {
        this.offIndex = (currentPage -1) * Math.abs(pageSize);
        offIndex = offIndex < 0 ? 0 : offIndex;
        this.pageSize = Math.abs(pageSize);
    }

    /**
     * Getter method for property pageSize.
     *
     * @return property value of pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Setter method for property pageSize.
     *
     * @param pageSize value to be assigned to property pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter method for property offIndex.
     *
     * @return property value of offIndex
     */
    public Integer getOffIndex() {
        return offIndex;
    }

    /**
     * Setter method for property offIndex.
     *
     * @param offIndex value to be assigned to property offIndex
     */
    public void setOffIndex(Integer offIndex) {
        this.offIndex = offIndex;
    }

    /**
     * Getter method for property parameter.
     *
     * @return property value of parameter
     */
    public P getParameter() {
        return parameter;
    }

    /**
     * Setter method for property parameter.
     *
     * @param parameter value to be assigned to property parameter
     */
    public void setParameter(P parameter) {
        this.parameter = parameter;
    }
}
