// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobEmailNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobEmailNotificationsArgs Empty = new JobEmailNotificationsArgs();

    @Import(name="alertOnLastAttempt")
    private @Nullable Output<Boolean> alertOnLastAttempt;

    public Optional<Output<Boolean>> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }

    /**
     * (Bool) don&#39;t send alert for skipped runs
     * 
     */
    @Import(name="noAlertForSkippedRuns")
    private @Nullable Output<Boolean> noAlertForSkippedRuns;

    /**
     * @return (Bool) don&#39;t send alert for skipped runs
     * 
     */
    public Optional<Output<Boolean>> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    /**
     * (List) list of emails to notify on failure
     * 
     */
    @Import(name="onFailures")
    private @Nullable Output<List<String>> onFailures;

    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public Optional<Output<List<String>>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    /**
     * (List) list of emails to notify on failure
     * 
     */
    @Import(name="onStarts")
    private @Nullable Output<List<String>> onStarts;

    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public Optional<Output<List<String>>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    /**
     * (List) list of emails to notify on failure
     * 
     */
    @Import(name="onSuccesses")
    private @Nullable Output<List<String>> onSuccesses;

    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public Optional<Output<List<String>>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private JobEmailNotificationsArgs() {}

    private JobEmailNotificationsArgs(JobEmailNotificationsArgs $) {
        this.alertOnLastAttempt = $.alertOnLastAttempt;
        this.noAlertForSkippedRuns = $.noAlertForSkippedRuns;
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobEmailNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobEmailNotificationsArgs $;

        public Builder() {
            $ = new JobEmailNotificationsArgs();
        }

        public Builder(JobEmailNotificationsArgs defaults) {
            $ = new JobEmailNotificationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder alertOnLastAttempt(@Nullable Output<Boolean> alertOnLastAttempt) {
            $.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }

        public Builder alertOnLastAttempt(Boolean alertOnLastAttempt) {
            return alertOnLastAttempt(Output.of(alertOnLastAttempt));
        }

        /**
         * @param noAlertForSkippedRuns (Bool) don&#39;t send alert for skipped runs
         * 
         * @return builder
         * 
         */
        public Builder noAlertForSkippedRuns(@Nullable Output<Boolean> noAlertForSkippedRuns) {
            $.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }

        /**
         * @param noAlertForSkippedRuns (Bool) don&#39;t send alert for skipped runs
         * 
         * @return builder
         * 
         */
        public Builder noAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
            return noAlertForSkippedRuns(Output.of(noAlertForSkippedRuns));
        }

        /**
         * @param onFailures (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onFailures(@Nullable Output<List<String>> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        /**
         * @param onFailures (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onFailures(List<String> onFailures) {
            return onFailures(Output.of(onFailures));
        }

        /**
         * @param onFailures (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }

        /**
         * @param onStarts (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onStarts(@Nullable Output<List<String>> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        /**
         * @param onStarts (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onStarts(List<String> onStarts) {
            return onStarts(Output.of(onStarts));
        }

        /**
         * @param onStarts (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }

        /**
         * @param onSuccesses (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(@Nullable Output<List<String>> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        /**
         * @param onSuccesses (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(List<String> onSuccesses) {
            return onSuccesses(Output.of(onSuccesses));
        }

        /**
         * @param onSuccesses (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public JobEmailNotificationsArgs build() {
            return $;
        }
    }

}