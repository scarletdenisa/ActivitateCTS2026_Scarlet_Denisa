package cts.fabrici;

import cts.calse.PachetAllInclusive;
import cts.calse.PachetTuristic;

public class FabricaAllInclusive implements FabricaPachetTuristic {
    @Override
    public PachetTuristic getPachetTuristic() {
        return new PachetAllInclusive();
    }
}
