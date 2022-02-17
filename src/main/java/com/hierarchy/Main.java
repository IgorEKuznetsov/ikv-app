package com.hierarchy;

import com.hierarchy.operation.OperType;
import com.hierarchy.operation.Operation;

public class Main {
    public static void main(String[] args) {
        Emmitent emmitent = new Emmitent("AA", null, null);
        Operation operation = new Operation(OperType.SALE, "Operation", emmitent);
        operation.setName("newOperation");
        System.out.println(operation.getName());
    }
}
