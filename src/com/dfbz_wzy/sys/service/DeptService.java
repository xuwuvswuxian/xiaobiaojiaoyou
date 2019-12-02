package com.dfbz_wzy.sys.service;

import com.dfbz_wzy.sys.entity.Dept;
import com.dfbz_wzy.sys.entity.Page;
import com.dfbz_wzy.sys.entity.User;

import java.util.List;

/**
 * @author wzy
 * @company 东方标准
 * @date 2019/12/2 19:43
 * @description 部门接口
 */
public interface DeptService {

    List<Dept> deptList();
}
