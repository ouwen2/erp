package com.upup.stock.service.impl;

import com.upup.base.util.PageBean;
import com.upup.stock.mapper.StoreoperMapper;
import com.upup.stock.model.Inventory;
import com.upup.stock.model.Storeoper;
import com.upup.stock.service.IStoreoperService;
import com.upup.stock.vo.StoreoperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class StoreoperServiceImpl implements IStoreoperService {

    @Autowired
    private StoreoperMapper storeoperMapper;

    @Override
    public List<Map<String, Object>> queryStoredetailPage(StoreoperVo storeoperVo, PageBean pageBean) {

        if(storeoperVo.getSysEmpUuid()==null){
            storeoperVo.setSysEmpUuid("");
        }
        if(storeoperVo.getStoreName()==null){
            storeoperVo.setStoreName("");
        }
        if(storeoperVo.getGoodsName()==null){
            storeoperVo.setGoodsName("");
        }
        if(storeoperVo.getMin()==null){
            storeoperVo.setMin("");
        }
        if(storeoperVo.getMax()==null){
            storeoperVo.setMax("");
        }

        System.out.println(storeoperVo);

        return storeoperMapper.queryStoredetailPage(storeoperVo);
    }

    @Override
    public int insert(Inventory record) {
        return storeoperMapper.insert(record);
    }



}
