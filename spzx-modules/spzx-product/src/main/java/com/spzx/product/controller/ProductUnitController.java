package com.spzx.product.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spzx.common.core.web.controller.BaseController;
import com.spzx.common.core.web.page.TableDataInfo;
import com.spzx.product.domain.ProductUnit;
import com.spzx.product.service.ProductUnitService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productUnit")
public class ProductUnitController extends BaseController {
    @Resource
    ProductUnitService productUnitService;

    @Operation(summary = "分页信息")
    @GetMapping("/list")
    public TableDataInfo getPageList(Integer pageNum, Integer pageSize, ProductUnit ProductUnit) {
        Page<ProductUnit> productUnitPage = new Page<>(pageSize,pageNum);
        IPage<ProductUnit> iPage= productUnitService.getPageList(productUnitPage,ProductUnit);

        return getDataTable(iPage);
    }


}
