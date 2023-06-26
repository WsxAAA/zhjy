package com.ruoyi.system.service;

import com.ruoyi.system.domain.DemoTest;

import java.util.List;

/**
 * 測試Service接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface IDemoTestService
{
    /**
     * 查询測試
     *
     * @param id 測試主键
     * @return 測試
     */
    public DemoTest selectDemoTestById(Long id);

    /**
     * 查询測試列表
     *
     * @param demoTest 測試
     * @return 測試集合
     */
    public List<DemoTest> selectDemoTestList(DemoTest demoTest);

    /**
     * 新增測試
     *
     * @param demoTest 測試
     * @return 结果
     */
    public int insertDemoTest(DemoTest demoTest);

    /**
     * 修改測試
     *
     * @param demoTest 測試
     * @return 结果
     */
    public int updateDemoTest(DemoTest demoTest);

    /**
     * 批量删除測試
     *
     * @param ids 需要删除的測試主键集合
     * @return 结果
     */
    public int deleteDemoTestByIds(Long[] ids);

    /**
     * 删除測試信息
     *
     * @param id 測試主键
     * @return 结果
     */
    public int deleteDemoTestById(Long id);
}
