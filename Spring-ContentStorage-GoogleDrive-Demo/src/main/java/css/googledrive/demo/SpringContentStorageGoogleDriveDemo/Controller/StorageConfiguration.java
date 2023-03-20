package css.googledrive.demo.SpringContentStorageGoogleDriveDemo.Controller;

import css.googledrive.demo.SpringContentStorageGoogleDriveDemo.StorageType.StorageTypesI;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
@Data
public class StorageConfiguration {

    private final List<StorageTypesI> services;
    Map<String, StorageTypesI> servicesMap = new HashMap<>();
    @Autowired
    public StorageConfiguration( List<StorageTypesI> services) {
        this.services = services;
        this.servicesMap = services.stream().collect(Collectors.toMap(s -> s.getClass().getSimpleName(), Function.identity()));

    }


}
