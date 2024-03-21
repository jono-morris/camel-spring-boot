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
package org.apache.camel.model.springboot;

import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * Resilience4j Circuit Breaker EIP configuration
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
public class Resilience4jConfigurationDefinitionCommon {

    /**
     * Refers to an existing
     * io.github.resilience4j.circuitbreaker.CircuitBreaker instance to lookup
     * and use from the registry. When using this, then any other circuit
     * breaker options are not in use.
     */
    private String circuitBreaker;
    /**
     * Refers to an existing
     * io.github.resilience4j.circuitbreaker.CircuitBreakerConfig instance to
     * lookup and use from the registry.
     */
    private String config;
    /**
     * Configures the failure rate threshold in percentage. If the failure rate
     * is equal or greater than the threshold the CircuitBreaker transitions to
     * open and starts short-circuiting calls. The threshold must be greater
     * than 0 and not greater than 100. Default value is 50 percentage.
     */
    private Float failureRateThreshold;
    /**
     * Configures the number of permitted calls when the CircuitBreaker is half
     * open. The size must be greater than 0. Default size is 10.
     */
    private Integer permittedNumberOfCallsInHalfOpenState = 10;
    /**
     * Whether to throw
     * io.github.resilience4j.circuitbreaker.CallNotPermittedException when the
     * call is rejected due circuit breaker is half open or open.
     */
    private Boolean throwExceptionWhenHalfOpenOrOpenState = false;
    /**
     * Configures the size of the sliding window which is used to record the
     * outcome of calls when the CircuitBreaker is closed. slidingWindowSize
     * configures the size of the sliding window. Sliding window can either be
     * count-based or time-based. If slidingWindowType is COUNT_BASED, the last
     * slidingWindowSize calls are recorded and aggregated. If slidingWindowType
     * is TIME_BASED, the calls of the last slidingWindowSize seconds are
     * recorded and aggregated. The slidingWindowSize must be greater than 0.
     * The minimumNumberOfCalls must be greater than 0. If the slidingWindowType
     * is COUNT_BASED, the minimumNumberOfCalls cannot be greater than
     * slidingWindowSize . If the slidingWindowType is TIME_BASED, you can pick
     * whatever you want. Default slidingWindowSize is 100.
     */
    private Integer slidingWindowSize = 100;
    /**
     * Configures the type of the sliding window which is used to record the
     * outcome of calls when the CircuitBreaker is closed. Sliding window can
     * either be count-based or time-based. If slidingWindowType is COUNT_BASED,
     * the last slidingWindowSize calls are recorded and aggregated. If
     * slidingWindowType is TIME_BASED, the calls of the last slidingWindowSize
     * seconds are recorded and aggregated. Default slidingWindowType is
     * COUNT_BASED.
     */
    private String slidingWindowType = "COUNT_BASED";
    /**
     * Configures the minimum number of calls which are required (per sliding
     * window period) before the CircuitBreaker can calculate the error rate.
     * For example, if minimumNumberOfCalls is 10, then at least 10 calls must
     * be recorded, before the failure rate can be calculated. If only 9 calls
     * have been recorded the CircuitBreaker will not transition to open even if
     * all 9 calls have failed. Default minimumNumberOfCalls is 100
     */
    private Integer minimumNumberOfCalls = 100;
    /**
     * Enables writable stack traces. When set to false, Exception.getStackTrace
     * returns a zero length array. This may be used to reduce log spam when the
     * circuit breaker is open as the cause of the exceptions is already known
     * (the circuit breaker is short-circuiting calls).
     */
    private Boolean writableStackTraceEnabled = true;
    /**
     * Configures the wait duration (in seconds) which specifies how long the
     * CircuitBreaker should stay open, before it switches to half open. Default
     * value is 60 seconds.
     */
    private Integer waitDurationInOpenState = 60;
    /**
     * Enables automatic transition from OPEN to HALF_OPEN state once the
     * waitDurationInOpenState has passed.
     */
    private Boolean automaticTransitionFromOpenToHalfOpenEnabled = false;
    /**
     * Configures a threshold in percentage. The CircuitBreaker considers a call
     * as slow when the call duration is greater than slowCallDurationThreshold
     * Duration. When the percentage of slow calls is equal or greater the
     * threshold, the CircuitBreaker transitions to open and starts
     * short-circuiting calls. The threshold must be greater than 0 and not
     * greater than 100. Default value is 100 percentage which means that all
     * recorded calls must be slower than slowCallDurationThreshold.
     */
    private Float slowCallRateThreshold;
    /**
     * Configures the duration threshold (seconds) above which calls are
     * considered as slow and increase the slow calls percentage. Default value
     * is 60 seconds.
     */
    private Integer slowCallDurationThreshold = 60;
    /**
     * Whether bulkhead is enabled or not on the circuit breaker. Default is
     * false.
     */
    private Boolean bulkheadEnabled = false;
    /**
     * Configures the max amount of concurrent calls the bulkhead will support.
     */
    private Integer bulkheadMaxConcurrentCalls = 25;
    /**
     * Configures a maximum amount of time which the calling thread will wait to
     * enter the bulkhead. If bulkhead has space available, entry is guaranteed
     * and immediate. If bulkhead is full, calling threads will contest for
     * space, if it becomes available. maxWaitDuration can be set to 0. Note:
     * for threads running on an event-loop or equivalent (rx computation pool,
     * etc), setting maxWaitDuration to 0 is highly recommended. Blocking an
     * event-loop thread will most likely have a negative effect on application
     * throughput.
     */
    private Integer bulkheadMaxWaitDuration = 0;
    /**
     * Whether timeout is enabled or not on the circuit breaker. Default is
     * false.
     */
    private Boolean timeoutEnabled = false;
    /**
     * References to a custom thread pool to use when timeout is enabled (uses
     * ForkJoinPool#commonPool() by default)
     */
    private ExecutorService timeoutExecutorService;
    /**
     * Configures the thread execution timeout. Default value is 1 second.
     */
    private Integer timeoutDuration = 1000;
    /**
     * Configures whether cancel is called on the running future. Defaults to
     * true.
     */
    private Boolean timeoutCancelRunningFuture = true;
    /**
     * Configure a list of exceptions that are recorded as a failure and thus
     * increase the failure rate. Any exception matching or inheriting from one
     * of the list counts as a failure, unless explicitly ignored via
     * ignoreExceptions.
     */
    private List<String> recordException;
    /**
     * Configure a list of exceptions that are ignored and neither count as a
     * failure nor success. Any exception matching or inheriting from one of the
     * list will not count as a failure nor success, even if the exceptions is
     * part of recordExceptions.
     */
    private List<String> ignoreException;

    public String getCircuitBreaker() {
        return circuitBreaker;
    }

    public void setCircuitBreaker(String circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public Float getFailureRateThreshold() {
        return failureRateThreshold;
    }

    public void setFailureRateThreshold(Float failureRateThreshold) {
        this.failureRateThreshold = failureRateThreshold;
    }

    public Integer getPermittedNumberOfCallsInHalfOpenState() {
        return permittedNumberOfCallsInHalfOpenState;
    }

    public void setPermittedNumberOfCallsInHalfOpenState(
            Integer permittedNumberOfCallsInHalfOpenState) {
        this.permittedNumberOfCallsInHalfOpenState = permittedNumberOfCallsInHalfOpenState;
    }

    public Boolean getThrowExceptionWhenHalfOpenOrOpenState() {
        return throwExceptionWhenHalfOpenOrOpenState;
    }

    public void setThrowExceptionWhenHalfOpenOrOpenState(
            Boolean throwExceptionWhenHalfOpenOrOpenState) {
        this.throwExceptionWhenHalfOpenOrOpenState = throwExceptionWhenHalfOpenOrOpenState;
    }

    public Integer getSlidingWindowSize() {
        return slidingWindowSize;
    }

    public void setSlidingWindowSize(Integer slidingWindowSize) {
        this.slidingWindowSize = slidingWindowSize;
    }

    public String getSlidingWindowType() {
        return slidingWindowType;
    }

    public void setSlidingWindowType(String slidingWindowType) {
        this.slidingWindowType = slidingWindowType;
    }

    public Integer getMinimumNumberOfCalls() {
        return minimumNumberOfCalls;
    }

    public void setMinimumNumberOfCalls(Integer minimumNumberOfCalls) {
        this.minimumNumberOfCalls = minimumNumberOfCalls;
    }

    public Boolean getWritableStackTraceEnabled() {
        return writableStackTraceEnabled;
    }

    public void setWritableStackTraceEnabled(Boolean writableStackTraceEnabled) {
        this.writableStackTraceEnabled = writableStackTraceEnabled;
    }

    public Integer getWaitDurationInOpenState() {
        return waitDurationInOpenState;
    }

    public void setWaitDurationInOpenState(Integer waitDurationInOpenState) {
        this.waitDurationInOpenState = waitDurationInOpenState;
    }

    public Boolean getAutomaticTransitionFromOpenToHalfOpenEnabled() {
        return automaticTransitionFromOpenToHalfOpenEnabled;
    }

    public void setAutomaticTransitionFromOpenToHalfOpenEnabled(
            Boolean automaticTransitionFromOpenToHalfOpenEnabled) {
        this.automaticTransitionFromOpenToHalfOpenEnabled = automaticTransitionFromOpenToHalfOpenEnabled;
    }

    public Float getSlowCallRateThreshold() {
        return slowCallRateThreshold;
    }

    public void setSlowCallRateThreshold(Float slowCallRateThreshold) {
        this.slowCallRateThreshold = slowCallRateThreshold;
    }

    public Integer getSlowCallDurationThreshold() {
        return slowCallDurationThreshold;
    }

    public void setSlowCallDurationThreshold(Integer slowCallDurationThreshold) {
        this.slowCallDurationThreshold = slowCallDurationThreshold;
    }

    public Boolean getBulkheadEnabled() {
        return bulkheadEnabled;
    }

    public void setBulkheadEnabled(Boolean bulkheadEnabled) {
        this.bulkheadEnabled = bulkheadEnabled;
    }

    public Integer getBulkheadMaxConcurrentCalls() {
        return bulkheadMaxConcurrentCalls;
    }

    public void setBulkheadMaxConcurrentCalls(Integer bulkheadMaxConcurrentCalls) {
        this.bulkheadMaxConcurrentCalls = bulkheadMaxConcurrentCalls;
    }

    public Integer getBulkheadMaxWaitDuration() {
        return bulkheadMaxWaitDuration;
    }

    public void setBulkheadMaxWaitDuration(Integer bulkheadMaxWaitDuration) {
        this.bulkheadMaxWaitDuration = bulkheadMaxWaitDuration;
    }

    public Boolean getTimeoutEnabled() {
        return timeoutEnabled;
    }

    public void setTimeoutEnabled(Boolean timeoutEnabled) {
        this.timeoutEnabled = timeoutEnabled;
    }

    public ExecutorService getTimeoutExecutorService() {
        return timeoutExecutorService;
    }

    public void setTimeoutExecutorService(ExecutorService timeoutExecutorService) {
        this.timeoutExecutorService = timeoutExecutorService;
    }

    public Integer getTimeoutDuration() {
        return timeoutDuration;
    }

    public void setTimeoutDuration(Integer timeoutDuration) {
        this.timeoutDuration = timeoutDuration;
    }

    public Boolean getTimeoutCancelRunningFuture() {
        return timeoutCancelRunningFuture;
    }

    public void setTimeoutCancelRunningFuture(Boolean timeoutCancelRunningFuture) {
        this.timeoutCancelRunningFuture = timeoutCancelRunningFuture;
    }

    public List<String> getRecordException() {
        return recordException;
    }

    public void setRecordException(List<String> recordException) {
        this.recordException = recordException;
    }

    public List<String> getIgnoreException() {
        return ignoreException;
    }

    public void setIgnoreException(List<String> ignoreException) {
        this.ignoreException = ignoreException;
    }
}