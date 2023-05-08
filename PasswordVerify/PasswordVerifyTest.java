package PasswordVerify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @Test
    void testVacio() {
        assertEquals(false, PasswordVerify.validaContra(""));
    }

    @Test
    void testHola() {
        assertEquals(false, PasswordVerify.validaContra("hola"));
    }

    @Test
    void testHolaCaracola() {
        assertEquals(false, PasswordVerify.validaContra("holacaracola"));
    }

    @Test
    void testHola12() {
        assertEquals(false, PasswordVerify.validaContra("hola12"));
    }

    @Test
    void testHolA() {
        assertEquals(false, PasswordVerify.validaContra("holA"));
    }

    @Test
    void testHolaExclamacion() {
        assertEquals(false, PasswordVerify.validaContra("hola!"));
    }

    @Test
    void testHolaA() {
        assertEquals(false, PasswordVerify.validaContra("holaA!"));
    }

    @Test
    void testHola12Exc() {
        assertEquals(false, PasswordVerify.validaContra("hola12!"));
    }

    @Test
    void testHola12A() {
        assertEquals(false, PasswordVerify.validaContra("hola12A"));
    }

    @Test
    void testHolaCaracola12() {
        assertEquals(false, PasswordVerify.validaContra("holacaracola12"));
    }

    @Test
    void testHolaCaracolaExc() {
        assertEquals(false, PasswordVerify.validaContra("holacaracola!"));
    }

    @Test
    void testHolaCaracolA() {
        assertEquals(false, PasswordVerify.validaContra("holacaracolA"));
    }

    @Test
    void testHo12AExc() {
        assertEquals(false, PasswordVerify.validaContra("ho12A!"));
    }

    @Test
    void testHolaCaracolaAExc() {
        assertEquals(false, PasswordVerify.validaContra("holacaracolaA!"));
    }

    @Test
    void testHolaCaracola12Exc() {
        assertEquals(false, PasswordVerify.validaContra("holacaracola12!"));
    }

    @Test
    void testHolaCaracola12A() {
        assertEquals(false, PasswordVerify.validaContra("holacaracola12A"));
    }

    @Test
    void testHolaCaracola12AExc() {
        assertEquals(true, PasswordVerify.validaContra("holacaracola12A!"));
    }

    @Test
    void testPablitoClavito() {
        assertEquals(true, PasswordVerify.validaContra("#P4blit0cl4v0uncl4vit0#"));
    }
}