package com.example.springkeshe.Mapper;

import com.example.springkeshe.pojo.deapartandtotal;
import com.example.springkeshe.pojo.department;
import com.example.springkeshe.pojo.departmentAndSalary;
import com.example.springkeshe.pojo.salaryy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.swing.*;
import java.util.List;

@Mapper
public interface employeeMapper {
    @Select("SELECT salary from salary order by salary DESC")
    public int[] selectbySalary();
    @Select("select department.dept_id, employee.dept_id dept_id2,department.dept_name,count(*) total from department RIGHT JOIN  employee  ON department.dept_id=employee.dept_id GROUP BY dept_id2")
    public List<deapartandtotal> selectNumber();
}
