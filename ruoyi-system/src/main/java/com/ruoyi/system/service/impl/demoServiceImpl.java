package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.demoMapper;
import com.ruoyi.system.domain.demo;
import com.ruoyi.system.service.IdemoService;

/**
 * demoService业务层处理
 *
 * @author ruoyi
 * @date 2023-06-26
 */
@Service
public class demoServiceImpl implements IdemoService
{
    @Autowired
    private demoMapper demoMapper;

    /**
     * 查询demo
     *
     * @param id demo主键
     * @return demo
     */
    @Override
    public demo selectdemoById(Long id)
    {
        return demoMapper.selectdemoById(id);
    }

    /**
     * 查询demo列表
     *
     * @param demo demo
     * @return demo
     */
    @Override
    public List<demo> selectdemoList(demo demo)
    {
        return demoMapper.selectdemoList(demo);
    }

    /**
     * 新增demo
     *
     * @param demo demo
     * @return 结果
     */
    @Override
    public int insertdemo(demo demo)
    {
        return demoMapper.insertdemo(demo);
    }

    /**
     * 修改demo
     *
     * @param demo demo
     * @return 结果
     */
    @Override
    public int updatedemo(demo demo)
    {
        return demoMapper.updatedemo(demo);
    }

    /**
     * 批量删除demo
     *
     * @param ids 需要删除的demo主键
     * @return 结果
     */
    @Override
    public int deletedemoByIds(Long[] ids)
    {
        return demoMapper.deletedemoByIds(ids);
    }

    /**
     * 删除demo信息
     *
     * @param id demo主键
     * @return 结果
     */
    @Override
    public int deletedemoById(Long id)
    {
        return demoMapper.deletedemoById(id);
    }
}
