package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BookControl;

/**
 * 书籍控制Mapper接口
 *
 * @author ruoyi
 * @date 2026-06-25
 */
public interface BookControlMapper
{
    /**
     * 查询书籍控制
     *
     * @param id 书籍控制主键
     * @return 书籍控制
     */
    public BookControl selectBookControlById(Long id);

    /**
     * 查询书籍控制列表
     *
     * @param bookControl 书籍控制
     * @return 书籍控制集合
     */
    public List<BookControl> selectBookControlList(BookControl bookControl);

    /**
     * 新增书籍控制
     *
     * @param bookControl 书籍控制
     * @return 结果
     */
    public int insertBookControl(BookControl bookControl);

    /**
     * 修改书籍控制
     *
     * @param bookControl 书籍控制
     * @return 结果
     */
    public int updateBookControl(BookControl bookControl);

    /**
     * 删除书籍控制
     *
     * @param id 书籍控制主键
     * @return 结果
     */
    public int deleteBookControlById(Long id);

    /**
     * 批量删除书籍控制
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookControlByIds(Long[] ids);
}
