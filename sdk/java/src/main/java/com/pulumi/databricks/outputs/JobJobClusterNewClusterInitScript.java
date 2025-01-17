// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterInitScriptFile;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterInitScriptGcs;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobJobClusterNewClusterInitScript {
    private final @Nullable JobJobClusterNewClusterInitScriptDbfs dbfs;
    private final @Nullable JobJobClusterNewClusterInitScriptFile file;
    private final @Nullable JobJobClusterNewClusterInitScriptGcs gcs;
    private final @Nullable JobJobClusterNewClusterInitScriptS3 s3;

    @CustomType.Constructor
    private JobJobClusterNewClusterInitScript(
        @CustomType.Parameter("dbfs") @Nullable JobJobClusterNewClusterInitScriptDbfs dbfs,
        @CustomType.Parameter("file") @Nullable JobJobClusterNewClusterInitScriptFile file,
        @CustomType.Parameter("gcs") @Nullable JobJobClusterNewClusterInitScriptGcs gcs,
        @CustomType.Parameter("s3") @Nullable JobJobClusterNewClusterInitScriptS3 s3) {
        this.dbfs = dbfs;
        this.file = file;
        this.gcs = gcs;
        this.s3 = s3;
    }

    public Optional<JobJobClusterNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<JobJobClusterNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<JobJobClusterNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<JobJobClusterNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterInitScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobJobClusterNewClusterInitScriptDbfs dbfs;
        private @Nullable JobJobClusterNewClusterInitScriptFile file;
        private @Nullable JobJobClusterNewClusterInitScriptGcs gcs;
        private @Nullable JobJobClusterNewClusterInitScriptS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(JobJobClusterNewClusterInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.file = defaults.file;
    	      this.gcs = defaults.gcs;
    	      this.s3 = defaults.s3;
        }

        public Builder dbfs(@Nullable JobJobClusterNewClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        public Builder file(@Nullable JobJobClusterNewClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        public Builder gcs(@Nullable JobJobClusterNewClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        public Builder s3(@Nullable JobJobClusterNewClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }        public JobJobClusterNewClusterInitScript build() {
            return new JobJobClusterNewClusterInitScript(dbfs, file, gcs, s3);
        }
    }
}
