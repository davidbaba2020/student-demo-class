package com.davacom.demo.exception;

public class RecordNotComplete extends RuntimeException {
    public RecordNotComplete(String message) {
        super(message);
    }
}
