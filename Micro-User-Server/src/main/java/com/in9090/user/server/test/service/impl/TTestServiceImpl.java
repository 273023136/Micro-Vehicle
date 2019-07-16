package com.in9090.user.server.test.service.impl;

import com.in9090.user.server.test.entity.TTest;
import com.in9090.user.server.test.mapper.TTestMapper;
import com.in9090.user.server.test.service.TTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TTestServiceImpl implements TTestService {

    @Autowired
    private TTestMapper tTestMapper;

    @Override
    public List<TTest> listTTest(Long id){

        Example example = new Example(TTest.class);
        example.createCriteria().andEqualTo("id",id);
        return  tTestMapper.selectByExample(example);

    }
}
