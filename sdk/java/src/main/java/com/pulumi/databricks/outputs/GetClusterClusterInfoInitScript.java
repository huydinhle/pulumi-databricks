// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetClusterClusterInfoInitScriptDbfs;
import com.pulumi.databricks.outputs.GetClusterClusterInfoInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterClusterInfoInitScript {
    private final @Nullable GetClusterClusterInfoInitScriptDbfs dbfs;
    private final @Nullable GetClusterClusterInfoInitScriptS3 s3;

    @CustomType.Constructor
    private GetClusterClusterInfoInitScript(
        @CustomType.Parameter("dbfs") @Nullable GetClusterClusterInfoInitScriptDbfs dbfs,
        @CustomType.Parameter("s3") @Nullable GetClusterClusterInfoInitScriptS3 s3) {
        this.dbfs = dbfs;
        this.s3 = s3;
    }

    public Optional<GetClusterClusterInfoInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<GetClusterClusterInfoInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfoInitScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetClusterClusterInfoInitScriptDbfs dbfs;
        private @Nullable GetClusterClusterInfoInitScriptS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterInfoInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable GetClusterClusterInfoInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder s3(@Nullable GetClusterClusterInfoInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }        public GetClusterClusterInfoInitScript build() {
            return new GetClusterClusterInfoInitScript(dbfs, s3);
        }
    }
}
