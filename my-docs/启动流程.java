java.c -> JavaMain
  java.c -> InitializeJVM
    jni.cpp -> JNI_CreateJavaVM
      thread.cpp -> create_vm
      
  jni.cpp -> jni_GetStaticMethodID   
  jni.cpp -> jni_CallStaticVoidMethod
    jni.cpp -> jni_invoke_static
      javaCalls.cpp -> call
        os_linux.cpp -> os_exception_wrapper
          javaCalls.cpp -> call_helper
