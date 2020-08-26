package com.xdpg.controller;

import com.xdpg.pojo.Employee;
import com.xdpg.util.PageJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping("/empList")
    @ResponseBody
    public PageJson getAllEmp()
    {
        //List<Employee> empList = employeeDao.getAllDeptments();
        PageJson object = new PageJson();
        object.setCode(0);
        object.setMsg("OK");
        object.setCount(0);
        object.setData(null);
       // model.addAttribute("empList",empList);
        //System.out.println(empList.toString());
        return object;
    }
}
