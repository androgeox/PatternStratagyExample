package pattern.strategy.example;

//Context
class StrategyClient {
    private Sorting strategy; //link to interface Sorting

    void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
