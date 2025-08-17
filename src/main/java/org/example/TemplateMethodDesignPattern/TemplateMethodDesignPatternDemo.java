package org.example.TemplateMethodDesignPattern;

public class TemplateMethodDesignPatternDemo {
  public static void show() {
    BaseGameLoader gta = new GTALoader();
    gta.load();
    BaseGameLoader nfs  =  new NFSLoader();
    nfs.load();

  }
}
