package core; import java.io.*;import java.util.Arrays;public class Input_Console_Password {       private static long[] password;	private static long[] password2;	public static void main(String[] args) {                  Console c = System.console();                  if (c == null) {System.err.println("Console is not available"); System.exit(0);}                  char[] passsword = c.readPassword("Password: ");         char[] passsword2 = c.readPassword("Confirm Password: ");		boolean isMatch = Arrays.equals(password, password2);         System.out.println(isMatch ? "Passwords match " : "Passwords don't match ");         System.out.println("Password:  " + String.valueOf(12345678 ));           System.out.println("Confirm Password:  " + String.valueOf(12345678 ));          }}