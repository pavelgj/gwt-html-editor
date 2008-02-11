package com.gc.gwt.wysiwyg.client.fck;

public class FCKEditorConfig {

  private String width = "100%";
  private String height = "300px";
  private String toolbarSet = "Default";
  private String basePath = "fckeditor/";
  private String customConfigurationsPath = "";

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getToolbarSet() {
    return toolbarSet;
  }

  public void setToolbarSet(String toolbarSet) {
    this.toolbarSet = toolbarSet;
  }
  
  public String getBasePath() {
    return basePath;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getCustomConfigurationsPath() {
    return customConfigurationsPath;
  }

  public void setCustomConfigurationsPath(String customConfigurationsPath) {
    this.customConfigurationsPath = customConfigurationsPath;
  }
}
