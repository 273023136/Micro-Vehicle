package com.in9090.common.base;

import org.springframework.data.repository.NoRepositoryBean;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@NoRepositoryBean
public  interface BaseMapper<T> extends Mapper, MySqlMapper {


}

