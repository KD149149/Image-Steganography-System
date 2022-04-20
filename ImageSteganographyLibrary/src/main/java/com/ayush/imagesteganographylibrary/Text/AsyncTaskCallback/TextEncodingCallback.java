package com.kajal.imagesteganographylibrary.Text.AsyncTaskCallback;

import com.kajal.imagesteganographylibrary.Text.ImageSteganography;

/**
 * This the callback interface for TextEncoding AsyncTask.
 */

public interface TextEncodingCallback {

    void onStartTextEncoding();

    void onCompleteTextEncoding(ImageSteganography result);

}
