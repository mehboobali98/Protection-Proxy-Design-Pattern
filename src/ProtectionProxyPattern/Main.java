package ProtectionProxyPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1 = new Employee("Mehboob", "Admin");
        Employee e2 = new Employee("Omer", "MD");

        ProxyAccessPrivateDetails papd = new ProxyDetails();

        papd.grantAccess(e1);

        papd.grantAccess(e2);
    }
}
