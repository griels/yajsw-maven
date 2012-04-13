#!/bin/bash
# -----------------------------------------------------------------------------
# execute a YAJSW command
#
# -----------------------------------------------------------------------------
set jna.nosys=true
set jna.boot.library.path=/home/aculab/webworkspace/build/shared/thirdpartylibs/yajsw/wrapper.jar
echo doing the stuff
"$java_exe" "$wrapper_java_options" -jar "$wrapper_jar" "$@" 
