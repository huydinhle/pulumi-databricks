// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskNewClusterClusterLogConfDbfs;
import com.pulumi.databricks.outputs.JobTaskNewClusterClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskNewClusterClusterLogConf {
    private final @Nullable JobTaskNewClusterClusterLogConfDbfs dbfs;
    private final @Nullable JobTaskNewClusterClusterLogConfS3 s3;

    @CustomType.Constructor
    private JobTaskNewClusterClusterLogConf(
        @CustomType.Parameter("dbfs") @Nullable JobTaskNewClusterClusterLogConfDbfs dbfs,
        @CustomType.Parameter("s3") @Nullable JobTaskNewClusterClusterLogConfS3 s3) {
        this.dbfs = dbfs;
        this.s3 = s3;
    }

    public Optional<JobTaskNewClusterClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<JobTaskNewClusterClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNewClusterClusterLogConf defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobTaskNewClusterClusterLogConfDbfs dbfs;
        private @Nullable JobTaskNewClusterClusterLogConfS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTaskNewClusterClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable JobTaskNewClusterClusterLogConfDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder s3(@Nullable JobTaskNewClusterClusterLogConfS3 s3) {
            this.s3 = s3;
            return this;
        }        public JobTaskNewClusterClusterLogConf build() {
            return new JobTaskNewClusterClusterLogConf(dbfs, s3);
        }
    }
}
