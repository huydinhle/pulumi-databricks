// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstancePoolDiskSpecDiskType {
    private final @Nullable String azureDiskVolumeType;
    private final @Nullable String ebsVolumeType;

    @CustomType.Constructor
    private InstancePoolDiskSpecDiskType(
        @CustomType.Parameter("azureDiskVolumeType") @Nullable String azureDiskVolumeType,
        @CustomType.Parameter("ebsVolumeType") @Nullable String ebsVolumeType) {
        this.azureDiskVolumeType = azureDiskVolumeType;
        this.ebsVolumeType = ebsVolumeType;
    }

    public Optional<String> azureDiskVolumeType() {
        return Optional.ofNullable(this.azureDiskVolumeType);
    }
    public Optional<String> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePoolDiskSpecDiskType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureDiskVolumeType;
        private @Nullable String ebsVolumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePoolDiskSpecDiskType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDiskVolumeType = defaults.azureDiskVolumeType;
    	      this.ebsVolumeType = defaults.ebsVolumeType;
        }

        public Builder azureDiskVolumeType(@Nullable String azureDiskVolumeType) {
            this.azureDiskVolumeType = azureDiskVolumeType;
            return this;
        }
        public Builder ebsVolumeType(@Nullable String ebsVolumeType) {
            this.ebsVolumeType = ebsVolumeType;
            return this;
        }        public InstancePoolDiskSpecDiskType build() {
            return new InstancePoolDiskSpecDiskType(azureDiskVolumeType, ebsVolumeType);
        }
    }
}
