package ProtectionProxyPattern;

import java.security.cert.PolicyNode;

public interface ProxyAccessPrivateDetails {
    void grantAccess(Employee e);
}

class RealDetails implements ProxyAccessPrivateDetails {

    public void grantAccess(Employee e)
    {
        System.out.println("Welcome to the chamber of secrets " +
                "" +
                "" + e.name);
    }

}
class ProxyDetails implements ProxyAccessPrivateDetails{
    RealDetails rd;

    public void grantAccess(Employee e)
    {
        if(e.role.equalsIgnoreCase("Admin"))
        {
            rd = new RealDetails();
            rd.grantAccess(e);
        } else {
            System.out.println("You can't access it.");
        }

    }
}
