/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.editor.orion.client.jso;

/** This event is sent when the editor's contents have been changed */
public class OrionInputChangedEventOverlay extends OrionEventOverlay {

  protected OrionInputChangedEventOverlay() {}

  public static String TYPE = "InputChanged";

  /**
   * Title the editor title for now not used in our app, not tested well so don't depend your logic
   * on this
   */
  public final native String getTitle() /*-{
        return this.title;
    }-*/;

  /**
   * An error message for now not used in our app, not tested well so don't depend your logic on
   * this
   */
  public final native String getErrorMessage() /*-{
        return this.message;
    }-*/;

  /** the editor contents */
  public final native String getContents() /*-{
        return this.contents;
    }-*/;

  /**
   * contentsSaved whether the editor contents was saved for now not used in our app, not tested
   * well so don't depend your logic on this
   */
  public final native boolean isContentsSaved() /*-{
        return this.contentsSaved;
    }-*/;
}
