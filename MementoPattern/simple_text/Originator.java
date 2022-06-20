package simple_text;

public class Originator {
    
    private String state;

    public void setState(String state){
              this.state=state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
          return new Memento(state);
    }

    public void getStateFromMemento(Memento m){
        state=m.getState();

    }


}
