package com.cx.demo.controller;


import com.cx.demo.entity.TUserFrameLog;
import com.cx.demo.service.TUserFrameLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yuan
 * @since 2019-10-24
 */
@Controller
public class TUserFrameLogController {

    @Autowired
    TUserFrameLogService tUserFrameLogService;

    @RequestMapping("/u")
    @ResponseBody
    public String xxaaaa (){
        TUserFrameLog qsdd = tUserFrameLogService.getById(1);
        System.out.print("----"+qsdd.getJlDate()+"----"+qsdd.getAppCode());
        List<TUserFrameLog> sdaa = tUserFrameLogService.findByTUser();
        for(TUserFrameLog a : sdaa){
            System.out.println(a.toString());
        }
        return "111";
    }
}
