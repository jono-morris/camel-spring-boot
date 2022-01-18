/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dataformat.bindy.fixed.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Marshal and unmarshal between POJOs and fixed field length format using Camel
 * Bindy
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.bindy-fixed")
public class BindyFixedLengthDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the bindyFixed data format. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * Whether to use Csv, Fixed, or KeyValue.
     */
    private String type;
    /**
     * Name of model class to use.
     */
    private String classType;
    /**
     * To configure a default locale to use, such as us for united states. To
     * use the JVM platform default locale then use the name default
     */
    private String locale;
    /**
     * When unmarshalling should a single instance be unwrapped and returned
     * instead of wrapped in a java.util.List.
     */
    private Boolean unwrapSingleInstance = true;
    /**
     * Whether to allow empty streams in the unmarshal process. If true, no
     * exception will be thrown when a body without records is provided.
     */
    private Boolean allowEmptyStream = false;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Boolean getUnwrapSingleInstance() {
        return unwrapSingleInstance;
    }

    public void setUnwrapSingleInstance(Boolean unwrapSingleInstance) {
        this.unwrapSingleInstance = unwrapSingleInstance;
    }

    public Boolean getAllowEmptyStream() {
        return allowEmptyStream;
    }

    public void setAllowEmptyStream(Boolean allowEmptyStream) {
        this.allowEmptyStream = allowEmptyStream;
    }
}