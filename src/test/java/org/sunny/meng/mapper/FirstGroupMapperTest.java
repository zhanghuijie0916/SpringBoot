package org.sunny.meng.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunny.meng.dao.FirstGroupEntity;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstGroupMapperTest {

    @Autowired
    private FirstGroupMapper firstGroupMapper;
    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void find() throws Exception {
    }

    @Test
    public void findTask() throws Exception {
    }

    @Test
    @Rollback
    public void insert() throws Exception {
        FirstGroupEntity entity = new FirstGroupEntity(8,"Lily",30000.3,"scala");
        firstGroupMapper.insert(entity);
    }

}