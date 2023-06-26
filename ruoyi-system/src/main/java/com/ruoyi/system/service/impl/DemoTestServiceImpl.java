package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.DemoTest;
import com.ruoyi.system.mapper.DemoTestMapper;
import com.ruoyi.system.service.IDemoTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 測試Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@Service
public class DemoTestServiceImpl implements IDemoTestService
{
    @Autowired
    private DemoTestMapper demoTestMapper;

    /**
     * 查询測試
     *
     * @param id 測試主键
     * @return 測試
     */
    @Override
    public DemoTest selectDemoTestById(Long id)
    {
        return demoTestMapper.selectDemoTestById(id);
    }

    /**
     * 查询測試列表
     *
     * @param demoTest 測試
     * @return 測試
     */
    @Override
    public List<DemoTest> selectDemoTestList(DemoTest demoTest)
    {
        return demoTestMapper.selectDemoTestList(demoTest);
    }

    /**
     * 新增測試
     *
     * @param demoTest 測試
     * @return 结果
     */
    @Override
    public int insertDemoTest(DemoTest demoTest)
    {
        return demoTestMapper.insertDemoTest(demoTest);
    }

    /**
     * 修改測試
     *
     * @param demoTest 測試
     * @return 结果
     */
    @Override
    public int updateDemoTest(DemoTest demoTest)
    {
        return demoTestMapper.updateDemoTest(demoTest);
    }

    /**
     * 批量删除測試
     *
     * @param ids 需要删除的測試主键
     * @return 结果
     */
    @Override
    public int deleteDemoTestByIds(Long[] ids)
    {
        return demoTestMapper.deleteDemoTestByIds(ids);
    }

    /**
     * 删除測試信息
     *
     * @param id 測試主键
     * @return 结果
     */
    @Override
    public int deleteDemoTestById(Long id)
    {
        return demoTestMapper.deleteDemoTestById(id);
    }
}
