package com.spzx.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.spzx.common.core.web.domain.AjaxResult;
import com.spzx.common.core.web.domain.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spzx.product.domain.Brand;
import com.spzx.product.mapper.BrandMapper;
import com.spzx.product.service.BrandService;
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService{

    @Override
    public List<Brand> getList(Brand brand) {
        return this.list();
    }

    @Override
    public Brand getDetail(Long id) {
        return this.getById(id);

    }

    @Override
    public boolean add(Brand brand) {
        return this.save(brand);
    }
}
