// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetClusterClusterInfo;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    private final String clusterId;
    private final GetClusterClusterInfo clusterInfo;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("clusterInfo") GetClusterClusterInfo clusterInfo,
        @CustomType.Parameter("id") String id) {
        this.clusterId = clusterId;
        this.clusterInfo = clusterInfo;
        this.id = id;
    }

    public String clusterId() {
        return this.clusterId;
    }
    public GetClusterClusterInfo clusterInfo() {
        return this.clusterInfo;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private GetClusterClusterInfo clusterInfo;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterInfo = defaults.clusterInfo;
    	      this.id = defaults.id;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterInfo(GetClusterClusterInfo clusterInfo) {
            this.clusterInfo = Objects.requireNonNull(clusterInfo);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetClusterResult build() {
            return new GetClusterResult(clusterId, clusterInfo, id);
        }
    }
}
