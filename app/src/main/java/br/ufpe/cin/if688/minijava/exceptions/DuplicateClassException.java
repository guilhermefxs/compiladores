package br.ufpe.cin.if688.minijava.exceptions;

public class DuplicateClassException extends RuntimeException {
    public DuplicateClassException(String className) {
        super("The class '" + className + "' was already declared!");
    }
}
