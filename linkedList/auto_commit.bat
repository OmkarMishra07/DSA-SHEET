@echo off
cd "C:\path\to\your\project"
git config user.name "omkarmishra07"
git config user.email "omkar794mishra@gmail.com"

git add .

git commit -m "commit on %date% %time%"

git push origin main

echo Auto commit completed on %date% at %time%.
pause
