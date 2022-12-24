package com.ning.dao.impl;

import com.ning.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * ClassName: BaseDaoImpl
 * Package: com.ning.dao.impl
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 22:14
 */
@Service
public class BaseDaoImpl implements BaseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_user";
        int integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }
}
