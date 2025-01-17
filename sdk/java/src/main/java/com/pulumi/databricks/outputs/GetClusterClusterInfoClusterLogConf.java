// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetClusterClusterInfoClusterLogConfDbfs;
import com.pulumi.databricks.outputs.GetClusterClusterInfoClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterClusterInfoClusterLogConf {
    private final @Nullable GetClusterClusterInfoClusterLogConfDbfs dbfs;
    private final @Nullable GetClusterClusterInfoClusterLogConfS3 s3;

    @CustomType.Constructor
    private GetClusterClusterInfoClusterLogConf(
        @CustomType.Parameter("dbfs") @Nullable GetClusterClusterInfoClusterLogConfDbfs dbfs,
        @CustomType.Parameter("s3") @Nullable GetClusterClusterInfoClusterLogConfS3 s3) {
        this.dbfs = dbfs;
        this.s3 = s3;
    }

    public Optional<GetClusterClusterInfoClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<GetClusterClusterInfoClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfoClusterLogConf defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetClusterClusterInfoClusterLogConfDbfs dbfs;
        private @Nullable GetClusterClusterInfoClusterLogConfS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterInfoClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable GetClusterClusterInfoClusterLogConfDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder s3(@Nullable GetClusterClusterInfoClusterLogConfS3 s3) {
            this.s3 = s3;
            return this;
        }        public GetClusterClusterInfoClusterLogConf build() {
            return new GetClusterClusterInfoClusterLogConf(dbfs, s3);
        }
    }
}
