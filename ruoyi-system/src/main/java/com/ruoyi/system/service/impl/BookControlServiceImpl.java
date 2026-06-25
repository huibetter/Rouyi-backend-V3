package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BookControlMapper;
import com.ruoyi.system.domain.BookControl;
import com.ruoyi.system.service.IBookControlService;

/**
 * 书籍控制Service业务层处理
 *
 * @author ruoyi
 * @date 2026-06-25
 */
@Service
public class BookControlServiceImpl implements IBookControlService
{
    @Autowired
    private BookControlMapper bookControlMapper;

    /**
     * 查询书籍控制
     *
     * @param id 书籍控制主键
     * @return 书籍控制
     */
    @Override
    public BookControl selectBookControlById(Long id)
    {
        return bookControlMapper.selectBookControlById(id);
    }

    /**
     * 查询书籍控制列表
     *
     * @param bookControl 书籍控制
     * @return 书籍控制
     */
    @Override
    public List<BookControl> selectBookControlList(BookControl bookControl)
    {
        return bookControlMapper.selectBookControlList(bookControl);
    }

    /**
     * 新增书籍控制
     *
     * @param bookControl 书籍控制
     * @return 结果
     */
    @Override
    public int insertBookControl(BookControl bookControl)
    {
        return bookControlMapper.insertBookControl(bookControl);
    }

    /**
     * 修改书籍控制
     *
     * @param bookControl 书籍控制
     * @return 结果
     */
    @Override
    public int updateBookControl(BookControl bookControl)
    {
        return bookControlMapper.updateBookControl(bookControl);
    }

    /**
     * 批量删除书籍控制
     *
     * @param ids 需要删除的书籍控制主键
     * @return 结果
     */
    @Override
    public int deleteBookControlByIds(Long[] ids)
    {
        return bookControlMapper.deleteBookControlByIds(ids);
    }

    /**
     * 删除书籍控制信息
     *
     * @param id 书籍控制主键
     * @return 结果
     */
    @Override
    public int deleteBookControlById(Long id)
    {
        return bookControlMapper.deleteBookControlById(id);
    }
}
