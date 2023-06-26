package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.demo;

import java.util.List;


/**
 * demoMapper接口
 *
 * @author ruoyi
 * @date 2023-06-26
 */
public interface demoMapper
{
    /**
     * 查询demo
     *
     * @param id demo主键
     * @return demo
     */
    public demo selectdemoById(Long id);

    /**
     * 查询demo列表
     *
     * @param demo demo
     * @return demo集合
     */
    public List<demo> selectdemoList(demo demo);

    /**
     * 新增demo
     *
     * @param demo demo
     * @return 结果
     */
    public int insertdemo(demo demo);

    /**
     * 修改demo
     *
     * @param demo demo
     * @return 结果
     */
    public int updatedemo(demo demo);

    /**
     * 删除demo
     *
     * @param id demo主键
     * @return 结果
     */
    public int deletedemoById(Long id);

    /**
     * 批量删除demo
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletedemoByIds(Long[] ids);
}
