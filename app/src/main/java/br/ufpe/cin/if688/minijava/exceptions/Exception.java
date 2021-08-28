package br.ufpe.cin.if688.minijava.exceptions;

import br.ufpe.cin.if688.minijava.ast.Type;

public class Exception {
    public static void error(Type expected, Type actual) {
        throw new RuntimeException("Couldn't match expected type '" + expected + "' with actual type '" + actual + "'");
    }
}
