package org.example.momentoDesignPattern;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class EditionHistory {
  private Deque<TextArea.Momento> history;
  private TextArea textArea;
  public EditionHistory() {
  this.history = new LinkedList<>();
  this.textArea = new TextArea();
  }
  public void addHistory(String text) {
    textArea.setText( text);
    history.add(textArea.takeSnapshot());

  }

  public void undo() {
    System.out.println(history.toArray().length);
    textArea.restore(history.pop());
    System.out.println(history.toArray().length);
  }
}
