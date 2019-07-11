package com.Pac1;

import java.util.Optional;

public interface PrintService {
    default void printType(AbstractModel model)
    {
        //System.out.println(model.getClass().toString());
        if(model.getClass().toString().equals("class com.Pac1.OperationStage")){
            System.out.println("It's OperationStage with code:"+model.code);
        }
        if(model.getClass().toString().equals("class com.Pac1.OperationType")){
            System.out.println("It's OperationType with code:"+model.code);
        }
    }

}
