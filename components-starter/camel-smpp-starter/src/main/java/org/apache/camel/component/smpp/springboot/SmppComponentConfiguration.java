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
package org.apache.camel.component.smpp.springboot;

import java.util.Map;
import org.apache.camel.component.smpp.SmppComponent;
import org.apache.camel.component.smpp.SmppConfiguration;
import org.apache.camel.component.smpp.SmppSplittingPolicy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.jsmpp.session.SessionStateListener;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send and receive SMS messages using a SMSC (Short Message Service Center).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.smpp")
public class SmppComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the smpp component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Defines the initial delay in milliseconds after the consumer/producer
     * tries to reconnect to the SMSC, after the connection was lost.
     */
    private Long initialReconnectDelay = 5000L;
    /**
     * Defines the maximum number of attempts to reconnect to the SMSC, if SMSC
     * returns a negative bind response
     */
    private Integer maxReconnect = 2147483647;
    /**
     * Defines the interval in milliseconds between the reconnect attempts, if
     * the connection to the SMSC was lost and the previous was not succeed.
     */
    private Long reconnectDelay = 5000L;
    /**
     * You can specify a policy for handling long messages: ALLOW - the default,
     * long messages are split to 140 bytes per message TRUNCATE - long messages
     * are split and only the first fragment will be sent to the SMSC. Some
     * carriers drop subsequent fragments so this reduces load on the SMPP
     * connection sending parts of a message that will never be delivered.
     * REJECT - if a message would need to be split, it is rejected with an SMPP
     * NegativeResponseException and the reason code signifying the message is
     * too long.
     */
    private SmppSplittingPolicy splittingPolicy = SmppSplittingPolicy.ALLOW;
    /**
     * This parameter is used to categorize the type of ESME (External Short
     * Message Entity) that is binding to the SMSC (max. 13 characters).
     */
    private String systemType;
    /**
     * You can specify the address range for the SmppConsumer as defined in
     * section 5.2.7 of the SMPP 3.4 specification. The SmppConsumer will
     * receive messages only from SMSC's which target an address (MSISDN or IP
     * address) within this range.
     */
    private String addressRange;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions (if possible) occurred while the Camel consumer
     * is trying to pickup incoming messages, or the likes, will now be
     * processed as a message and handled by the routing Error Handler.
     * Important: This is only possible if the 3rd party component allows Camel
     * to be alerted if an exception was thrown. Some components handle this
     * internally only, and therefore bridgeErrorHandler is not possible. In
     * other situations we may improve the Camel component to hook into the 3rd
     * party component and make this possible for future releases. By default
     * the consumer will use the org.apache.camel.spi.ExceptionHandler to deal
     * with exceptions, that will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Defines the destination SME address. For mobile terminated messages, this
     * is the directory number of the recipient MS. Only for SubmitSm,
     * SubmitMulti, CancelSm and DataSm.
     */
    private String destAddr = "1717";
    /**
     * Defines the type of number (TON) to be used in the SME destination
     * address parameters. Only for SubmitSm, SubmitMulti, CancelSm and DataSm.
     * The following NPI values are defined: 0: Unknown 1: ISDN (E163/E164) 2:
     * Data (X.121) 3: Telex (F.69) 6: Land Mobile (E.212) 8: National 9:
     * Private 10: ERMES 13: Internet (IP) 18: WAP Client Id (to be defined by
     * WAP Forum)
     */
    private Byte destAddrNpi;
    /**
     * Defines the type of number (TON) to be used in the SME destination
     * address parameters. Only for SubmitSm, SubmitMulti, CancelSm and DataSm.
     * The following TON values are defined: 0: Unknown 1: International 2:
     * National 3: Network Specific 4: Subscriber Number 5: Alphanumeric 6:
     * Abbreviated
     */
    private Byte destAddrTon;
    /**
     * Sessions can be lazily created to avoid exceptions, if the SMSC is not
     * available when the Camel producer is started. Camel will check the in
     * message headers 'CamelSmppSystemId' and 'CamelSmppPassword' of the first
     * exchange. If they are present, Camel will use these data to connect to
     * the SMSC.
     */
    private Boolean lazySessionCreation = false;
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
     * Set this on producer in order to benefit from transceiver (TRX) binding
     * type. So once set, you don't need to define an 'SMTPP consumer' endpoint
     * anymore. You would set this to a 'Direct consumer' endpoint instead.
     * DISCALIMER: This feature is only tested with 'Direct consumer' endpoint.
     * The behavior with any other consumer type is unknown and not tested.
     */
    private String messageReceiverRouteId;
    /**
     * Defines the numeric plan indicator (NPI) to be used in the SME. The
     * following NPI values are defined: 0: Unknown 1: ISDN (E163/E164) 2: Data
     * (X.121) 3: Telex (F.69) 6: Land Mobile (E.212) 8: National 9: Private 10:
     * ERMES 13: Internet (IP) 18: WAP Client Id (to be defined by WAP Forum)
     */
    private Byte numberingPlanIndicator;
    /**
     * Allows the originating SME to assign a priority level to the short
     * message. Only for SubmitSm and SubmitMulti. Four Priority Levels are
     * supported: 0: Level 0 (lowest) priority 1: Level 1 priority 2: Level 2
     * priority 3: Level 3 (highest) priority
     */
    private Byte priorityFlag;
    /**
     * The protocol id
     */
    private Byte protocolId;
    /**
     * Is used to request an SMSC delivery receipt and/or SME originated
     * acknowledgements. The following values are defined: 0: No SMSC delivery
     * receipt requested. 1: SMSC delivery receipt requested where final
     * delivery outcome is success or failure. 2: SMSC delivery receipt
     * requested where the final delivery outcome is delivery failure.
     */
    private Byte registeredDelivery;
    /**
     * Used to request the SMSC to replace a previously submitted message, that
     * is still pending delivery. The SMSC will replace an existing message
     * provided that the source address, destination address and service type
     * match the same fields in the new message. The following replace if
     * present flag values are defined: 0: Don't replace 1: Replace
     */
    private Byte replaceIfPresentFlag;
    /**
     * The service type parameter can be used to indicate the SMS Application
     * service associated with the message. The following generic service_types
     * are defined: CMT: Cellular Messaging CPT: Cellular Paging VMN: Voice Mail
     * Notification VMA: Voice Mail Alerting WAP: Wireless Application Protocol
     * USSD: Unstructured Supplementary Services Data
     */
    private String serviceType;
    /**
     * Defines the address of SME (Short Message Entity) which originated this
     * message.
     */
    private String sourceAddr = "1616";
    /**
     * Defines the numeric plan indicator (NPI) to be used in the SME originator
     * address parameters. The following NPI values are defined: 0: Unknown 1:
     * ISDN (E163/E164) 2: Data (X.121) 3: Telex (F.69) 6: Land Mobile (E.212)
     * 8: National 9: Private 10: ERMES 13: Internet (IP) 18: WAP Client Id (to
     * be defined by WAP Forum)
     */
    private Byte sourceAddrNpi;
    /**
     * Defines the type of number (TON) to be used in the SME originator address
     * parameters. The following TON values are defined: 0: Unknown 1:
     * International 2: National 3: Network Specific 4: Subscriber Number 5:
     * Alphanumeric 6: Abbreviated
     */
    private Byte sourceAddrTon;
    /**
     * Defines the type of number (TON) to be used in the SME. The following TON
     * values are defined: 0: Unknown 1: International 2: National 3: Network
     * Specific 4: Subscriber Number 5: Alphanumeric 6: Abbreviated
     */
    private Byte typeOfNumber;
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
     * To use the shared SmppConfiguration as configuration. The option is a
     * org.apache.camel.component.smpp.SmppConfiguration type.
     */
    private SmppConfiguration configuration;
    /**
     * Defines the interval in milliseconds between the confidence checks. The
     * confidence check is used to test the communication path between an ESME
     * and an SMSC.
     */
    private Integer enquireLinkTimer = 60000;
    /**
     * Defines the interface version to be used in the binding request with the
     * SMSC. The following values are allowed, as defined in the SMPP protocol
     * (and the underlying implementation using the jSMPP library,
     * respectively): legacy (0x00), 3.3 (0x33), 3.4 (0x34), and 5.0 (0x50). The
     * default (fallback) value is version 3.4.
     */
    private String interfaceVersion = "3.4";
    /**
     * Sets the number of threads which can read PDU and process them in
     * parallel.
     */
    private Integer pduProcessorDegree = 3;
    /**
     * Sets the capacity of the working queue for PDU processing.
     */
    private Integer pduProcessorQueueCapacity = 100;
    /**
     * You can refer to a org.jsmpp.session.SessionStateListener in the Registry
     * to receive callbacks when the session state changed. The option is a
     * org.jsmpp.session.SessionStateListener type.
     */
    private SessionStateListener sessionStateListener;
    /**
     * When true, the SMSC delivery receipt would be requested only for the last
     * segment of a multi-segment (long) message. For short messages, with only
     * 1 segment the behaviour is unchanged.
     */
    private Boolean singleDLR = false;
    /**
     * Defines the maximum period of inactivity allowed after a transaction,
     * after which an SMPP entity may assume that the session is no longer
     * active. This timer may be active on either communicating SMPP entity
     * (i.e. SMSC or ESME).
     */
    private Integer transactionTimer = 10000;
    /**
     * Defines encoding of data according the SMPP 3.4 specification, section
     * 5.2.19. 0: SMSC Default Alphabet 4: 8 bit Alphabet 8: UCS2 Alphabet
     */
    private Byte alphabet;
    /**
     * Defines the data coding according the SMPP 3.4 specification, section
     * 5.2.19. Example data encodings are: 0: SMSC Default Alphabet 3: Latin 1
     * (ISO-8859-1) 4: Octet unspecified (8-bit binary) 8: UCS2 (ISO/IEC-10646)
     * 13: Extended Kanji JIS(X 0212-1990)
     */
    private Byte dataCoding;
    /**
     * Defines the encoding scheme of the short message user data. Only for
     * SubmitSm, ReplaceSm and SubmitMulti.
     */
    private String encoding = "ISO-8859-1";
    /**
     * If you need to tunnel SMPP through a HTTP proxy, set this attribute to
     * the hostname or ip address of your HTTP proxy.
     */
    private String httpProxyHost;
    /**
     * If your HTTP proxy requires basic authentication, set this attribute to
     * the password required for your HTTP proxy.
     */
    private String httpProxyPassword;
    /**
     * If you need to tunnel SMPP through a HTTP proxy, set this attribute to
     * the port of your HTTP proxy.
     */
    private Integer httpProxyPort = 3128;
    /**
     * If your HTTP proxy requires basic authentication, set this attribute to
     * the username required for your HTTP proxy.
     */
    private String httpProxyUsername;
    /**
     * These headers will be passed to the proxy server while establishing the
     * connection.
     */
    private Map<String, String> proxyHeaders;
    /**
     * The password for connecting to SMSC server.
     */
    private String password;
    /**
     * The system id (username) for connecting to SMSC server.
     */
    private String systemId = "smppclient";
    /**
     * Whether using SSL with the smpps protocol
     */
    private Boolean usingSSL = false;

    public Long getInitialReconnectDelay() {
        return initialReconnectDelay;
    }

    public void setInitialReconnectDelay(Long initialReconnectDelay) {
        this.initialReconnectDelay = initialReconnectDelay;
    }

    public Integer getMaxReconnect() {
        return maxReconnect;
    }

    public void setMaxReconnect(Integer maxReconnect) {
        this.maxReconnect = maxReconnect;
    }

    public Long getReconnectDelay() {
        return reconnectDelay;
    }

    public void setReconnectDelay(Long reconnectDelay) {
        this.reconnectDelay = reconnectDelay;
    }

    public SmppSplittingPolicy getSplittingPolicy() {
        return splittingPolicy;
    }

    public void setSplittingPolicy(SmppSplittingPolicy splittingPolicy) {
        this.splittingPolicy = splittingPolicy;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getAddressRange() {
        return addressRange;
    }

    public void setAddressRange(String addressRange) {
        this.addressRange = addressRange;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getDestAddr() {
        return destAddr;
    }

    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }

    public Byte getDestAddrNpi() {
        return destAddrNpi;
    }

    public void setDestAddrNpi(Byte destAddrNpi) {
        this.destAddrNpi = destAddrNpi;
    }

    public Byte getDestAddrTon() {
        return destAddrTon;
    }

    public void setDestAddrTon(Byte destAddrTon) {
        this.destAddrTon = destAddrTon;
    }

    public Boolean getLazySessionCreation() {
        return lazySessionCreation;
    }

    public void setLazySessionCreation(Boolean lazySessionCreation) {
        this.lazySessionCreation = lazySessionCreation;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getMessageReceiverRouteId() {
        return messageReceiverRouteId;
    }

    public void setMessageReceiverRouteId(String messageReceiverRouteId) {
        this.messageReceiverRouteId = messageReceiverRouteId;
    }

    public Byte getNumberingPlanIndicator() {
        return numberingPlanIndicator;
    }

    public void setNumberingPlanIndicator(Byte numberingPlanIndicator) {
        this.numberingPlanIndicator = numberingPlanIndicator;
    }

    public Byte getPriorityFlag() {
        return priorityFlag;
    }

    public void setPriorityFlag(Byte priorityFlag) {
        this.priorityFlag = priorityFlag;
    }

    public Byte getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Byte protocolId) {
        this.protocolId = protocolId;
    }

    public Byte getRegisteredDelivery() {
        return registeredDelivery;
    }

    public void setRegisteredDelivery(Byte registeredDelivery) {
        this.registeredDelivery = registeredDelivery;
    }

    public Byte getReplaceIfPresentFlag() {
        return replaceIfPresentFlag;
    }

    public void setReplaceIfPresentFlag(Byte replaceIfPresentFlag) {
        this.replaceIfPresentFlag = replaceIfPresentFlag;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getSourceAddr() {
        return sourceAddr;
    }

    public void setSourceAddr(String sourceAddr) {
        this.sourceAddr = sourceAddr;
    }

    public Byte getSourceAddrNpi() {
        return sourceAddrNpi;
    }

    public void setSourceAddrNpi(Byte sourceAddrNpi) {
        this.sourceAddrNpi = sourceAddrNpi;
    }

    public Byte getSourceAddrTon() {
        return sourceAddrTon;
    }

    public void setSourceAddrTon(Byte sourceAddrTon) {
        this.sourceAddrTon = sourceAddrTon;
    }

    public Byte getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(Byte typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public SmppConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(SmppConfiguration configuration) {
        this.configuration = configuration;
    }

    public Integer getEnquireLinkTimer() {
        return enquireLinkTimer;
    }

    public void setEnquireLinkTimer(Integer enquireLinkTimer) {
        this.enquireLinkTimer = enquireLinkTimer;
    }

    public String getInterfaceVersion() {
        return interfaceVersion;
    }

    public void setInterfaceVersion(String interfaceVersion) {
        this.interfaceVersion = interfaceVersion;
    }

    public Integer getPduProcessorDegree() {
        return pduProcessorDegree;
    }

    public void setPduProcessorDegree(Integer pduProcessorDegree) {
        this.pduProcessorDegree = pduProcessorDegree;
    }

    public Integer getPduProcessorQueueCapacity() {
        return pduProcessorQueueCapacity;
    }

    public void setPduProcessorQueueCapacity(Integer pduProcessorQueueCapacity) {
        this.pduProcessorQueueCapacity = pduProcessorQueueCapacity;
    }

    public SessionStateListener getSessionStateListener() {
        return sessionStateListener;
    }

    public void setSessionStateListener(
            SessionStateListener sessionStateListener) {
        this.sessionStateListener = sessionStateListener;
    }

    public Boolean getSingleDLR() {
        return singleDLR;
    }

    public void setSingleDLR(Boolean singleDLR) {
        this.singleDLR = singleDLR;
    }

    public Integer getTransactionTimer() {
        return transactionTimer;
    }

    public void setTransactionTimer(Integer transactionTimer) {
        this.transactionTimer = transactionTimer;
    }

    public Byte getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(Byte alphabet) {
        this.alphabet = alphabet;
    }

    public Byte getDataCoding() {
        return dataCoding;
    }

    public void setDataCoding(Byte dataCoding) {
        this.dataCoding = dataCoding;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getHttpProxyHost() {
        return httpProxyHost;
    }

    public void setHttpProxyHost(String httpProxyHost) {
        this.httpProxyHost = httpProxyHost;
    }

    public String getHttpProxyPassword() {
        return httpProxyPassword;
    }

    public void setHttpProxyPassword(String httpProxyPassword) {
        this.httpProxyPassword = httpProxyPassword;
    }

    public Integer getHttpProxyPort() {
        return httpProxyPort;
    }

    public void setHttpProxyPort(Integer httpProxyPort) {
        this.httpProxyPort = httpProxyPort;
    }

    public String getHttpProxyUsername() {
        return httpProxyUsername;
    }

    public void setHttpProxyUsername(String httpProxyUsername) {
        this.httpProxyUsername = httpProxyUsername;
    }

    public Map<String, String> getProxyHeaders() {
        return proxyHeaders;
    }

    public void setProxyHeaders(Map<String, String> proxyHeaders) {
        this.proxyHeaders = proxyHeaders;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public Boolean getUsingSSL() {
        return usingSSL;
    }

    public void setUsingSSL(Boolean usingSSL) {
        this.usingSSL = usingSSL;
    }
}