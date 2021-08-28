package br.ufpe.cin.if688.minijava.exceptions;

public class UndefinedMethodException extends RuntimeException {
    public UndefinedMethodException(String methodName, String className) {
        super("Method " + methodName + " not defined in class " + className);
    }
}
