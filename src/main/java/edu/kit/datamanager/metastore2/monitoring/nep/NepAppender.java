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

/**
 * Appender logging access to NEP service.
 *
 */
public class NepAppender extends AppenderBase<ILoggingEvent> {

  private String nepServiceUrl;
  

  @Override
  protected void append(ILoggingEvent e) {
    if (nepServiceUrl == null || "".equals(nepServiceUrl)) {
      addError("nepServiceUrl is not set for NepAppender.");
      return;
    }

    System.out.println("NEP Appender: " + nepServiceUrl);
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

}
