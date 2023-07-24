package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "课程信息编辑接口", tags = "课程信息编辑接口")
@RestController
public class CourseInfoController {

    /**
     * 可以根据条件查询课程信息列表
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 查询条件
     * @return 课程信息列表
     */
    @ApiOperation("/课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams,
                                       @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        return null;
    }
}
