
package com.mycompany.eagle.Utilities;

// Imports the Google Cloud client library
import static com.google.api.client.util.Charsets.UTF_8;
import com.google.cloud.storage.Acl;
import com.google.cloud.storage.Acl.Role;
import com.google.cloud.storage.Acl.User;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class GoogleCloudCaller {
    private Storage storage;
    private String bucketName = "eagle-ee1b0.appspot.com";

    public GoogleCloudCaller() {
        // Instantiates a client
        storage = StorageOptions.getDefaultInstance().getService();
    }
    
    public void getImage(){
        Blob blob = storage.get(BlobId.of(bucketName, "shibe.jpg"));
        
        // The path to which the file should be downloaded
        Path destFilePath = Paths.get("shibe.jpg");
        blob.downloadTo(destFilePath);      
    }
    
    public void saveImage(String id, FileInputStream image){
        BlobId blobId = BlobId.of(bucketName, "Reviewees/" + id + ".jpg");
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId)
                .setAcl(new ArrayList<>(Arrays.asList(Acl.of(User.ofAllUsers(), Role.READER))))
                .build();
        storage.create(blobInfo, image);        
    }
}
