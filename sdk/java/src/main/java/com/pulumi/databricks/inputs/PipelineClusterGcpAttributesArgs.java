// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineClusterGcpAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineClusterGcpAttributesArgs Empty = new PipelineClusterGcpAttributesArgs();

    @Import(name="googleServiceAccount")
    private @Nullable Output<String> googleServiceAccount;

    public Optional<Output<String>> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }

    private PipelineClusterGcpAttributesArgs() {}

    private PipelineClusterGcpAttributesArgs(PipelineClusterGcpAttributesArgs $) {
        this.googleServiceAccount = $.googleServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineClusterGcpAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineClusterGcpAttributesArgs $;

        public Builder() {
            $ = new PipelineClusterGcpAttributesArgs();
        }

        public Builder(PipelineClusterGcpAttributesArgs defaults) {
            $ = new PipelineClusterGcpAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder googleServiceAccount(@Nullable Output<String> googleServiceAccount) {
            $.googleServiceAccount = googleServiceAccount;
            return this;
        }

        public Builder googleServiceAccount(String googleServiceAccount) {
            return googleServiceAccount(Output.of(googleServiceAccount));
        }

        public PipelineClusterGcpAttributesArgs build() {
            return $;
        }
    }

}