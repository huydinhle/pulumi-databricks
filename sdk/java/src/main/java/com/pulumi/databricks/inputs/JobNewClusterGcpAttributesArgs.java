// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNewClusterGcpAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterGcpAttributesArgs Empty = new JobNewClusterGcpAttributesArgs();

    @Import(name="availability")
    private @Nullable Output<String> availability;

    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    @Import(name="bootDiskSize")
    private @Nullable Output<Integer> bootDiskSize;

    public Optional<Output<Integer>> bootDiskSize() {
        return Optional.ofNullable(this.bootDiskSize);
    }

    @Import(name="googleServiceAccount")
    private @Nullable Output<String> googleServiceAccount;

    public Optional<Output<String>> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }

    @Import(name="usePreemptibleExecutors")
    private @Nullable Output<Boolean> usePreemptibleExecutors;

    public Optional<Output<Boolean>> usePreemptibleExecutors() {
        return Optional.ofNullable(this.usePreemptibleExecutors);
    }

    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private JobNewClusterGcpAttributesArgs() {}

    private JobNewClusterGcpAttributesArgs(JobNewClusterGcpAttributesArgs $) {
        this.availability = $.availability;
        this.bootDiskSize = $.bootDiskSize;
        this.googleServiceAccount = $.googleServiceAccount;
        this.usePreemptibleExecutors = $.usePreemptibleExecutors;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterGcpAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterGcpAttributesArgs $;

        public Builder() {
            $ = new JobNewClusterGcpAttributesArgs();
        }

        public Builder(JobNewClusterGcpAttributesArgs defaults) {
            $ = new JobNewClusterGcpAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        public Builder bootDiskSize(@Nullable Output<Integer> bootDiskSize) {
            $.bootDiskSize = bootDiskSize;
            return this;
        }

        public Builder bootDiskSize(Integer bootDiskSize) {
            return bootDiskSize(Output.of(bootDiskSize));
        }

        public Builder googleServiceAccount(@Nullable Output<String> googleServiceAccount) {
            $.googleServiceAccount = googleServiceAccount;
            return this;
        }

        public Builder googleServiceAccount(String googleServiceAccount) {
            return googleServiceAccount(Output.of(googleServiceAccount));
        }

        public Builder usePreemptibleExecutors(@Nullable Output<Boolean> usePreemptibleExecutors) {
            $.usePreemptibleExecutors = usePreemptibleExecutors;
            return this;
        }

        public Builder usePreemptibleExecutors(Boolean usePreemptibleExecutors) {
            return usePreemptibleExecutors(Output.of(usePreemptibleExecutors));
        }

        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public JobNewClusterGcpAttributesArgs build() {
            return $;
        }
    }

}
