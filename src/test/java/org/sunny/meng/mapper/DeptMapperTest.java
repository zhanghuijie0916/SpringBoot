package org.sunny.meng.mapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.sunny.meng.dao.DeptEntity;
import org.sunny.meng.dao.FirstGroupEntity;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptMapperTest {

    @Autowired
    private DeptMapper deptMapper;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
        List<DeptEntity> list = deptMapper.findAll();
        for (DeptEntity entity:list) {
            System.out.println(entity.toString());
        }
    }

    @Test
    public void deptGroup() throws Exception {
        DeptEntity dept = deptMapper.deptGroup("java");
        List<FirstGroupEntity> list = dept.getGroups();
        for (FirstGroupEntity entity:list) {
            System.out.println(entity);
        }
    }

    @Test
    public void joinSelect() throws Exception {
        List<FirstGroupEntity> list = deptMapper.joinSelect("scala");
        for (FirstGroupEntity entity:list) {
            System.out.println(entity);
        }
    }

}