package com.xdpg.controller;

import com.xdpg.pojo.Jd;
import com.xdpg.service.JdService;
import com.xdpg.util.JsonResult;
import com.xdpg.util.PageJson;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JdController {

    private static Logger logger = Logger.getLogger(JdController.class);

    @Autowired
    JdService jdService;

    @RequestMapping("/jd/jdList")
    @ResponseBody
    public PageJson<Jd> getJdList(){

        List<Jd> jdList = jdService.getJdList();
        PageJson<Jd> object = new PageJson<>();
        object.setCode(0);
        object.setMsg("OK");
        object.setCount(jdList.size());
        object.setData(jdList);
        logger.debug("JDlist---->"+jdList.size());
        return object;
    }

    @RequestMapping("/jd/jdEdit")
    public String getJdProInfo(@RequestParam("id") int id, Model model){
        Jd jdInfo = jdService.getJdById(id);
        if (jdInfo != null){
            model.addAttribute("jdInfo",jdInfo);
        }else {
            model.addAttribute("msg","数据库查询报错");
        }
        return "jd_veiw";
    }

    @PostMapping("/jd/jdSave")
    @ResponseBody
    public JsonResult editJd(Jd jd, Model model){
        int i = jdService.updateJd(jd);
        if(i>0){
           return JsonResult.ok();
        }else {
           return JsonResult.fail();
        }
    }
    @GetMapping("/jd/jdDel")
    @ResponseBody
    public JsonResult delJd(@RequestParam("id") int id, Model model){
        int i = jdService.delJd(id);
        if(i>0){
            return JsonResult.ok();
        }else {
            return JsonResult.fail();
        }
    }
}
