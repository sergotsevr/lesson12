package com.Pac1;

public class OperationStage extends AbstractModel {
    Integer operStageCode;

    public OperationStage(Integer operStageCode) {
        super.type = "It's OperationStage with code:";
        this.operStageCode = operStageCode;
        super.code=operStageCode;
    }
}
