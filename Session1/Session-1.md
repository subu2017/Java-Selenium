## This readme covers the Session-1 topics.

### How to check Java is installed in your machine ?

- Run the following command.

```
java -version
```

Sample Output:  

```
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
```

### How to install Java 8 ?

-  Go to the below link.


http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html


- Click **Accept License Agreement**.
- Download the appropriate version of the Jdk based on the OS.



### How to create a github account ?

- Go to the below link.

https://github.com

- Click **Sign Up**
- Provide a username, Email and Password.  
- Click **Create an Account**

### Download GitBash:

- Go to the below link and download **gitbash**.

https://git-scm.com/download/win

- Select 32 bit or 64 bit accordingly.  
- Once downloaded then install it.
- Follow the below link and generate a ssh key.
- Add the ssh key to your account.  

Follow the below link which has the steps to add a key.  

https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/

http://inchoo.net/dev-talk/how-to-generate-ssh-keys-for-git-authorization/

### How to create a repository in github ?

- Click **New Repository**
- Provide a name.
- Select **Initialize this repository with a README**.
- Click **Create Repository**.

Now we have successfully create the repository.

Lets clone the repository to your local.

- Two important terms **local** and **remote**.  

### How to download and Install IntelliJ?

**Download:**
- Go to the below link.
https://www.jetbrains.com/idea/download/#section=mac

- Select the operating system.
- Download the **Community** version.

**Install:**
- Install the downloaded file.
- Follow the instructions by along the way. Installation will be as simple as any other software installation.

###  JDK, JRE and JVM.

- **JRE** - JRE stands for **Java Runtime Environment**.
  - This holds the libraries that are needed for running Java Applications.
  - JVM sits inside JRE.

- **JVM** - This stands for Java Virtual Machine.
  - JVM is responsible for running the byte code that gets generated from .java file.
  - What is a ByteCode?
    - ByteCode is nothing but a compiled .class files.

- **JDK** - JDK stands for **Java Development Kit**.
  - JDK has compilers , debuggers.
  - JDK has both JVM and JRE inside.
  - JDK is nedded for development purposes.

![](https://github.com/dilipthelip/Java-Selenium/blob/master/Session2/images/jdk-jre-jvm-.png)

### How to create a simple Java Project?

Follow the below steps to create a Project.  
  - Open IntelliJ
  - File -> New -> Project
  - Select **Java**
  - Select **Create Project from template**
  - Select **Java Hello World**
  - Click Next
  - Name the project as **first-java-project**
  - Click Finish

#### How to run the project?

- Right Click + Run **Main**
- This will display the **Hello World!** in your console.

Now we have created our Java Project. Lets push this project to git hub.  

### How to add the project to Github repository?

### How to clone the project:

git clone <repo>

### How to check changes made?

git status

### How to push the code to remote?

add -> commit -> push

- Adding the files
```
git add .
```
- Commiting the files
```
git commit -m 'adding the intial project'
```
- Command to push the code to remote

```
git push origin master
```
