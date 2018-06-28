package com.sneha.firebasedb;

/**
 * Created by Sneha on 27-06-2018.
 */

public class ImageInfoUpload {
    public String imageName;
    public String imageURL;
    public String imageInfo;

    public ImageInfoUpload(){

    }

    public ImageInfoUpload(String imageName, String imageURL, String imageInfo) {
        this.imageName = imageName;
        this.imageURL = imageURL;
        this.imageInfo = imageInfo;
    }

    public ImageInfoUpload(String imageName, String imageURL) {
        this.imageName = imageName;
        this.imageURL = imageURL;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }
}
