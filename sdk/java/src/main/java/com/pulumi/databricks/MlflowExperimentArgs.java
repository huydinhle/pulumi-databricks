// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MlflowExperimentArgs extends com.pulumi.resources.ResourceArgs {

    public static final MlflowExperimentArgs Empty = new MlflowExperimentArgs();

    /**
     * Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
     * 
     */
    @Import(name="artifactLocation")
    private @Nullable Output<String> artifactLocation;

    /**
     * @return Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
     * 
     */
    public Optional<Output<String>> artifactLocation() {
        return Optional.ofNullable(this.artifactLocation);
    }

    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The description of the MLflow experiment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the MLflow experiment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="experimentId")
    private @Nullable Output<String> experimentId;

    public Optional<Output<String>> experimentId() {
        return Optional.ofNullable(this.experimentId);
    }

    @Import(name="lastUpdateTime")
    private @Nullable Output<Integer> lastUpdateTime;

    public Optional<Output<Integer>> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }

    @Import(name="lifecycleStage")
    private @Nullable Output<String> lifecycleStage;

    public Optional<Output<String>> lifecycleStage() {
        return Optional.ofNullable(this.lifecycleStage);
    }

    /**
     * Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/&lt;some-username&gt;/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/&lt;some-username&gt;/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private MlflowExperimentArgs() {}

    private MlflowExperimentArgs(MlflowExperimentArgs $) {
        this.artifactLocation = $.artifactLocation;
        this.creationTime = $.creationTime;
        this.description = $.description;
        this.experimentId = $.experimentId;
        this.lastUpdateTime = $.lastUpdateTime;
        this.lifecycleStage = $.lifecycleStage;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MlflowExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MlflowExperimentArgs $;

        public Builder() {
            $ = new MlflowExperimentArgs();
        }

        public Builder(MlflowExperimentArgs defaults) {
            $ = new MlflowExperimentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactLocation Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
         * 
         * @return builder
         * 
         */
        public Builder artifactLocation(@Nullable Output<String> artifactLocation) {
            $.artifactLocation = artifactLocation;
            return this;
        }

        /**
         * @param artifactLocation Path to dbfs:/ or s3:// artifact location of the MLflow experiment.
         * 
         * @return builder
         * 
         */
        public Builder artifactLocation(String artifactLocation) {
            return artifactLocation(Output.of(artifactLocation));
        }

        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param description The description of the MLflow experiment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the MLflow experiment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder experimentId(@Nullable Output<String> experimentId) {
            $.experimentId = experimentId;
            return this;
        }

        public Builder experimentId(String experimentId) {
            return experimentId(Output.of(experimentId));
        }

        public Builder lastUpdateTime(@Nullable Output<Integer> lastUpdateTime) {
            $.lastUpdateTime = lastUpdateTime;
            return this;
        }

        public Builder lastUpdateTime(Integer lastUpdateTime) {
            return lastUpdateTime(Output.of(lastUpdateTime));
        }

        public Builder lifecycleStage(@Nullable Output<String> lifecycleStage) {
            $.lifecycleStage = lifecycleStage;
            return this;
        }

        public Builder lifecycleStage(String lifecycleStage) {
            return lifecycleStage(Output.of(lifecycleStage));
        }

        /**
         * @param name Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/&lt;some-username&gt;/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of MLflow experiment. It must be an absolute path within the Databricks workspace, e.g. `/Users/&lt;some-username&gt;/my-experiment`. For more information about changes to experiment naming conventions, see [mlflow docs](https://docs.databricks.com/applications/mlflow/experiments.html#experiment-migration).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public MlflowExperimentArgs build() {
            return $;
        }
    }

}