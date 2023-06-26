package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.DemoTest;

import java.util.List;

/**
 * 測試Mapper接口
 *
 * @author ruoyi
 * @date 2023-06-25
 */
public interface DemoTestMapper
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
     * 删除測試
     *
     * @param id 測試主键
     * @return 结果
     */
    public int deleteDemoTestById(Long id);

    /**
     * 批量删除測試
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDemoTestByIds(Long[] ids);
}
