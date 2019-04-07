#include<jni.h>
#include<string.h>

JNIEXPORT jstring JNICALL Java_com_mer_ndk_ndkexample_MainActivity_getMsg(JNIEnv* env, jobject obj)
{
    return (*env)->NewStringUTF(env,"Hello Friends");
}