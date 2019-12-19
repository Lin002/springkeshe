package com.example.springkeshe.Controller;

import com.example.springkeshe.Mapper.employeeMapper;
import com.example.springkeshe.pojo.deapartandtotal;
import com.example.springkeshe.pojo.departmentAndSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class helloController {

    @Autowired
    employeeMapper eM;
    @GetMapping("selectbySalary")
    public int[] selectbySalary(){
        return eM.selectbySalary();
    }
    @GetMapping("selectNumber")
    public List<deapartandtotal> selectNumber(){
        return  eM.selectNumber();
    }
}
