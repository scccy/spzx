package com.spzx.product.controller;

import com.spzx.common.core.web.controller.BaseController;
import com.spzx.common.core.web.domain.AjaxResult;
import com.spzx.common.core.web.page.TableDataInfo;
import com.spzx.common.security.utils.SecurityUtils;
import com.spzx.product.domain.Brand;
import com.spzx.product.service.BrandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brand")
@Tag(name ="品牌管理")
public class BrandController extends BaseController {
    @Resource
    BrandService brandService;

    @GetMapping("list")
    @Operation(summary = "品牌列表")
    public TableDataInfo list(Brand brand){
        startPage();
        List<Brand> list = brandService.getList(brand);
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public Brand getDetail(@PathVariable("id")Long id ){
        return brandService.getDetail(id);
    }

    @PutMapping()
    public AjaxResult add(@RequestBody Brand brand){
//       获取当前登入用户的信息,并且赋予创建人信息
        brand.setCreateBy(SecurityUtils.getUsername());
        return toAjax(brandService.add(brand));
    }
}