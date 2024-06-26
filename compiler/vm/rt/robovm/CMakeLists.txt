project(robovm-rt-core)

include_directories(../../core/include ${CMAKE_BINARY_DIR}/gc/include)

set(SRC
  rt.c
  reflection_helpers.c 
  java_lang_Class.c 
  java_lang_ClassCache.c 
  java_lang_Object.c 
  java_lang_Thread.c 
  java_lang_Throwable.c 
  java_lang_Runtime.c 
  java_lang_String.c 
  java_lang_System.c 
  java_lang_VMClassLoader.c 
  java_lang_ref_Reference.c 
  java_lang_reflect_AccessibleObject.c 
  java_lang_reflect_Array.c 
  java_lang_reflect_Constructor.c 
  java_lang_reflect_Field.c 
  java_lang_reflect_Method.c 
  java_lang_reflect_Proxy.c 
  java_net_NetworkInterface.c 
  org_robovm_rt_Signals.c 
  org_robovm_rt_GC.c 
  org_robovm_rt_VM.c 
  org_robovm_rt_bro_Dl.c 
  sun_misc_Unsafe.c 
)

if(DARWIN)
  add_definitions(-DNOUNCRYPT)
  set(OBJC_SRC darwin.m)
  set(SRC ${SRC} ${OBJC_SRC})
  set(OBJC_FLAGS "-x objective-c")
  if(IOS)
    set(OBJC_FLAGS "${OBJC_FLAGS} -fobjc-abi-version=2")
  endif()
  # disable errors on clang clang-1500.3.9.4
  set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wno-error=incompatible-function-pointer-types -Wno-error=int-conversion")
  # disable XCode14 objc-msgsend stubs to allow this lib to be linked with XCode13 and bellow
  set(OBJC_FLAGS "${OBJC_FLAGS} -fno-objc-msgsend-selector-stubs")
  set_property(SOURCE ${OBJC_SRC} PROPERTY LANGUAGE C)
  set_property(SOURCE ${OBJC_SRC} PROPERTY COMPILE_FLAGS ${OBJC_FLAGS})
endif()

add_library(robovm-rt-core OBJECT ${SRC})
add_dependencies(robovm-rt-core extgc)
set(ROBOVM_RT_CORE_OBJECTS $<TARGET_OBJECTS:robovm-rt-core> PARENT_SCOPE)

