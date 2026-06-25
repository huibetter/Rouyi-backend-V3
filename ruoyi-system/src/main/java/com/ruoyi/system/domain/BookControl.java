package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 书籍控制对象 book_control
 *
 * @author ruoyi
 * @date 2026-06-25
 */
public class BookControl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** 书籍编号 */
    @Excel(name = "书籍编号")
    private String isbn;

    /** 书名 */
    @Excel(name = "书名")
    private String bookName;

    /** 作者 */
    @Excel(name = "作者")
    private String bookAuthor;

    /** 书价 */
    @Excel(name = "书价")
    private BigDecimal bookPrice;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long bookNum;

    /** 书籍上架状态(0-下架，1-上架) */
    @Excel(name = "书籍上架状态(0-下架，1-上架)")
    private Integer bookStatus;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    public void setBookPrice(BigDecimal bookPrice)
    {
        this.bookPrice = bookPrice;
    }

    public BigDecimal getBookPrice()
    {
        return bookPrice;
    }

    public void setBookNum(Long bookNum)
    {
        this.bookNum = bookNum;
    }

    public Long getBookNum()
    {
        return bookNum;
    }

    public void setBookStatus(Integer bookStatus)
    {
        this.bookStatus = bookStatus;
    }

    public Integer getBookStatus()
    {
        return bookStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("isbn", getIsbn())
            .append("bookName", getBookName())
            .append("bookAuthor", getBookAuthor())
            .append("bookPrice", getBookPrice())
            .append("bookNum", getBookNum())
            .append("bookStatus", getBookStatus())
            .toString();
    }
}
