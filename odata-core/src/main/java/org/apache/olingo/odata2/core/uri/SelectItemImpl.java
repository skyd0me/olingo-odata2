/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.olingo.odata2.core.uri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.olingo.odata2.api.edm.EdmProperty;
import org.apache.olingo.odata2.api.uri.NavigationPropertySegment;
import org.apache.olingo.odata2.api.uri.SelectItem;

/**
 *  
 */
public class SelectItemImpl implements SelectItem {

  private List<NavigationPropertySegment> navigationPropertySegments = Collections.emptyList();
  private EdmProperty property;
  private boolean star;

  @Override
  public boolean isStar() {
    return star;
  }

  public void setStar(final boolean star) {
    this.star = star;
  }

  @Override
  public EdmProperty getProperty() {
    return property;
  }

  public void setProperty(final EdmProperty property) {
    this.property = property;
  }

  public void addNavigationPropertySegment(final NavigationPropertySegment segment) {
    if (navigationPropertySegments.equals(Collections.EMPTY_LIST)) {
      navigationPropertySegments = new ArrayList<NavigationPropertySegment>();
    }

    navigationPropertySegments.add(segment);
  }

  @Override
  public List<NavigationPropertySegment> getNavigationPropertySegments() {
    return navigationPropertySegments;
  }

}
