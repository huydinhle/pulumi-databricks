// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MetastoreDataAccessAwsIamRoleArgs;
import com.pulumi.databricks.inputs.MetastoreDataAccessAzureManagedIdentityArgs;
import com.pulumi.databricks.inputs.MetastoreDataAccessAzureServicePrincipalArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreDataAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreDataAccessArgs Empty = new MetastoreDataAccessArgs();

    @Import(name="awsIamRole")
    private @Nullable Output<MetastoreDataAccessAwsIamRoleArgs> awsIamRole;

    public Optional<Output<MetastoreDataAccessAwsIamRoleArgs>> awsIamRole() {
        return Optional.ofNullable(this.awsIamRole);
    }

    @Import(name="azureManagedIdentity")
    private @Nullable Output<MetastoreDataAccessAzureManagedIdentityArgs> azureManagedIdentity;

    public Optional<Output<MetastoreDataAccessAzureManagedIdentityArgs>> azureManagedIdentity() {
        return Optional.ofNullable(this.azureManagedIdentity);
    }

    @Import(name="azureServicePrincipal")
    private @Nullable Output<MetastoreDataAccessAzureServicePrincipalArgs> azureServicePrincipal;

    public Optional<Output<MetastoreDataAccessAzureServicePrincipalArgs>> azureServicePrincipal() {
        return Optional.ofNullable(this.azureServicePrincipal);
    }

    @Import(name="configurationType")
    private @Nullable Output<String> configurationType;

    public Optional<Output<String>> configurationType() {
        return Optional.ofNullable(this.configurationType);
    }

    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * Unique identifier of the parent Metastore
     * 
     */
    @Import(name="metastoreId", required=true)
    private Output<String> metastoreId;

    /**
     * @return Unique identifier of the parent Metastore
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }

    /**
     * Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private MetastoreDataAccessArgs() {}

    private MetastoreDataAccessArgs(MetastoreDataAccessArgs $) {
        this.awsIamRole = $.awsIamRole;
        this.azureManagedIdentity = $.azureManagedIdentity;
        this.azureServicePrincipal = $.azureServicePrincipal;
        this.configurationType = $.configurationType;
        this.isDefault = $.isDefault;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreDataAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreDataAccessArgs $;

        public Builder() {
            $ = new MetastoreDataAccessArgs();
        }

        public Builder(MetastoreDataAccessArgs defaults) {
            $ = new MetastoreDataAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsIamRole(@Nullable Output<MetastoreDataAccessAwsIamRoleArgs> awsIamRole) {
            $.awsIamRole = awsIamRole;
            return this;
        }

        public Builder awsIamRole(MetastoreDataAccessAwsIamRoleArgs awsIamRole) {
            return awsIamRole(Output.of(awsIamRole));
        }

        public Builder azureManagedIdentity(@Nullable Output<MetastoreDataAccessAzureManagedIdentityArgs> azureManagedIdentity) {
            $.azureManagedIdentity = azureManagedIdentity;
            return this;
        }

        public Builder azureManagedIdentity(MetastoreDataAccessAzureManagedIdentityArgs azureManagedIdentity) {
            return azureManagedIdentity(Output.of(azureManagedIdentity));
        }

        public Builder azureServicePrincipal(@Nullable Output<MetastoreDataAccessAzureServicePrincipalArgs> azureServicePrincipal) {
            $.azureServicePrincipal = azureServicePrincipal;
            return this;
        }

        public Builder azureServicePrincipal(MetastoreDataAccessAzureServicePrincipalArgs azureServicePrincipal) {
            return azureServicePrincipal(Output.of(azureServicePrincipal));
        }

        public Builder configurationType(@Nullable Output<String> configurationType) {
            $.configurationType = configurationType;
            return this;
        }

        public Builder configurationType(String configurationType) {
            return configurationType(Output.of(configurationType));
        }

        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public MetastoreDataAccessArgs build() {
            $.metastoreId = Objects.requireNonNull($.metastoreId, "expected parameter 'metastoreId' to be non-null");
            return $;
        }
    }

}
