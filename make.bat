@echo off
rmdir /S /Q build dist 2>nul
mkdir build dist
dir /s /B src\*.java > sources.txt
javac @sources.txt -d build\
cd build
jar cf ..\dist\VerifyTriangle.jar .\*
cd ..
del sources.txt