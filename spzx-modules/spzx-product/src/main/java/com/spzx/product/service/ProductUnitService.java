package com.spzx.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spzx.product.domain.ProductUnit;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ProductUnitService extends IService<ProductUnit>{


    IPage<ProductUnit> getPageList(Page<ProductUnit> productUnitPage, ProductUnit productUnit);
}
