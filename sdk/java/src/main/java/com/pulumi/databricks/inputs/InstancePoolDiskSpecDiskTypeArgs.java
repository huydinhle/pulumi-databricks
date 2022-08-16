// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePoolDiskSpecDiskTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePoolDiskSpecDiskTypeArgs Empty = new InstancePoolDiskSpecDiskTypeArgs();

    @Import(name="azureDiskVolumeType")
    private @Nullable Output<String> azureDiskVolumeType;

    public Optional<Output<String>> azureDiskVolumeType() {
        return Optional.ofNullable(this.azureDiskVolumeType);
    }

    @Import(name="ebsVolumeType")
    private @Nullable Output<String> ebsVolumeType;

    public Optional<Output<String>> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }

    private InstancePoolDiskSpecDiskTypeArgs() {}

    private InstancePoolDiskSpecDiskTypeArgs(InstancePoolDiskSpecDiskTypeArgs $) {
        this.azureDiskVolumeType = $.azureDiskVolumeType;
        this.ebsVolumeType = $.ebsVolumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePoolDiskSpecDiskTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePoolDiskSpecDiskTypeArgs $;

        public Builder() {
            $ = new InstancePoolDiskSpecDiskTypeArgs();
        }

        public Builder(InstancePoolDiskSpecDiskTypeArgs defaults) {
            $ = new InstancePoolDiskSpecDiskTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureDiskVolumeType(@Nullable Output<String> azureDiskVolumeType) {
            $.azureDiskVolumeType = azureDiskVolumeType;
            return this;
        }

        public Builder azureDiskVolumeType(String azureDiskVolumeType) {
            return azureDiskVolumeType(Output.of(azureDiskVolumeType));
        }

        public Builder ebsVolumeType(@Nullable Output<String> ebsVolumeType) {
            $.ebsVolumeType = ebsVolumeType;
            return this;
        }

        public Builder ebsVolumeType(String ebsVolumeType) {
            return ebsVolumeType(Output.of(ebsVolumeType));
        }

        public InstancePoolDiskSpecDiskTypeArgs build() {
            return $;
        }
    }

}
