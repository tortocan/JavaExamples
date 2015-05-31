package runningWithJava;
/** 
 * 
 * @author george
 * Running your code from Command Line Promt.
 * 
 *If you try to run the class from command line because you have an package created an 
 *its not the default one witch is not recommended by eclipse all cmd should include the
 *package name.
 *
 *First of all you need to be in the "root/src" directory of your project:
 *"C:\Users\"UserName"\workspace\"ProjectName"\src"
 *
 *In case that you implemented in your project an Git repository your default path
 *to the project will be:
 *"C:\Users\"UserName"\git\"ProjectName"\src"
 *
 *Example:javac "PackageName"\"ClassName".java for complying your code.
 *Example:java "PackageName"."ClassName" for running your code now you if all works
 *fine you should get an response from your code in this case the response is an output print of 
 *Hello from commandline!
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("Hello from command line!");
	}

}
