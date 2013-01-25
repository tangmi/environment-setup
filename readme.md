# Java game development environment

This is a quick tutorial for anybody who's interested in setting up their Eclipse workspace for Java game development.

## Setting up an environment for game development

LWJGL (Light Weight Java Game Library) and Slick2d can help make game development in Java much easier. LWJGL provides access to OpenGL, OpenAL, and OpenCL functions, without the need for icky byte code. Slick2d provides a simple way to create 2d games (built on top of LWJGL), and it's included slick-util library provides easy texture loading for 3d games.

These libraries are external libraries, so we'll need to add them into a project's build path before we can use them. We will be adding both libraries to Eclipse "User Libraries" so we can easily reuse them in multiple projects.

To add into an eclipse project's build path:

### 1. Download library files

1. Download LWJGL and Slick. Extract and place them somewhere they can live (I have mine in a "lib" folder in my workspace folder)
	* LWJGL - [http://www.lwjgl.org/download.php](http://www.lwjgl.org/download.php)
	* Slick - [http://slick.cokeandcode.com/downloads/slick.zip](http://slick.cokeandcode.com/downloads/slick.zip)


### 2. Navigate to the "Add Library" window

We need to get to where Eclipse lets us add our user-defined libraries.

1. Right click on the project
2. Click "Properties" at bottom
3. Click "Java Build Path" on left
4. Click "Add Library" on right
5. Choose "User Library" and continue
6. Click "User Libraries…" on right
	
### 4. Add and configure LWJGL library

We are going to create a user library for LWJGL. LWJGL requires files to run it's code natively on your operating system, so we'll add them in during configuration.

1. Click "New…" on right
2. Name this library "LWJGL", or similar
3. Click "Add External Libraries…" on right
4. Navigate to the "lib" folder in your downloaded lwjgl folder
5. Select "lwjgl.jar" and "lwjgl_util.jar"
6. Expand your "LWJGL" library, then the "lwjgl.jar" jar file
7. Add the folder that corresponds to your operating system in the "native" folder of your downloaded LWJGL folder to the "Native library location"
8. (optional) add the Javadocs:

> * lwjgl.jar - [http://lwjgl.org/javadoc/](http://lwjgl.org/javadoc/)
> * lwjgl_util.jar - [http://lwjgl.org/javadoc/](http://lwjgl.org/javadoc/)

### 5. Add and configure Slick library

Now we will create a user library for Slick.

1. Repeat this process in a new user library, "Slick" with the "slick.jar" and "slick-util.jar" files (no need to deal with native libraries)
2. (optional) add the javadocs:

> * slick.jar - [http://slick.cokeandcode.com/javadoc/](http://slick.cokeandcode.com/javadoc/)
> * slick-util.jar - [http://slick.cokeandcode.com/javadoc-util/](http://slick.cokeandcode.com/javadoc-util/)

*Note: You can set up a library just including "slick-util.jar", if you want to use Slick's texture loaders, font drawers, and other useful tools.*


### 6. Add new libraries to current project's build path

1. Click "Ok" to close the user library preferences window
2. Select both new libraries ("LWJGL" and "Slick") and click finish

> * They should both appear in your "Java Build Path" window in the "Libraries" tab, as well as in your project folder in the "Package Explorer" view.

*Note: If you want to add these libraries in another project, you don't need to re-add the two libraries: just check them off when you first reach the "Add Library" window,*