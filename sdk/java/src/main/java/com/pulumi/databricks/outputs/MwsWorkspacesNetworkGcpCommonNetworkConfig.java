// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MwsWorkspacesNetworkGcpCommonNetworkConfig {
    private final String gkeClusterMasterIpRange;
    private final String gkeConnectivityType;

    @CustomType.Constructor
    private MwsWorkspacesNetworkGcpCommonNetworkConfig(
        @CustomType.Parameter("gkeClusterMasterIpRange") String gkeClusterMasterIpRange,
        @CustomType.Parameter("gkeConnectivityType") String gkeConnectivityType) {
        this.gkeClusterMasterIpRange = gkeClusterMasterIpRange;
        this.gkeConnectivityType = gkeConnectivityType;
    }

    public String gkeClusterMasterIpRange() {
        return this.gkeClusterMasterIpRange;
    }
    public String gkeConnectivityType() {
        return this.gkeConnectivityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesNetworkGcpCommonNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gkeClusterMasterIpRange;
        private String gkeConnectivityType;

        public Builder() {
    	      // Empty
        }

        public Builder(MwsWorkspacesNetworkGcpCommonNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterMasterIpRange = defaults.gkeClusterMasterIpRange;
    	      this.gkeConnectivityType = defaults.gkeConnectivityType;
        }

        public Builder gkeClusterMasterIpRange(String gkeClusterMasterIpRange) {
            this.gkeClusterMasterIpRange = Objects.requireNonNull(gkeClusterMasterIpRange);
            return this;
        }
        public Builder gkeConnectivityType(String gkeConnectivityType) {
            this.gkeConnectivityType = Objects.requireNonNull(gkeConnectivityType);
            return this;
        }        public MwsWorkspacesNetworkGcpCommonNetworkConfig build() {
            return new MwsWorkspacesNetworkGcpCommonNetworkConfig(gkeClusterMasterIpRange, gkeConnectivityType);
        }
    }
}
