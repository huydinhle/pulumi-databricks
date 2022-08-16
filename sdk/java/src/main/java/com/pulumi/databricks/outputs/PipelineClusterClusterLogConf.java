// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineClusterClusterLogConfDbfs;
import com.pulumi.databricks.outputs.PipelineClusterClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineClusterClusterLogConf {
    private final @Nullable PipelineClusterClusterLogConfDbfs dbfs;
    private final @Nullable PipelineClusterClusterLogConfS3 s3;

    @CustomType.Constructor
    private PipelineClusterClusterLogConf(
        @CustomType.Parameter("dbfs") @Nullable PipelineClusterClusterLogConfDbfs dbfs,
        @CustomType.Parameter("s3") @Nullable PipelineClusterClusterLogConfS3 s3) {
        this.dbfs = dbfs;
        this.s3 = s3;
    }

    public Optional<PipelineClusterClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<PipelineClusterClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineClusterClusterLogConf defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineClusterClusterLogConfDbfs dbfs;
        private @Nullable PipelineClusterClusterLogConfS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineClusterClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable PipelineClusterClusterLogConfDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder s3(@Nullable PipelineClusterClusterLogConfS3 s3) {
            this.s3 = s3;
            return this;
        }        public PipelineClusterClusterLogConf build() {
            return new PipelineClusterClusterLogConf(dbfs, s3);
        }
    }
}