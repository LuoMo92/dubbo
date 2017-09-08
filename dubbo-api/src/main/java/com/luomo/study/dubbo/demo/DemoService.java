package com.luomo.study.dubbo.demo;

import java.util.List;

/**
 * Created by LiuMei on 2017-09-08.
 */
public interface DemoService {

    List<String> getPermissions(Long id);

}
