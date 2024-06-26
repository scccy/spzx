package com.spzx.product.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spzx.product.domain.Brand;
import com.spzx.product.mapper.BrandMapper;
import com.spzx.product.service.BrandService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    /**
     * @param brand
     * @return 判断是否存在同名
     */
    private boolean extractedBrandName(Brand brand) {
        Brand one = this.getOne(Wrappers.lambdaQuery(Brand.class).eq(Brand::getName, brand.getName()));
        boolean empty = one==null;
        return ObjectUtils.isEmpty(one);

    }

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
        if (extractedBrandName(brand)) {
            return this.save(brand);
        }
        return false;
    }

    @Override
    public boolean del(List<Long> id) {
        return this.removeByIds(id);
    }

    @Override
    public boolean updateData(Brand brand) {
        if (extractedBrandName(brand)) {
            return this.save(brand);
        }
        return false;
    }


    @Override
    public List<Brand> getAll() {
        return this.list();
    }
}
