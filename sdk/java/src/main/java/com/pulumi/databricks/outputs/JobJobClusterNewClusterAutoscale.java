// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobJobClusterNewClusterAutoscale {
    private final @Nullable Integer maxWorkers;
    private final @Nullable Integer minWorkers;

    @CustomType.Constructor
    private JobJobClusterNewClusterAutoscale(
        @CustomType.Parameter("maxWorkers") @Nullable Integer maxWorkers,
        @CustomType.Parameter("minWorkers") @Nullable Integer minWorkers) {
        this.maxWorkers = maxWorkers;
        this.minWorkers = minWorkers;
    }

    public Optional<Integer> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }
    public Optional<Integer> minWorkers() {
        return Optional.ofNullable(this.minWorkers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterAutoscale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxWorkers;
        private @Nullable Integer minWorkers;

        public Builder() {
    	      // Empty
        }

        public Builder(JobJobClusterNewClusterAutoscale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
        }

        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }
        public Builder minWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }        public JobJobClusterNewClusterAutoscale build() {
            return new JobJobClusterNewClusterAutoscale(maxWorkers, minWorkers);
        }
    }
}
