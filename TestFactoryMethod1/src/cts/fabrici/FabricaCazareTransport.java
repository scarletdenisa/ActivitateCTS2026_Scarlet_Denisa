package cts.fabrici;

import cts.calse.PachetCazareTransport;
import cts.calse.PachetTuristic;

public class FabricaCazareTransport implements FabricaPachetTuristic{
    @Override
    public PachetTuristic getPachetTuristic() {
        return new PachetCazareTransport();
    }
}
