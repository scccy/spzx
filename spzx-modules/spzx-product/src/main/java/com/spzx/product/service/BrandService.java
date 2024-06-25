package com.spzx.product.service;

import com.spzx.common.core.web.domain.AjaxResult;
import com.spzx.product.domain.Brand;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface BrandService extends IService<Brand>{


    List<Brand> getList(Brand brand);

    Brand getDetail(Long id);

    boolean add(Brand brand);
}
