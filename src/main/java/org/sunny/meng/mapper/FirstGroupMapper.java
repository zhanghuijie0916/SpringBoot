package org.sunny.meng.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.sunny.meng.dao.FirstGroupEntity;

import java.util.List;

@Component
@EnableTransactionManagement
public interface FirstGroupMapper {

    List<FirstGroupEntity> findAll();

    FirstGroupEntity find(String name);

    List<FirstGroupEntity> findTask(String name);

    public void insert(FirstGroupEntity firstGroup);
}
