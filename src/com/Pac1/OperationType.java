package com.Pac1;

public class OperationType extends AbstractModel {
    protected Integer operTypeCode;

    public OperationType(Integer operTypeCode) {
        super.type="It's OperationType with code:";
        this.operTypeCode = operTypeCode;
        super.code=operTypeCode;
    }
}
