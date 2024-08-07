package ObserverPatternExamples;

public class NewsPublisher implements Subject {

    public Observer[] registerObservers = new Observer[100];
    @Override
    public void AddObserver(Observer newObserver) {

    }

    @Override
    public void DeleteObserver(Observer toBeRemoved) {

    }


    @Override
    public void NotifyObservers() {

    }
}
