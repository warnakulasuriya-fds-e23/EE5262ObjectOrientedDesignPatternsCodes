package StrategyPatternExamples;

public class Person {
    String Name = null;
    TalkingBehaviours Talk = null;
    public Person(String name){
        this.Name = name;
    }
    public void StartTalking(String mode){
        if(mode == "Fast"){
            this.Talk = new SlowTalking();
        }else if(mode == "Slow"){
            this.Talk = new FastTalking();
        }

        if(this.Talk != null){
            this.Talk.talk();
        }
    }
}
