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
import org.aspectj.weaver.loadtime.Aj;
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
    @Operation(summary = "查看详情")
    public Brand getDetail(@PathVariable("id")Long id ){
        return brandService.getDetail(id);
    }

    @PostMapping()
    @Operation(summary = "新增")
    public AjaxResult add(@RequestBody Brand brand){
//       获取当前登入用户的信息,并且赋予创建人信息
        brand.setCreateBy(SecurityUtils.getUsername());
        return toAjax(brandService.add(brand));
    }
    @DeleteMapping()
    @Operation(summary = "删除")
    public AjaxResult del(@PathVariable("id") List<Long> idList ){
        return toAjax(brandService.del(idList));
    }

    @PutMapping
    @Operation(summary = "修改")
    public AjaxResult updateData(@RequestBody Brand brand){
        brand.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(brandService.updateData(brand));
    }

    @GetMapping("/getBrandAll")
    @Operation(summary = "获取所有数据")
    public AjaxResult getBrandAll(){
        return success(brandService.getAll());
    }

}