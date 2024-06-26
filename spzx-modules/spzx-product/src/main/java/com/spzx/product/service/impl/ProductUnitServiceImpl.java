package com.spzx.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spzx.product.domain.ProductUnit;
import com.spzx.product.mapper.ProductUnitMapper;
import com.spzx.product.service.ProductUnitService;
import org.springframework.stereotype.Service;

@Service
public class ProductUnitServiceImpl extends ServiceImpl<ProductUnitMapper, ProductUnit> implements ProductUnitService {

    @Override
    public IPage<ProductUnit> getPageList(Page<ProductUnit> productUnitPage, ProductUnit productUnit) {
//         this.page(productUnitPage,Wrappers.lambdaQuery(ProductUnit.class).like(ProductUnit::getName, productUnit.getName()));
        LambdaQueryWrapper<ProductUnit> queryWrapper = new LambdaQueryWrapper<>();
        if (productUnit.getName()!=null) {
            queryWrapper.like(ProductUnit::getName, productUnit.getName());
        }
        return this.page(productUnitPage, queryWrapper);
    }
}
