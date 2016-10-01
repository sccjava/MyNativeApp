//
// Created by Harman on 7/5/16.
//

#include <string.h>
#include <jni.h>
#include <android/log.h>

jint Java_com_harman_mylib_MyLib_create( JNIEnv* env, jobject thiz )
{
    __android_log_print(ANDROID_LOG_VERBOSE, "jPlayerAPI", "Java_com_harman_mylib_MyLib_create called");
    return 33;
}