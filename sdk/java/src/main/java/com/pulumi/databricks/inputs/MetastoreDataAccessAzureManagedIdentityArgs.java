// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MetastoreDataAccessAzureManagedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreDataAccessAzureManagedIdentityArgs Empty = new MetastoreDataAccessAzureManagedIdentityArgs();

    /**
     * The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
     * 
     */
    @Import(name="accessConnectorId", required=true)
    private Output<String> accessConnectorId;

    /**
     * @return The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
     * 
     */
    public Output<String> accessConnectorId() {
        return this.accessConnectorId;
    }

    private MetastoreDataAccessAzureManagedIdentityArgs() {}

    private MetastoreDataAccessAzureManagedIdentityArgs(MetastoreDataAccessAzureManagedIdentityArgs $) {
        this.accessConnectorId = $.accessConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreDataAccessAzureManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreDataAccessAzureManagedIdentityArgs $;

        public Builder() {
            $ = new MetastoreDataAccessAzureManagedIdentityArgs();
        }

        public Builder(MetastoreDataAccessAzureManagedIdentityArgs defaults) {
            $ = new MetastoreDataAccessAzureManagedIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessConnectorId The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
         * 
         * @return builder
         * 
         */
        public Builder accessConnectorId(Output<String> accessConnectorId) {
            $.accessConnectorId = accessConnectorId;
            return this;
        }

        /**
         * @param accessConnectorId The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
         * 
         * @return builder
         * 
         */
        public Builder accessConnectorId(String accessConnectorId) {
            return accessConnectorId(Output.of(accessConnectorId));
        }

        public MetastoreDataAccessAzureManagedIdentityArgs build() {
            $.accessConnectorId = Objects.requireNonNull($.accessConnectorId, "expected parameter 'accessConnectorId' to be non-null");
            return $;
        }
    }

}