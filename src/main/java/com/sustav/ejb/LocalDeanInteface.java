package com.sustav.ejb;

import javax.ejb.Local;

//@Remote
@Local
public interface LocalDeanInteface {
    String getName();
}
