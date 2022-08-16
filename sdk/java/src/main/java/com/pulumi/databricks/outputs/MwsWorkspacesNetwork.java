// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.MwsWorkspacesNetworkGcpCommonNetworkConfig;
import com.pulumi.databricks.outputs.MwsWorkspacesNetworkGcpManagedNetworkConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MwsWorkspacesNetwork {
    private final MwsWorkspacesNetworkGcpCommonNetworkConfig gcpCommonNetworkConfig;
    private final @Nullable MwsWorkspacesNetworkGcpManagedNetworkConfig gcpManagedNetworkConfig;
    private final @Nullable String networkId;

    @CustomType.Constructor
    private MwsWorkspacesNetwork(
        @CustomType.Parameter("gcpCommonNetworkConfig") MwsWorkspacesNetworkGcpCommonNetworkConfig gcpCommonNetworkConfig,
        @CustomType.Parameter("gcpManagedNetworkConfig") @Nullable MwsWorkspacesNetworkGcpManagedNetworkConfig gcpManagedNetworkConfig,
        @CustomType.Parameter("networkId") @Nullable String networkId) {
        this.gcpCommonNetworkConfig = gcpCommonNetworkConfig;
        this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
        this.networkId = networkId;
    }

    public MwsWorkspacesNetworkGcpCommonNetworkConfig gcpCommonNetworkConfig() {
        return this.gcpCommonNetworkConfig;
    }
    public Optional<MwsWorkspacesNetworkGcpManagedNetworkConfig> gcpManagedNetworkConfig() {
        return Optional.ofNullable(this.gcpManagedNetworkConfig);
    }
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsWorkspacesNetworkGcpCommonNetworkConfig gcpCommonNetworkConfig;
        private @Nullable MwsWorkspacesNetworkGcpManagedNetworkConfig gcpManagedNetworkConfig;
        private @Nullable String networkId;

        public Builder() {
    	      // Empty
        }

        public Builder(MwsWorkspacesNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpCommonNetworkConfig = defaults.gcpCommonNetworkConfig;
    	      this.gcpManagedNetworkConfig = defaults.gcpManagedNetworkConfig;
    	      this.networkId = defaults.networkId;
        }

        public Builder gcpCommonNetworkConfig(MwsWorkspacesNetworkGcpCommonNetworkConfig gcpCommonNetworkConfig) {
            this.gcpCommonNetworkConfig = Objects.requireNonNull(gcpCommonNetworkConfig);
            return this;
        }
        public Builder gcpManagedNetworkConfig(@Nullable MwsWorkspacesNetworkGcpManagedNetworkConfig gcpManagedNetworkConfig) {
            this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
            return this;
        }
        public Builder networkId(@Nullable String networkId) {
            this.networkId = networkId;
            return this;
        }        public MwsWorkspacesNetwork build() {
            return new MwsWorkspacesNetwork(gcpCommonNetworkConfig, gcpManagedNetworkConfig, networkId);
        }
    }
}
