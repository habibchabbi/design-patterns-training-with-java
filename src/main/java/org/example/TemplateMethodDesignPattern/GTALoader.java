package org.example.TemplateMethodDesignPattern;

public class GTALoader extends BaseGameLoader{
  @Override
  protected void initProfiles() {
    System.out.println("Loading GTALoader");
  }

  @Override
  protected void cleanFiles() {

  }

  @Override
  protected void downloadFiles() {

  }

  @Override
  protected void createObjects() {

  }

  @Override
  byte[] loadData() {
    return new byte[0];
  }
}
