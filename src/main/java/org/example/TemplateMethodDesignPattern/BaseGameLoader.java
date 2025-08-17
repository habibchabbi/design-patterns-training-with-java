package org.example.TemplateMethodDesignPattern;

public abstract class BaseGameLoader {
  public void load() {
    byte[] data = loadData();
    createObjects();
    downloadFiles();
    cleanFiles();
    initProfiles();
  }

  protected abstract void initProfiles();
  protected abstract void cleanFiles();
  protected abstract void downloadFiles();
  protected abstract void createObjects();
  abstract byte[] loadData();
}
