#include "jni.h"
#include "HelloWorld.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_HelloWorld_sayHelloWorld(JNIEnv *env,jobject obj){
    printf("Hello World! Spongecaptain~~~\n");
    return;
}