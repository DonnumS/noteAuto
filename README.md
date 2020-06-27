# Note Autmoator 


This is my note automator that gives me the ability to create new files in desired folders on the go in terminal

Use the command ```n``` to start, then type in folder, name of file and extension. If extension is left blank, the file wil default to a txt file.

I've made it so that each file is opened in the text editor Sublime.

Example of running:

```
n

Name of folder: Java
Name of file: mergeSort
Enter for test or type desired extension: java

// Creates a mergeSort.java file in my folder named Java
// If folder doesn't exist, a new is created. Same goes for the file itself
```


## Custom shell commands

I've made a custom shellscript that runs the java program when I input ```n``` in the terminal. Firstly I change directory to the folder where I keep all the files I create, create the file, and then return to my original directory. Like this:

```
#!/bin/bash

func n() {
    pwd | pbcopy
    cd
    cd /Users/"MY_USERNAME/Desktop/Notater/
    java -classpath /Users/"MY_USERNAME"/note Note
    cd $(pbpaste)
}

```


And in my .zshrc file I've added this line:
```source ~/.my_custom_commands.sh```

