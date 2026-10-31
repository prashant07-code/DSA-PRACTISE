@echo off
setlocal

if "%~1"=="" (
    echo Usage: run-java.cmd "path\to\File.java"
    exit /b 2
)

set "FILE=%~f1"
set "FILEDIR=%~dp1"
if "%FILEDIR:~-1%"=="\" set "FILEDIR=%FILEDIR:~0,-1%"
set "CLS=%~n1"

rem Workspace root = parent of the .vscode folder that holds this script
for %%R in ("%~dp0..") do set "ROOT=%%~fR"
set "OUT=%ROOT%\.java-out"

rem Read the package name (indentation allowed, commented lines ignored)
set "PKG="
for /f "tokens=2 delims=; " %%p in ('findstr /r /c:"^[^a-zA-Z/*]*package " "%FILE%"') do if not defined PKG set "PKG=%%p"

rem Wipe old output so a stale .class can never run
if exist "%OUT%" rd /s /q "%OUT%"
mkdir "%OUT%"

javac -encoding UTF-8 -d "%OUT%" -sourcepath "%ROOT%;%FILEDIR%" "%FILE%"
if errorlevel 1 exit /b 1

if defined PKG (set "MAIN=%PKG%.%CLS%") else (set "MAIN=%CLS%")

java -cp "%OUT%" %MAIN%
exit /b %errorlevel%
