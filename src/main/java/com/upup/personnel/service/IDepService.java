package com.upup.personnel.service;

import com.upup.base.aop.PageAop;
import com.upup.base.util.PageBean;
import com.upup.personnel.model.Dep;

import java.util.List;

//@Transactional
public interface IDepService {
    /**
     * 删除
     * @param uuid 编号
     * @return
     */
    int deleteByPrimaryKey(Integer uuid);

    /**
     * 新增部门
     * @param record
     * @return
     */
    int insertSelective(Dep record);

    /**
     * 下拉框的值
     * @return
     */
    List<Dep>  selectByUUid();

    /**
     * 修改
     * @param record 
     * @return
     */
    int updateByPrimaryKeySelective(Dep record);

   /* *//**
     * 修改管理员组的电话
     * @param record
     * @return
     *//*
    int updateByPrimaryKey(Dep record);*/

    /**
     * 模糊查询部门名称是否唯一，最左侧
     * @param name 要查询的部门名称
     * @return
     */
    Dep selectByDepName(String name);

    /**
     * 模糊查询
     * @param name 名称
     * @param tele 电话
     * @return
     */
    List<Dep> selectByPage(Dep dep, PageBean pageBean);
}