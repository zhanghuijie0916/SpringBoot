package org.sunny.meng.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.sunny.meng.dao.DeptEntity;
import org.sunny.meng.dao.FirstGroupEntity;

import java.util.List;

@Service
@EnableTransactionManagement
public interface DeptMapper {

    /*@Select("SELECT * FROM firstGroup")
    @Result(javaType = Dept.class)
    List<FirstGroup> findAll();*/

    /**
     * 找到所有
     * @return
     */
    List<DeptEntity> findAll();

    DeptEntity deptGroup(String name);

    List<FirstGroupEntity> joinSelect(String name);
}
