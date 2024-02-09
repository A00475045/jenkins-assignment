package com.smu.mscda;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void convertStringToCapital() {
        assertEquals("Smu",main.convertStringToCapital("smu"));
    }

    @Test
    public void generateMD5HEX() {
        assertEquals("3773300c2f413cc7136f8d74b305519c",main.generateMD5HEX("smu"));
    }
}