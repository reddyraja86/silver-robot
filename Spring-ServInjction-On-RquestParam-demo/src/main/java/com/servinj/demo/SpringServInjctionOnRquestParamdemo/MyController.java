package com.servinj.demo.SpringServInjctionOnRquestParamdemo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class MyController {


    @Autowired
    public  StorageConfiguration storageConfiguration;

    @GetMapping("/")
    public  String getValues(){
        System.out.println("======="+storageConfiguration.getServicesMap().size());
        storageConfiguration.servicesMap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));

        return "test";
    }

}
