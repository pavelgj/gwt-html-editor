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

package com.gc.gwt.wysiwyg.test.client;

import com.gc.gwt.ext.client.SplitPane;
import com.gc.gwt.wysiwyg.client.Editor;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;

public class Test implements EntryPoint {

  private RootPanel getRootPanel() {
    return RootPanel.get("gwtAppContainer");
  }

  public void onModuleLoad() {
    Editor editor = new Editor();
    editor.setWidth("100%");
    editor.setHeight("300px");
    editor.setHTML("<h1>First!</h1>");
    
    getRootPanel().add(editor);
  }
  
  public void _onModuleLoad() {
    SplitPane splitPane = new SplitPane(SplitPane.VERTICAL_SPLIT, 0.3f);
    splitPane.setWidth("100%");
    splitPane.setHeight("100%");

    TabPanel t = new TabPanel();
    t.setWidth("100%");

    // tab 1
    Editor editor1 = new Editor();
    editor1.setWidth("100%");
    editor1.setHeight("300px");
    editor1.setHTML("<h1>First!</h1>");

    // tab 2
    Editor editor2 = new Editor();
    editor2.setWidth("100%");
    editor2.setHeight("300px");
    editor2.setHTML("<h1>Second!</h1>");

    // tab 3
    final Button button = new Button("Show Editor");
    button.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        DialogBox db = new DialogBox(true);
        Editor editor3 = new Editor();
        editor3.setWidth("660px");
        editor3.setHeight("200px");
        editor3.setHTML("<h1>In a Dialog Box!</h1>");

        db.setWidget(editor3);
        db.setText("My Dialog");

        db.show();
        db.setPopupPosition(button.getAbsoluteLeft() + 20, button.getAbsoluteTop() + 20);
      }
    });

    t.add(editor1, "First");
    t.add(editor2, "Second");
    t.add(button, "Third");

    t.selectTab(0);

    splitPane.setFirstWidget(new HTML("Left Pane"));
    splitPane.setSecondWidget(t);

    splitPane.setPadding(5);

    getRootPanel().add(splitPane);
  }
}
