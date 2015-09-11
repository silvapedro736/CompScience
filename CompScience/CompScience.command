clear


echo Wellcome to Computer Science class!
echo By: Pedro Silva
echo
echo
echo Push [1]
echo Clone [2]
echo 
read start

if [ $start == 1 ]
then

clear


echo Username:
read username

echo Email:
read email

git config —-global user.name $username
git config —-global user.email $email

clear

echo Login Done!

echo press enter to continue
read pause

clear

echo Give Path to Folder
echo (ex. path/to/project/folder)
read path

cd $path

git init

echo press enter to continue
read pause

clear

echo 
echo Would you like to add a specific file or all files?
echo
echo Specific [1]
echo All [2]
echo 
read file

if [ $file == 1 ]
then

clear

echo FileName:
echo ex. file.jpg
read filename

git add $filename

elif [ $file == 2 ]
then

git add .

else
echo not valid
exit

fi

clear

echo Comment on the file change:
read commit

git commit -m “$commit”

echo press enter to continue
read pause

clear

echo Repo Name:
echo ex. reponame.git
read repo
git remote add origin https://github.com/$username/$repo
git remote -v
git push origin master

echo press enter to continue
read pause

clear

echo Done!
 


 
elif [ $start == 2 ]

then

clear


	echo Wellcome to Computer Science class!
	echo By: Pedro Silva
	echo 
	echo path/to/the/folder:
	read path
	
	cd $path


	clear
	echo Wellcome to Computer Science class!
	echo By: Pedro Silva
	echo
	echo
	echo -n Username:
	read username
	echo
	echo
	echo -n FileName:
	read filename
	git clone https://github.com/$username/$filename
	clear
	echo Done!

else
	echo not valid

fi





