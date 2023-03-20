package css.googledrive.demo.SpringContentStorageGoogleDriveDemo.StorageType;

public class AWSStorage implements  StorageTypesI{
    public String STORAGE_TYPE = StorageTypesI.STORAGE_TYPE.AWS.name();
    public String getStorageType(){
        return  STORAGE_TYPE;
    }
}
