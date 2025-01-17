// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.ClusterInitScriptFile;
import com.pulumi.databricks.outputs.ClusterInitScriptGcs;
import com.pulumi.databricks.outputs.ClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterInitScript {
    private final @Nullable ClusterInitScriptDbfs dbfs;
    private final @Nullable ClusterInitScriptFile file;
    private final @Nullable ClusterInitScriptGcs gcs;
    private final @Nullable ClusterInitScriptS3 s3;

    @CustomType.Constructor
    private ClusterInitScript(
        @CustomType.Parameter("dbfs") @Nullable ClusterInitScriptDbfs dbfs,
        @CustomType.Parameter("file") @Nullable ClusterInitScriptFile file,
        @CustomType.Parameter("gcs") @Nullable ClusterInitScriptGcs gcs,
        @CustomType.Parameter("s3") @Nullable ClusterInitScriptS3 s3) {
        this.dbfs = dbfs;
        this.file = file;
        this.gcs = gcs;
        this.s3 = s3;
    }

    public Optional<ClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<ClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<ClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<ClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInitScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterInitScriptDbfs dbfs;
        private @Nullable ClusterInitScriptFile file;
        private @Nullable ClusterInitScriptGcs gcs;
        private @Nullable ClusterInitScriptS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.file = defaults.file;
    	      this.gcs = defaults.gcs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable ClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder file(@Nullable ClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        public Builder gcs(@Nullable ClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        public Builder s3(@Nullable ClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }        public ClusterInitScript build() {
            return new ClusterInitScript(dbfs, file, gcs, s3);
        }
    }
}
