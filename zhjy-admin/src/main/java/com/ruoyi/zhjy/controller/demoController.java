package com.ruoyi.zhjy.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import com.ruoyi.system.domain.demo;
import com.ruoyi.system.service.IdemoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * demoController
 *
 * @author ruoyi
 * @date 2023-06-26
 */
@Api("ssss")
@RestController
@RequestMapping("/zhjy/demo")
public class demoController extends BaseController
{
    @Autowired
    private IdemoService demoService;

    /**
     * 查询demo列表  姚国聪到此一游00000000000000000000000000
     */
    @ApiOperation("查询demo列表s")
    @PreAuthorize("@ss.hasPermi('zhjy:demo:list')")
    @GetMapping("/list")
    public TableDataInfo list(demo demo)
    {
        startPage();
        List<demo> list = demoService.selectdemoList(demo);
        return getDataTable(list);
    }

    /**
     * 导出demo列表
     */
    @ApiOperation("导出demo列表")
    @PreAuthorize("@ss.hasPermi('zhjy:demo:export')")
    @Log(title = "demo", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, demo demo)
    {
        List<demo> list = demoService.selectdemoList(demo);
        ExcelUtil<demo> util = new ExcelUtil<demo>(demo.class);
        util.exportExcel(response, list, "demo数据");
    }

    /**
     * 获取demo详细信息
     */
    @ApiOperation("获取demo详细信息")
    @PreAuthorize("@ss.hasPermi('zhjy:demo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(demoService.selectdemoById(id));
    }

    /**
     * 新增demo
     */
    @ApiOperation("新增demo")
    @PreAuthorize("@ss.hasPermi('zhjy:demo:add')")
    @Log(title = "demo", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody demo demo)
    {
        return toAjax(demoService.insertdemo(demo));
    }

    /**
     * 修改demo
     */
    @ApiOperation("修改demo")
    @PreAuthorize("@ss.hasPermi('zhjy:demo:edit')")
    @Log(title = "demo", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody demo demo)
    {
        return toAjax(demoService.updatedemo(demo));
    }

    /**
     * 删除demo
     */
    @PreAuthorize("@ss.hasPermi('zhjy:demo:remove')")
    @Log(title = "demo", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(demoService.deletedemoByIds(ids));
    }

    /**
     * dddddd
     */
}
