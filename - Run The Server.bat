@echo off
title  Running Server
java -Xms512m -Xmx512m -cp bin;data/libs/* com.rs.Launcher false false true
pause