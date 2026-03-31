package cts.fabrici;

import cts.calse.PachetCazare;
import cts.calse.PachetTuristic;

public class FabricaPachetCazare implements FabricaPachetTuristic{
    @Override
    public PachetTuristic getPachetTuristic() {
        return new PachetCazare();
    }
}
