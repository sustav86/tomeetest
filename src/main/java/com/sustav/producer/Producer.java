package com.sustav.producer;

import javax.enterprise.inject.Produces;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */

public class Producer {
    @Produces
    private String string = "HI!";
    @Produces
    private int i = 45;
    @Produces
    private double getDouble() {
        return 1.1 + 6.7;
    }
}
