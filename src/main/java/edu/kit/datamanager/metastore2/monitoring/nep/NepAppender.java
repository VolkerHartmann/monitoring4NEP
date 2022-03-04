/*
 * Copyright 2021 Karlsruhe Institute of Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.kit.datamanager.metastore2.monitoring.nep;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import edu.kit.datamanager.metastore.monitoring.nep.json.VirtualAccessCreate;

/**
 * Appender logging access to NEP service.
 *
 */
public class NepAppender extends AppenderBase<ILoggingEvent> {
  /** URL for accessing monitoring service. */
  private String nepServiceUrl;
  /** Service ID of the service sending the log. */
  private String virtualServiceId;
  

  @Override
  protected void append(ILoggingEvent e) {
    if (nepServiceUrl == null || "".equals(nepServiceUrl)) {
      addError("nepServiceUrl is not set for NepAppender.");
      return;
    }
    VirtualAccessCreate vac = new VirtualAccessCreate();
    vac.setVirtualAccessId(virtualServiceId);
    
    System.out.println("NEP Appender: " + nepServiceUrl);
    System.out.println("VirtualServiceCreate: " + vac);
    System.out.println("Message: " + e.getMessage());
    System.out.println("Event: " + e);
    for (Object arg : e.getArgumentArray()) {
      System.out.println("Other: " + arg);
    }
  }

  /**
   * Gets the service URL for NEP.
   *
   * @return the nepServiceUrl
   */
  public String getNepServiceUrl() {
    return nepServiceUrl;
  }

  /**
   * Sets the service URL for NEP.
   *
   * @param nepServiceUrl the nepServiceUrl to set
   */
  public void setNepServiceUrl(String nepServiceUrl) {
    this.nepServiceUrl = nepServiceUrl;
  }

  /**
   * Gets the virtual servide ID. 
   * 
   * @return the virtualServiceId
   */
  public String getVirtualServiceId() {
    return virtualServiceId;
  }

  /**
   * Sets the virtual service ID.
   * 
   * @param virtualServiceId the virtualServiceId to set
   */
  public void setVirtualServiceId(String virtualServiceId) {
    this.virtualServiceId = virtualServiceId;
  }

}
