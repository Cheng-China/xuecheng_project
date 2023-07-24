package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParams {
    //当前页面
    @ApiModelProperty("当前页码")
    private Long pageNo = 1L;
    //页面大小
    @ApiModelProperty("页面大小")
    private Long pageSize = 10L;
}
