package css.googledrive.demo.SpringContentStorageGoogleDriveDemo.StorageType;

public class GoogleStorage implements  StorageTypesI {
    public String STORAGE_TYPE = StorageTypesI.STORAGE_TYPE.GOOGLE.name();

    public String getStorageType(){
        return  STORAGE_TYPE;
    }
}
