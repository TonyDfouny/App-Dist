package com.example.ejb;

import javax.ejb.Stateless;
@Stateless
public class Bean implements Hello {
    public String Hello() {
        return "Hello World";
    }
}
