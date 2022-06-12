cmake_minimum_required(VERSION 3.18.1)

set(OpenCV_DIR "/home/jason9075/Documents/OpenCV-android-sdk/sdk/native/jni")

find_package(OpenCV REQUIRED)

project("myopencv")

add_library(myopencv
            SHARED
            myopencv.cpp)

include_directories(${OpenCV_INCLUDE_DIRS})

find_library(log-lib
             log)

# For Android Bitvert to cv::Mat
find_library(jnigraphics-lib jnigraphics)

target_link_libraries(myopencv
                      ${OpenCV_LIBS}
                      ${jnigraphics-lib} # For Android Bitmap Covert to cv::Mat
                      ${log-lib})