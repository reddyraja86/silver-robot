package com.servinj.demo.SpringServInjctionOnRquestParamdemo.Services;

import org.springframework.stereotype.Service;


public interface StorageTypesI {

        enum STORAGE_TYPE {
            GOOGLE,
            AWS
        }
        public  String printStorageProvider();

}
