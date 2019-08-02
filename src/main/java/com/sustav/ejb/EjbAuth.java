package com.sustav.ejb;

import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.inject.Inject;

@Singleton
//@RolesAllowed({"User"})
//@DenyAll
//@PermitAll
//@RunAs("root")
public class EjbAuth {

    @Inject
    private SessionContext sessionContext;

    public String getName() {
        if (sessionContext.isCallerInRole("root")) {
            return "root";
        }

        return "user";
    }
}
