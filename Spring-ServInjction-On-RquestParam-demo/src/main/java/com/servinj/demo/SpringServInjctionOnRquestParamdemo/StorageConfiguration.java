package com.servinj.demo.SpringServInjctionOnRquestParamdemo;

import com.servinj.demo.SpringServInjctionOnRquestParamdemo.Services.StorageTypesI;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
@Data
public class StorageConfiguration {

    Map<String, StorageTypesI> servicesMap;
    public StorageConfiguration(List<StorageTypesI> serviceList) {
        System.out.println(serviceList.size());
        this.servicesMap = serviceList.stream().collect(Collectors.toMap(s -> s.printStorageProvider(), Function.identity()));

    }


}
