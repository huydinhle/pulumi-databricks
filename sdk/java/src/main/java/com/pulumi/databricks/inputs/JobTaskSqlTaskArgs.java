// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskSqlTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskSqlTaskArgs Empty = new JobTaskSqlTaskArgs();

    @Import(name="alert")
    private @Nullable Output<JobTaskSqlTaskAlertArgs> alert;

    public Optional<Output<JobTaskSqlTaskAlertArgs>> alert() {
        return Optional.ofNullable(this.alert);
    }

    @Import(name="dashboard")
    private @Nullable Output<JobTaskSqlTaskDashboardArgs> dashboard;

    public Optional<Output<JobTaskSqlTaskDashboardArgs>> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }

    /**
     * Parameters for the task
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return Parameters for the task
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="query")
    private @Nullable Output<JobTaskSqlTaskQueryArgs> query;

    public Optional<Output<JobTaskSqlTaskQueryArgs>> query() {
        return Optional.ofNullable(this.query);
    }

    @Import(name="warehouseId")
    private @Nullable Output<String> warehouseId;

    public Optional<Output<String>> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private JobTaskSqlTaskArgs() {}

    private JobTaskSqlTaskArgs(JobTaskSqlTaskArgs $) {
        this.alert = $.alert;
        this.dashboard = $.dashboard;
        this.parameters = $.parameters;
        this.query = $.query;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskSqlTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskSqlTaskArgs $;

        public Builder() {
            $ = new JobTaskSqlTaskArgs();
        }

        public Builder(JobTaskSqlTaskArgs defaults) {
            $ = new JobTaskSqlTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder alert(@Nullable Output<JobTaskSqlTaskAlertArgs> alert) {
            $.alert = alert;
            return this;
        }

        public Builder alert(JobTaskSqlTaskAlertArgs alert) {
            return alert(Output.of(alert));
        }

        public Builder dashboard(@Nullable Output<JobTaskSqlTaskDashboardArgs> dashboard) {
            $.dashboard = dashboard;
            return this;
        }

        public Builder dashboard(JobTaskSqlTaskDashboardArgs dashboard) {
            return dashboard(Output.of(dashboard));
        }

        /**
         * @param parameters Parameters for the task
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for the task
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder query(@Nullable Output<JobTaskSqlTaskQueryArgs> query) {
            $.query = query;
            return this;
        }

        public Builder query(JobTaskSqlTaskQueryArgs query) {
            return query(Output.of(query));
        }

        public Builder warehouseId(@Nullable Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public Builder warehouseId(String warehouseId) {
            return warehouseId(Output.of(warehouseId));
        }

        public JobTaskSqlTaskArgs build() {
            return $;
        }
    }

}
