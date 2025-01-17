// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.InstancePoolDiskSpecDiskType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstancePoolDiskSpec {
    /**
     * @return (Integer) The number of disks to attach to each instance. This feature is only enabled for supported node types. Users can choose up to the limit of the disks supported by the node type. For node types with no local disk, at least one disk needs to be specified.
     * 
     */
    private final @Nullable Integer diskCount;
    /**
     * @return (Integer) The size of each disk (in GiB) to attach.
     * 
     */
    private final @Nullable Integer diskSize;
    private final @Nullable InstancePoolDiskSpecDiskType diskType;

    @CustomType.Constructor
    private InstancePoolDiskSpec(
        @CustomType.Parameter("diskCount") @Nullable Integer diskCount,
        @CustomType.Parameter("diskSize") @Nullable Integer diskSize,
        @CustomType.Parameter("diskType") @Nullable InstancePoolDiskSpecDiskType diskType) {
        this.diskCount = diskCount;
        this.diskSize = diskSize;
        this.diskType = diskType;
    }

    /**
     * @return (Integer) The number of disks to attach to each instance. This feature is only enabled for supported node types. Users can choose up to the limit of the disks supported by the node type. For node types with no local disk, at least one disk needs to be specified.
     * 
     */
    public Optional<Integer> diskCount() {
        return Optional.ofNullable(this.diskCount);
    }
    /**
     * @return (Integer) The size of each disk (in GiB) to attach.
     * 
     */
    public Optional<Integer> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    public Optional<InstancePoolDiskSpecDiskType> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePoolDiskSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskCount;
        private @Nullable Integer diskSize;
        private @Nullable InstancePoolDiskSpecDiskType diskType;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePoolDiskSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCount = defaults.diskCount;
    	      this.diskSize = defaults.diskSize;
    	      this.diskType = defaults.diskType;
        }

        public Builder diskCount(@Nullable Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Builder diskSize(@Nullable Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Builder diskType(@Nullable InstancePoolDiskSpecDiskType diskType) {
            this.diskType = diskType;
            return this;
        }        public InstancePoolDiskSpec build() {
            return new InstancePoolDiskSpec(diskCount, diskSize, diskType);
        }
    }
}
