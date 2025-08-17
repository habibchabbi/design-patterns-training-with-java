package org.example.momentoDesignPattern;

public class TextArea {
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Momento takeSnapshot() {
    return new Momento(text);
  }

  public void restore(Momento snapshot) {
    this.text = snapshot.getText();
  }


  public static class Momento {
    private final String text;

    public Momento(String text) {
      this.text = text;
    }

    public String getText() {
      return text;
    }
  }
}
