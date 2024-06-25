package com.spzx.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.spzx.common.core.web.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 分类品牌
 */
@Schema(description = "分类品牌")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "brand")
public class Brand extends BaseEntity {
    /**
     * 品牌名称
     */
    @TableField(value = "`name`")
    @Schema(description = "品牌名称")
    private String name;

    /**
     * 品牌图标
     */
    @TableField(value = "logo")
    @Schema(description = "品牌图标")
    private String logo;
}