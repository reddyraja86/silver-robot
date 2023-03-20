package com.servinj.demo.SpringServInjctionOnRquestParamdemo.Services;

import org.springframework.stereotype.Service;

@Service
public class GoogleStorage implements  StorageTypesI {
    public String STORAGE_TYPE = StorageTypesI.STORAGE_TYPE.GOOGLE.name();

    @Override
    public String printStorageProvider() {
        return this.STORAGE_TYPE;
    }
}
