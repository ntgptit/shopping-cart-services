package com.giapnt.shopping.cart.utils.pagination;

import java.util.List;

/**
 * The Class PageHelper.
 *
 * @author GiapNT
 */
public class PageHelper {

	private int pageNum;
	private int pageSize;
	private int pages;
	private int total;
	List<Object> objects;

	/**
	 * Instantiates a new page helper.
	 */
	public PageHelper() {
		super();
	}

	/**
	 * Instantiates a new page helper.
	 *
	 * @param pageNum  the page num
	 * @param pageSize the page size
	 * @param pages    the pages
	 * @param total    the total
	 * @param objects  the objects
	 */
	public PageHelper(int pageNum, int pageSize, int pages, int total, List<Object> objects) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.pages = pages;
		this.total = total;
		this.objects = objects;
	}

	/**
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}

	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum <= 0 ? 1 : pageNum;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize <= 0 ? 10 : pageSize;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
		if (total == -1) {
			pages = 1;
			return;
		}
		if (pageSize > 0) {
			pages = (int) (total / pageSize + ((total % pageSize == 0) ? 0 : 1));
		} else {
			pages = 0;
		}
		if (pageNum > pages && pages != 0) {
			pageNum = pages;
		}
	}

	/**
	 * @return the objects
	 */
	public List<Object> getObjects() {
		return objects;
	}

	/**
	 * @param objects the objects to set
	 */
	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}

}
