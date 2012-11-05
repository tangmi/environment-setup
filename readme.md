# a study on 2d game programming

requires slick2d and lwjgl to be in the build path:


## setting up dev environment

to add into an eclipse project's build path:

### 1. download library files

1. download lwjgl and slick and extract and place them somewhere (i have mine in my workspace folder)
	* LWJGL - [http://www.lwjgl.org/download.php](http://www.lwjgl.org/download.php)
	* Slick - [http://slick.cokeandcode.com/downloads/slick.zip](http://slick.cokeandcode.com/downloads/slick.zip)


### 2. navigate to the "Add Library" window

1. right click on the project
2. click "Properties" at bottom
3. click "Java Build Path" on left
4. click "Add Library" on right
5. choose "User Library" and continue
6. click "User Libraries…" on right
	
### 4. add and configure lwjgl library

1. click "New…" on right
2. name this library "LWJGL", or similar
3. click "Add External Libraries…" on right
4. navigate to the "lib" folder in your downloaded lwjgl folder
5. select "lwjgl.jar" and "lwjgl_util.jar"
6. expand your "LWJGL" library, then the "lwjgl.jar" jar file
7. add the folder that corresponds to your operating system in the "native" folder of your downloaded lwjgl folder to the "Native library location"
8. (optional) add the javadocs:

	* lwjgl.jar - [http://lwjgl.org/javadoc/](http://lwjgl.org/javadoc/)
	* lwjgl_util.jar - [http://lwjgl.org/javadoc/](http://lwjgl.org/javadoc/)

### 5. add and configure slick library

1. repeat this process in a new user library, "Slick" with the "slick.jar" and "slick-util.jar" files (no need to deal with native libraries)
2. (optional) add the javadocs:

	* slick.jar - [http://slick.cokeandcode.com/javadoc/](http://slick.cokeandcode.com/javadoc/)
	* slick-util.jar - [http://slick.cokeandcode.com/javadoc-util/](http://slick.cokeandcode.com/javadoc-util/)

### 6. add to current project's build path

1. click "Ok" to close the user library preferences window
2. select both new libraries ("LWJGL" and "Slick") and click finish

	* they should both appear in your "Java Build Path" window in the "Libraries" tab.

* (note) if you want to add these libraries in another project, you don't need to re-add the two libraries: just check them off when you first reach the "Add Library" window