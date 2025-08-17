package org.example.momentoDesignPattern;

public class MomentoDesignPatternDemo {
  public static void show() {
    EditionHistory history = new EditionHistory();
    history.addHistory("1");
    history.addHistory("2");
    history.addHistory("3");
    history.addHistory("4");
    history.addHistory("5");
    history.addHistory("6");
    history.addHistory("7");
    history.undo();
    history.undo();
    history.undo();
    System.out.println(history);
  }
}
