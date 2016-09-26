package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage.InvalidStoragePathException;
import seedu.addressbook.storage.Storage.StorageOperationException;

public class StorageStub extends Storage {
    
    public static final String DEFAULT_TEST_FILEPATH = "testSaveFile.txt";
    
    /**
     * @throws InvalidStorageFilePathException if the given file path is invalid
     */
    public StorageStub(String filePath) throws InvalidStoragePathException {
        init(filePath);
    }
    
    @Override
    public Storage init() throws InvalidStoragePathException {
        return init(DEFAULT_TEST_FILEPATH);
    }
    
    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
    }
}
