package cts.fabrici;

import cts.calse.PachetTransport;
import cts.calse.PachetTuristic;

public class FabricaPachetTransport implements FabricaPachetTuristic{
    @Override
    public PachetTuristic getPachetTuristic() {
        return new PachetTransport();
    }
}
