package com.ning.dao;

/**
 * ClassName: BaseDao
 * Package: com.ning.dao.impl
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 22:12
 */
public interface BaseDao {
    /**
     * 查询数据表的记录条数
     * @return 数据表的记录条数
     */
    int selectCount();
}
