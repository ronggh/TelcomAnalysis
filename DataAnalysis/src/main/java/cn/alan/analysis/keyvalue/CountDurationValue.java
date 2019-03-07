package cn.alan.analysis.keyvalue;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class CountDurationValue extends BaseValue{
    // 通话次数
    private String callSum;
    // 通话时长合计
    private String callDurationSum;

    public CountDurationValue(){
        super();
    }

    public String getCallSum() {
        return callSum;
    }

    public void setCallSum(String callSum) {
        this.callSum = callSum;
    }

    public String getCallDurationSum() {
        return callDurationSum;
    }

    public void setCallDurationSum(String callDurationSum) {
        this.callDurationSum = callDurationSum;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeUTF(callSum);
        out.writeUTF(callDurationSum);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.callSum = in.readUTF();
        this.callDurationSum = in.readUTF();
    }
}
