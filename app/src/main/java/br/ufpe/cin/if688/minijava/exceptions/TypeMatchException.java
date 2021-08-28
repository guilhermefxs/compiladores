package br.ufpe.cin.if688.minijava.exceptions;

public class TypeMatchException extends RuntimeException {
    public TypeMatchException(String expected, String actual) {
        super("Couldn't match expected type '" + expected + "' with actual type '" + actual + "'");
    }
}
