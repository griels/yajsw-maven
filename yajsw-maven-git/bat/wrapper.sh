#!/bin/bash
# -----------------------------------------------------------------------------
# execute a YAJSW command
#
# -----------------------------------------------------------------------------
echo Starting YAJSW
echo "$java_exe" "$wrapper_java_options" -jar "$wrapper_jar" "$@" 
"$java_exe" "$wrapper_java_options" -jar "$wrapper_jar" "$@" 
