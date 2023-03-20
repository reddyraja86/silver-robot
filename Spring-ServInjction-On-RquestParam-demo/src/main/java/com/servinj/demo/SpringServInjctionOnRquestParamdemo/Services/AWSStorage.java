package com.servinj.demo.SpringServInjctionOnRquestParamdemo.Services;

import org.springframework.stereotype.Service;

@Service
public class AWSStorage implements  StorageTypesI{
    public String STORAGE_TYPE = StorageTypesI.STORAGE_TYPE.AWS.name();

    @Override
    public String printStorageProvider() {
        return this.STORAGE_TYPE;
    }
}
