// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterPolicyState Empty = new ClusterPolicyState();

    /**
     * Policy definition JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
     * 
     */
    @Import(name="definition")
    private @Nullable Output<String> definition;

    /**
     * @return Policy definition JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
     * 
     */
    public Optional<Output<String>> definition() {
        return Optional.ofNullable(this.definition);
    }

    /**
     * Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Canonical unique identifier for the cluster policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return Canonical unique identifier for the cluster policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    private ClusterPolicyState() {}

    private ClusterPolicyState(ClusterPolicyState $) {
        this.definition = $.definition;
        this.name = $.name;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterPolicyState $;

        public Builder() {
            $ = new ClusterPolicyState();
        }

        public Builder(ClusterPolicyState defaults) {
            $ = new ClusterPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param definition Policy definition JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
         * 
         * @return builder
         * 
         */
        public Builder definition(@Nullable Output<String> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition Policy definition JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
         * 
         * @return builder
         * 
         */
        public Builder definition(String definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param name Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyId Canonical unique identifier for the cluster policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId Canonical unique identifier for the cluster policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public ClusterPolicyState build() {
            return $;
        }
    }

}
