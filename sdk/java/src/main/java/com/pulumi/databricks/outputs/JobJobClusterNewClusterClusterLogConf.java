// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterClusterLogConfDbfs;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobJobClusterNewClusterClusterLogConf {
    private final @Nullable JobJobClusterNewClusterClusterLogConfDbfs dbfs;
    private final @Nullable JobJobClusterNewClusterClusterLogConfS3 s3;

    @CustomType.Constructor
    private JobJobClusterNewClusterClusterLogConf(
        @CustomType.Parameter("dbfs") @Nullable JobJobClusterNewClusterClusterLogConfDbfs dbfs,
        @CustomType.Parameter("s3") @Nullable JobJobClusterNewClusterClusterLogConfS3 s3) {
        this.dbfs = dbfs;
        this.s3 = s3;
    }

    public Optional<JobJobClusterNewClusterClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<JobJobClusterNewClusterClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterClusterLogConf defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobJobClusterNewClusterClusterLogConfDbfs dbfs;
        private @Nullable JobJobClusterNewClusterClusterLogConfS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(JobJobClusterNewClusterClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable JobJobClusterNewClusterClusterLogConfDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder s3(@Nullable JobJobClusterNewClusterClusterLogConfS3 s3) {
            this.s3 = s3;
            return this;
        }        public JobJobClusterNewClusterClusterLogConf build() {
            return new JobJobClusterNewClusterClusterLogConf(dbfs, s3);
        }
    }
}