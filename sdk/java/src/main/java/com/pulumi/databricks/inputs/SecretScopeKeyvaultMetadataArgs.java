// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SecretScopeKeyvaultMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretScopeKeyvaultMetadataArgs Empty = new SecretScopeKeyvaultMetadataArgs();

    @Import(name="dnsName", required=true)
    private Output<String> dnsName;

    public Output<String> dnsName() {
        return this.dnsName;
    }

    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    private SecretScopeKeyvaultMetadataArgs() {}

    private SecretScopeKeyvaultMetadataArgs(SecretScopeKeyvaultMetadataArgs $) {
        this.dnsName = $.dnsName;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretScopeKeyvaultMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretScopeKeyvaultMetadataArgs $;

        public Builder() {
            $ = new SecretScopeKeyvaultMetadataArgs();
        }

        public Builder(SecretScopeKeyvaultMetadataArgs defaults) {
            $ = new SecretScopeKeyvaultMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder dnsName(Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public SecretScopeKeyvaultMetadataArgs build() {
            $.dnsName = Objects.requireNonNull($.dnsName, "expected parameter 'dnsName' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
