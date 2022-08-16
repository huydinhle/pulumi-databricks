// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobNewClusterInitScriptDbfsArgs;
import com.pulumi.databricks.inputs.JobNewClusterInitScriptFileArgs;
import com.pulumi.databricks.inputs.JobNewClusterInitScriptGcsArgs;
import com.pulumi.databricks.inputs.JobNewClusterInitScriptS3Args;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNewClusterInitScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterInitScriptArgs Empty = new JobNewClusterInitScriptArgs();

    @Import(name="dbfs")
    private @Nullable Output<JobNewClusterInitScriptDbfsArgs> dbfs;

    public Optional<Output<JobNewClusterInitScriptDbfsArgs>> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="file")
    private @Nullable Output<JobNewClusterInitScriptFileArgs> file;

    public Optional<Output<JobNewClusterInitScriptFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable Output<JobNewClusterInitScriptGcsArgs> gcs;

    public Optional<Output<JobNewClusterInitScriptGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable Output<JobNewClusterInitScriptS3Args> s3;

    public Optional<Output<JobNewClusterInitScriptS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    private JobNewClusterInitScriptArgs() {}

    private JobNewClusterInitScriptArgs(JobNewClusterInitScriptArgs $) {
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterInitScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterInitScriptArgs $;

        public Builder() {
            $ = new JobNewClusterInitScriptArgs();
        }

        public Builder(JobNewClusterInitScriptArgs defaults) {
            $ = new JobNewClusterInitScriptArgs(Objects.requireNonNull(defaults));
        }

        public Builder dbfs(@Nullable Output<JobNewClusterInitScriptDbfsArgs> dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder dbfs(JobNewClusterInitScriptDbfsArgs dbfs) {
            return dbfs(Output.of(dbfs));
        }

        public Builder file(@Nullable Output<JobNewClusterInitScriptFileArgs> file) {
            $.file = file;
            return this;
        }

        public Builder file(JobNewClusterInitScriptFileArgs file) {
            return file(Output.of(file));
        }

        public Builder gcs(@Nullable Output<JobNewClusterInitScriptGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(JobNewClusterInitScriptGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder s3(@Nullable Output<JobNewClusterInitScriptS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(JobNewClusterInitScriptS3Args s3) {
            return s3(Output.of(s3));
        }

        public JobNewClusterInitScriptArgs build() {
            return $;
        }
    }

}
