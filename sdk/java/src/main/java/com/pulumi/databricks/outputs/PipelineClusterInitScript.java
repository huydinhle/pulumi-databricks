// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptFile;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptGcs;
import com.pulumi.databricks.outputs.PipelineClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineClusterInitScript {
    private final @Nullable PipelineClusterInitScriptDbfs dbfs;
    private final @Nullable PipelineClusterInitScriptFile file;
    private final @Nullable PipelineClusterInitScriptGcs gcs;
    private final @Nullable PipelineClusterInitScriptS3 s3;

    @CustomType.Constructor
    private PipelineClusterInitScript(
        @CustomType.Parameter("dbfs") @Nullable PipelineClusterInitScriptDbfs dbfs,
        @CustomType.Parameter("file") @Nullable PipelineClusterInitScriptFile file,
        @CustomType.Parameter("gcs") @Nullable PipelineClusterInitScriptGcs gcs,
        @CustomType.Parameter("s3") @Nullable PipelineClusterInitScriptS3 s3) {
        this.dbfs = dbfs;
        this.file = file;
        this.gcs = gcs;
        this.s3 = s3;
    }

    public Optional<PipelineClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<PipelineClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<PipelineClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<PipelineClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineClusterInitScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineClusterInitScriptDbfs dbfs;
        private @Nullable PipelineClusterInitScriptFile file;
        private @Nullable PipelineClusterInitScriptGcs gcs;
        private @Nullable PipelineClusterInitScriptS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineClusterInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.file = defaults.file;
    	      this.gcs = defaults.gcs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable PipelineClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder file(@Nullable PipelineClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        public Builder gcs(@Nullable PipelineClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        public Builder s3(@Nullable PipelineClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }        public PipelineClusterInitScript build() {
            return new PipelineClusterInitScript(dbfs, file, gcs, s3);
        }
    }
}
