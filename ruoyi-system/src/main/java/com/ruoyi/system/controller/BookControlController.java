package com.ruoyi.system.controller;

import java.util.List;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.BookControl;
import com.ruoyi.system.service.IBookControlService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 书籍控制Controller
 *
 * @author ruoyi
 * @date 2026-06-25
 */
@RestController
@RequestMapping("/system/control")
public class BookControlController extends BaseController
{
    @Autowired
    private IBookControlService bookControlService;

    /**
     * 查询书籍控制列表
     */
    @PreAuthorize("@ss.hasPermi('system:control:list')")
    @GetMapping("/list")
    public TableDataInfo list(BookControl bookControl)
    {
        startPage();
        List<BookControl> list = bookControlService.selectBookControlList(bookControl);
        return getDataTable(list);
    }

    /**
     * 导出书籍控制列表
     */
    @PreAuthorize("@ss.hasPermi('system:control:export')")
    @Log(title = "书籍控制", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BookControl bookControl)
    {
        List<BookControl> list = bookControlService.selectBookControlList(bookControl);
        ExcelUtil<BookControl> util = new ExcelUtil<BookControl>(BookControl.class);
        util.exportExcel(response, list, "书籍控制数据");
    }

    /**
     * 获取书籍控制详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:control:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bookControlService.selectBookControlById(id));
    }

    /**
     * 新增书籍控制
     */
    @PreAuthorize("@ss.hasPermi('system:control:add')")
    @Log(title = "书籍控制", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BookControl bookControl)
    {
        return toAjax(bookControlService.insertBookControl(bookControl));
    }

    /**
     * 修改书籍控制
     */
    @PreAuthorize("@ss.hasPermi('system:control:edit')")
    @Log(title = "书籍控制", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BookControl bookControl)
    {
        return toAjax(bookControlService.updateBookControl(bookControl));
    }

    /**
     * 删除书籍控制
     */
    @PreAuthorize("@ss.hasPermi('system:control:remove')")
    @Log(title = "书籍控制", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bookControlService.deleteBookControlByIds(ids));
    }
}
