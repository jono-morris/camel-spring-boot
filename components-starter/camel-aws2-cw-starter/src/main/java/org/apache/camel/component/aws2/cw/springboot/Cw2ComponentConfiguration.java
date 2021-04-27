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
package org.apache.camel.component.aws2.cw.springboot;

import java.time.Instant;
import javax.annotation.Generated;
import org.apache.camel.component.aws2.cw.Cw2Component;
import org.apache.camel.component.aws2.cw.Cw2Configuration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;
import software.amazon.awssdk.services.cloudwatch.CloudWatchClient;

/**
 * Sending metrics to AWS CloudWatch using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws2-cw")
public class Cw2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-cw component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the AmazonCloudWatch as the client. The option is a
     * software.amazon.awssdk.services.cloudwatch.CloudWatchClient type.
     */
    private CloudWatchClient amazonCwClient;
    /**
     * The component configuration. The option is a
     * org.apache.camel.component.aws2.cw.Cw2Configuration type.
     */
    private Cw2Configuration configuration;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * The metric name
     */
    private String name;
    /**
     * Set the need for overidding the endpoint. This option needs to be used in
     * combination with uriEndpointOverride option
     */
    private Boolean overrideEndpoint = false;
    /**
     * To define a proxy host when instantiating the CW client
     */
    private String proxyHost;
    /**
     * To define a proxy port when instantiating the CW client
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the CW client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * The region in which EKS client needs to work. When using this parameter,
     * the configuration will expect the lowercase name of the region (for
     * example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()
     */
    private String region;
    /**
     * The metric timestamp. The option is a java.time.Instant type.
     */
    private Instant timestamp;
    /**
     * If we want to trust all certificates in case of overriding the endpoint
     */
    private Boolean trustAllCertificates = false;
    /**
     * The metric unit
     */
    private String unit;
    /**
     * Set the overriding uri endpoint. This option needs to be used in
     * combination with overrideEndpoint option
     */
    private String uriEndpointOverride;
    /**
     * Set whether the S3 client should expect to load credentials through a
     * default credentials provider or to expect static credentials to be passed
     * in.
     */
    private Boolean useDefaultCredentialsProvider = false;
    /**
     * The metric value
     */
    private Double value;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;

    public CloudWatchClient getAmazonCwClient() {
        return amazonCwClient;
    }

    public void setAmazonCwClient(CloudWatchClient amazonCwClient) {
        this.amazonCwClient = amazonCwClient;
    }

    public Cw2Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Cw2Configuration configuration) {
        this.configuration = configuration;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOverrideEndpoint() {
        return overrideEndpoint;
    }

    public void setOverrideEndpoint(Boolean overrideEndpoint) {
        this.overrideEndpoint = overrideEndpoint;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getTrustAllCertificates() {
        return trustAllCertificates;
    }

    public void setTrustAllCertificates(Boolean trustAllCertificates) {
        this.trustAllCertificates = trustAllCertificates;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUriEndpointOverride() {
        return uriEndpointOverride;
    }

    public void setUriEndpointOverride(String uriEndpointOverride) {
        this.uriEndpointOverride = uriEndpointOverride;
    }

    public Boolean getUseDefaultCredentialsProvider() {
        return useDefaultCredentialsProvider;
    }

    public void setUseDefaultCredentialsProvider(
            Boolean useDefaultCredentialsProvider) {
        this.useDefaultCredentialsProvider = useDefaultCredentialsProvider;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}