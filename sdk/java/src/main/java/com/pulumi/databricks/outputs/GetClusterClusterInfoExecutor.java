// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetClusterClusterInfoExecutorNodeAwsAttributes;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterClusterInfoExecutor {
    private final @Nullable String hostPrivateIp;
    private final @Nullable String instanceId;
    private final @Nullable GetClusterClusterInfoExecutorNodeAwsAttributes nodeAwsAttributes;
    private final @Nullable String nodeId;
    private final @Nullable String privateIp;
    private final @Nullable String publicDns;
    private final @Nullable Integer startTimestamp;

    @CustomType.Constructor
    private GetClusterClusterInfoExecutor(
        @CustomType.Parameter("hostPrivateIp") @Nullable String hostPrivateIp,
        @CustomType.Parameter("instanceId") @Nullable String instanceId,
        @CustomType.Parameter("nodeAwsAttributes") @Nullable GetClusterClusterInfoExecutorNodeAwsAttributes nodeAwsAttributes,
        @CustomType.Parameter("nodeId") @Nullable String nodeId,
        @CustomType.Parameter("privateIp") @Nullable String privateIp,
        @CustomType.Parameter("publicDns") @Nullable String publicDns,
        @CustomType.Parameter("startTimestamp") @Nullable Integer startTimestamp) {
        this.hostPrivateIp = hostPrivateIp;
        this.instanceId = instanceId;
        this.nodeAwsAttributes = nodeAwsAttributes;
        this.nodeId = nodeId;
        this.privateIp = privateIp;
        this.publicDns = publicDns;
        this.startTimestamp = startTimestamp;
    }

    public Optional<String> hostPrivateIp() {
        return Optional.ofNullable(this.hostPrivateIp);
    }
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Optional<GetClusterClusterInfoExecutorNodeAwsAttributes> nodeAwsAttributes() {
        return Optional.ofNullable(this.nodeAwsAttributes);
    }
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    public Optional<String> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }
    public Optional<String> publicDns() {
        return Optional.ofNullable(this.publicDns);
    }
    public Optional<Integer> startTimestamp() {
        return Optional.ofNullable(this.startTimestamp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfoExecutor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostPrivateIp;
        private @Nullable String instanceId;
        private @Nullable GetClusterClusterInfoExecutorNodeAwsAttributes nodeAwsAttributes;
        private @Nullable String nodeId;
        private @Nullable String privateIp;
        private @Nullable String publicDns;
        private @Nullable Integer startTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterInfoExecutor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPrivateIp = defaults.hostPrivateIp;
    	      this.instanceId = defaults.instanceId;
    	      this.nodeAwsAttributes = defaults.nodeAwsAttributes;
    	      this.nodeId = defaults.nodeId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicDns = defaults.publicDns;
    	      this.startTimestamp = defaults.startTimestamp;
        }

        public Builder hostPrivateIp(@Nullable String hostPrivateIp) {
            this.hostPrivateIp = hostPrivateIp;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder nodeAwsAttributes(@Nullable GetClusterClusterInfoExecutorNodeAwsAttributes nodeAwsAttributes) {
            this.nodeAwsAttributes = nodeAwsAttributes;
            return this;
        }
        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Builder privateIp(@Nullable String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public Builder publicDns(@Nullable String publicDns) {
            this.publicDns = publicDns;
            return this;
        }
        public Builder startTimestamp(@Nullable Integer startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }        public GetClusterClusterInfoExecutor build() {
            return new GetClusterClusterInfoExecutor(hostPrivateIp, instanceId, nodeAwsAttributes, nodeId, privateIp, publicDns, startTimestamp);
        }
    }
}