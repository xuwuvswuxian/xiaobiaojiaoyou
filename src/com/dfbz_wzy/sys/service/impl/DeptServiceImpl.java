package com.dfbz_wzy.sys.service.impl;

import com.dfbz_wzy.sys.dao.DeptDao;
import com.dfbz_wzy.sys.entity.Dept;
import com.dfbz_wzy.sys.service.DeptService;

import java.util.List;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 19:44
 * @description 部门服务类描述
 */
public class DeptServiceImpl implements DeptService {

    private DeptDao deptDao = new DeptDao();

    @Override
    public List<Dept> deptList() {
        return deptDao.deptList();
    }
}
