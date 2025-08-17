package org.example.TemplateMethodDesignPattern;

public class NFSLoader extends BaseGameLoader{
  @Override
  protected void initProfiles() {
    System.out.println("loaing Nfs ");
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
