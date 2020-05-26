package setcov.isula.sample;

import isula.aco.ConfigurationProvider;

public class SetCoveringConfigurationProvider implements ConfigurationProvider {

    public int getNumberOfAnts() {
//        return 150;
        return 10;

    }

    public double getEvaporationRatio() {
        return 0.2;
    }

    public int getNumberOfIterations() {
        return 5;
    }

    public double getInitialPheromoneValue() {
        return this.getBasePheromoneValue();
    }

    public double getHeuristicImportance() {
        return 1.5;
    }

    public double getPheromoneImportance() {
        return 4;
    }

    public double getBasePheromoneValue() {
        return 90.0;
    }
}
