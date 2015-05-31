package runningWithJava;
/**
 * 
 * @author george
 * You can pass argumets to your application with eclipse in Run Configuration\Arguments tab
 * the args must be delimited by space or wraped in quotes also can be done in cmd after calling 
 * the java "packageName"."ClassName" then passing the arg1 arg2 arg3 arg4 the output should look like this:
 * Number of args: 4
 * arg1
 * arg2
 * arg3
 * arg4
 */
public class ArgsPassing {
	public static void main(String[] args) {
		System.out.println("Number of args: " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
