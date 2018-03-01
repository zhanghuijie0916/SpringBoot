package org.sunny.meng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.sunny.meng.config.ConfigBean;
import org.sunny.meng.dao.FirstGroupEntity;
import org.sunny.meng.mapper.DeptMapper;
import org.sunny.meng.mapper.FirstGroupMapper;

@Controller
@EnableConfigurationProperties({ConfigBean.class})
public class serviceController {
    @Autowired
    private ConfigBean configBean;
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private FirstGroupMapper firstGroupMapper;

    /**
     * 请求configBean的配置参数
     * @return
     */
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        FirstGroupEntity p = firstGroupMapper.find("Mary");
        System.out.println(configBean.toString());
        return configBean.toString()+"\n"+p.toString();
    }

    /**
     * 请求图片
     * @param map
     * @return
     */
    @RequestMapping("/jpg")
    public String jpgPage(ModelMap map){
        map.addAttribute("hello2", "hello2 Thymeleaf!");
        map.addAttribute("hello", "hello Thymeleaf!");
        return "jpg";
    }


}
