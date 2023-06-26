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
import com.ruoyi.system.domain.DemoTest;
import com.ruoyi.system.service.IDemoTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 測試Controller
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Api("測試模塊")
@RestController
@RequestMapping("/zhjy/test")
public class DemoTestController extends BaseController
{
    @Autowired
    private IDemoTestService demoTestService;

    /**
     * 查询測試列表
     */
    @ApiOperation("查询測試列表")
    @PreAuthorize("@ss.hasPermi('zhjy:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(DemoTest demoTest)
    {
        startPage();
        List<DemoTest> list = demoTestService.selectDemoTestList(demoTest);
        return getDataTable(list);
    }

    /**
     * 导出測試列表
     */
    @ApiOperation("导出測試列表")
    @PreAuthorize("@ss.hasPermi('zhjy:test:export')")
    @Log(title = "測試", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DemoTest demoTest)
    {
        List<DemoTest> list = demoTestService.selectDemoTestList(demoTest);
        ExcelUtil<DemoTest> util = new ExcelUtil<DemoTest>(DemoTest.class);
        util.exportExcel(response, list, "測試数据");
    }

    /**
     * 获取測試详细信息
     */
    @ApiOperation("获取測試详细信息")
    @PreAuthorize("@ss.hasPermi('zhjy:test:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(demoTestService.selectDemoTestById(id));
    }

    /**
     * 新增測試
     */
    @ApiOperation("新增測試")
    @PreAuthorize("@ss.hasPermi('zhjy:test:add')")
    @Log(title = "測試", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DemoTest demoTest)
    {
        return toAjax(demoTestService.insertDemoTest(demoTest));
    }

    /**
     * 修改測試
     */
    @ApiOperation("修改測試")
    @PreAuthorize("@ss.hasPermi('zhjy:test:edit')")
    @Log(title = "測試", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DemoTest demoTest)
    {
        return toAjax(demoTestService.updateDemoTest(demoTest));
    }

    /**
     * 删除測試
     */
    @ApiOperation("删除測試")
    @PreAuthorize("@ss.hasPermi('zhjy:test:remove')")
    @Log(title = "測試", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(demoTestService.deleteDemoTestByIds(ids));
    }
}
