/*
 * Copyright 2006 Pavel Jbanov.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.jpavel.gwt.wysiwyg.client;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditorPromptPanel extends DialogBox {

  private String value;

  private VerticalPanel vp;

  public EditorPromptPanel(String title, EditorPromptPanelWidget pWidget) {

    vp = new VerticalPanel();

    pWidget.setPrompt(this);
    vp.setStyleName("Editor-DialogBox-Content");
    vp.add(pWidget.getWidget());

    this.setWidget(vp);
    this.setText(title);

    this.setStyleName("Editor-DialogBox");
  }

  public void show(Editor editor) {
    this.setPopupPosition(editor.getAbsoluteLeft() + 50, editor.getAbsoluteTop() + 50);
    super.show();
  }

  public void complete(String value) {
    this.value = value;
    this.hide();
  }

  public String getValue() {
    return value;
  }
}