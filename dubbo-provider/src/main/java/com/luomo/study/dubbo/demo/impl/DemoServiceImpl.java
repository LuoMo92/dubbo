package com.luomo.study.dubbo.demo.impl;

import com.luomo.study.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuMei on 2017-09-08.
 */
public class DemoServiceImpl implements DemoService {

    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }

}
