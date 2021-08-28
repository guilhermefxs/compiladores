package br.ufpe.cin.if688.minijava.exceptions;

public class UndefinedClassException extends RuntimeException {
    public UndefinedClassException(String className) {
        super("Class '" + className + "' not defined");
    }
}
