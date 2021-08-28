package br.ufpe.cin.if688.minijava.exceptions;

public class MethodOutsideClassException extends RuntimeException {
    public MethodOutsideClassException(String methodName) {
        super("Method '" + methodName + "'can't be declared outside a class!");
    }
}
