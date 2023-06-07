package database.model;

import java.math.*;

public class ProcessorModel {
    private int processorId;
    private String processorName;
    private int cores;
    private BigDecimal clockSpeed;

    public ProcessorModel(int processorId, String processorName, int cores, BigDecimal clockSpeed) {
        this.processorId = processorId;
        this.processorName = processorName;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public int getProcessorId() {
        return processorId;
    }

    public void setProcessorId(int processorId) {
        this.processorId = processorId;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public BigDecimal getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(BigDecimal clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}
