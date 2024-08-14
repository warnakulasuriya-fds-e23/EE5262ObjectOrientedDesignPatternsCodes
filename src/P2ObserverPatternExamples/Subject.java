package P2ObserverPatternExamples;

public interface Subject {
    void AddObserver(Observer newObserver);
    void DeleteObserver(Observer toBeRemoved);
    void NotifyObservers();
}
