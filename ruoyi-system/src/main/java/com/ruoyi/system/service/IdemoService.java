package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.demo;

/**
 * demoService接口
 *
 * @author ruoyi
 * @date 2023-06-26
 */
public interface IdemoService
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
     * 批量删除demo
     *
     * @param ids 需要删除的demo主键集合
     * @return 结果
     */
    public int deletedemoByIds(Long[] ids);

    /**
     * 删除demo信息
     *
     * @param id demo主键
     * @return 结果
     */
    public int deletedemoById(Long id);
}
