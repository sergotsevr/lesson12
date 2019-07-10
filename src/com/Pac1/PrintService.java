package com.Pac1;

public interface PrintService {
    default void printType(AbstractModel model)
    {
        System.out.println(model.type+model.code);
    }
}
