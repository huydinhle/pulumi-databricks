// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MlflowWebhookHttpUrlSpecArgs;
import com.pulumi.databricks.inputs.MlflowWebhookJobSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MlflowWebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final MlflowWebhookArgs Empty = new MlflowWebhookArgs();

    /**
     * Optional description of the MLflow webhook.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional description of the MLflow webhook.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    @Import(name="httpUrlSpec")
    private @Nullable Output<MlflowWebhookHttpUrlSpecArgs> httpUrlSpec;

    public Optional<Output<MlflowWebhookHttpUrlSpecArgs>> httpUrlSpec() {
        return Optional.ofNullable(this.httpUrlSpec);
    }

    @Import(name="jobSpec")
    private @Nullable Output<MlflowWebhookJobSpecArgs> jobSpec;

    public Optional<Output<MlflowWebhookJobSpecArgs>> jobSpec() {
        return Optional.ofNullable(this.jobSpec);
    }

    /**
     * Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
     * 
     */
    @Import(name="modelName")
    private @Nullable Output<String> modelName;

    /**
     * @return Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
     * 
     */
    public Optional<Output<String>> modelName() {
        return Optional.ofNullable(this.modelName);
    }

    /**
     * Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private MlflowWebhookArgs() {}

    private MlflowWebhookArgs(MlflowWebhookArgs $) {
        this.description = $.description;
        this.events = $.events;
        this.httpUrlSpec = $.httpUrlSpec;
        this.jobSpec = $.jobSpec;
        this.modelName = $.modelName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MlflowWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MlflowWebhookArgs $;

        public Builder() {
            $ = new MlflowWebhookArgs();
        }

        public Builder(MlflowWebhookArgs defaults) {
            $ = new MlflowWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional description of the MLflow webhook.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional description of the MLflow webhook.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param events The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        public Builder httpUrlSpec(@Nullable Output<MlflowWebhookHttpUrlSpecArgs> httpUrlSpec) {
            $.httpUrlSpec = httpUrlSpec;
            return this;
        }

        public Builder httpUrlSpec(MlflowWebhookHttpUrlSpecArgs httpUrlSpec) {
            return httpUrlSpec(Output.of(httpUrlSpec));
        }

        public Builder jobSpec(@Nullable Output<MlflowWebhookJobSpecArgs> jobSpec) {
            $.jobSpec = jobSpec;
            return this;
        }

        public Builder jobSpec(MlflowWebhookJobSpecArgs jobSpec) {
            return jobSpec(Output.of(jobSpec));
        }

        /**
         * @param modelName Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
         * 
         * @return builder
         * 
         */
        public Builder modelName(@Nullable Output<String> modelName) {
            $.modelName = modelName;
            return this;
        }

        /**
         * @param modelName Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
         * 
         * @return builder
         * 
         */
        public Builder modelName(String modelName) {
            return modelName(Output.of(modelName));
        }

        /**
         * @param status Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public MlflowWebhookArgs build() {
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            return $;
        }
    }

}