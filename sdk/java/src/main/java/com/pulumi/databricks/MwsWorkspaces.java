// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsWorkspacesArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsWorkspacesState;
import com.pulumi.databricks.outputs.MwsWorkspacesCloudResourceBucket;
import com.pulumi.databricks.outputs.MwsWorkspacesExternalCustomerInfo;
import com.pulumi.databricks.outputs.MwsWorkspacesNetwork;
import com.pulumi.databricks.outputs.MwsWorkspacesToken;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsWorkspaces:MwsWorkspaces")
public class MwsWorkspaces extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * AWS region of VPC
     * 
     */
    @Export(name="awsRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsRegion;

    /**
     * @return AWS region of VPC
     * 
     */
    public Output<Optional<String>> awsRegion() {
        return Codegen.optional(this.awsRegion);
    }
    @Export(name="cloud", type=String.class, parameters={})
    private Output<String> cloud;

    public Output<String> cloud() {
        return this.cloud;
    }
    @Export(name="cloudResourceBucket", type=MwsWorkspacesCloudResourceBucket.class, parameters={})
    private Output</* @Nullable */ MwsWorkspacesCloudResourceBucket> cloudResourceBucket;

    public Output<Optional<MwsWorkspacesCloudResourceBucket>> cloudResourceBucket() {
        return Codegen.optional(this.cloudResourceBucket);
    }
    /**
     * (Integer) time when workspace was created
     * 
     */
    @Export(name="creationTime", type=Integer.class, parameters={})
    private Output<Integer> creationTime;

    /**
     * @return (Integer) time when workspace was created
     * 
     */
    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    @Export(name="credentialsId", type=String.class, parameters={})
    private Output</* @Nullable */ String> credentialsId;

    public Output<Optional<String>> credentialsId() {
        return Codegen.optional(this.credentialsId);
    }
    /**
     * @deprecated
     * Use managed_services_customer_managed_key_id instead
     * 
     */
    @Deprecated /* Use managed_services_customer_managed_key_id instead */
    @Export(name="customerManagedKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerManagedKeyId;

    public Output<Optional<String>> customerManagedKeyId() {
        return Codegen.optional(this.customerManagedKeyId);
    }
    /**
     * part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    @Export(name="deploymentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentName;

    /**
     * @return part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    public Output<Optional<String>> deploymentName() {
        return Codegen.optional(this.deploymentName);
    }
    @Export(name="externalCustomerInfo", type=MwsWorkspacesExternalCustomerInfo.class, parameters={})
    private Output</* @Nullable */ MwsWorkspacesExternalCustomerInfo> externalCustomerInfo;

    public Output<Optional<MwsWorkspacesExternalCustomerInfo>> externalCustomerInfo() {
        return Codegen.optional(this.externalCustomerInfo);
    }
    @Export(name="isNoPublicIpEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isNoPublicIpEnabled;

    public Output<Optional<Boolean>> isNoPublicIpEnabled() {
        return Codegen.optional(this.isNoPublicIpEnabled);
    }
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    @Export(name="managedServicesCustomerManagedKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedServicesCustomerManagedKeyId;

    /**
     * @return `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    public Output<Optional<String>> managedServicesCustomerManagedKeyId() {
        return Codegen.optional(this.managedServicesCustomerManagedKeyId);
    }
    @Export(name="network", type=MwsWorkspacesNetwork.class, parameters={})
    private Output</* @Nullable */ MwsWorkspacesNetwork> network;

    public Output<Optional<MwsWorkspacesNetwork>> network() {
        return Codegen.optional(this.network);
    }
    @Export(name="networkId", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkId;

    public Output<Optional<String>> networkId() {
        return Codegen.optional(this.networkId);
    }
    @Export(name="pricingTier", type=String.class, parameters={})
    private Output<String> pricingTier;

    public Output<String> pricingTier() {
        return this.pricingTier;
    }
    /**
     * Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account
     * 
     */
    @Export(name="privateAccessSettingsId", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateAccessSettingsId;

    /**
     * @return Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account
     * 
     */
    public Output<Optional<String>> privateAccessSettingsId() {
        return Codegen.optional(this.privateAccessSettingsId);
    }
    /**
     * `storage_configuration_id` from storage configuration
     * 
     */
    @Export(name="storageConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageConfigurationId;

    /**
     * @return `storage_configuration_id` from storage configuration
     * 
     */
    public Output<Optional<String>> storageConfigurationId() {
        return Codegen.optional(this.storageConfigurationId);
    }
    @Export(name="storageCustomerManagedKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageCustomerManagedKeyId;

    public Output<Optional<String>> storageCustomerManagedKeyId() {
        return Codegen.optional(this.storageCustomerManagedKeyId);
    }
    @Export(name="token", type=MwsWorkspacesToken.class, parameters={})
    private Output</* @Nullable */ MwsWorkspacesToken> token;

    public Output<Optional<MwsWorkspacesToken>> token() {
        return Codegen.optional(this.token);
    }
    @Export(name="workspaceId", type=Integer.class, parameters={})
    private Output<Integer> workspaceId;

    public Output<Integer> workspaceId() {
        return this.workspaceId;
    }
    /**
     * name of the workspace, will appear on UI
     * 
     */
    @Export(name="workspaceName", type=String.class, parameters={})
    private Output<String> workspaceName;

    /**
     * @return name of the workspace, will appear on UI
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }
    /**
     * (String) workspace status
     * 
     */
    @Export(name="workspaceStatus", type=String.class, parameters={})
    private Output<String> workspaceStatus;

    /**
     * @return (String) workspace status
     * 
     */
    public Output<String> workspaceStatus() {
        return this.workspaceStatus;
    }
    /**
     * (String) updates on workspace status
     * 
     */
    @Export(name="workspaceStatusMessage", type=String.class, parameters={})
    private Output<String> workspaceStatusMessage;

    /**
     * @return (String) updates on workspace status
     * 
     */
    public Output<String> workspaceStatusMessage() {
        return this.workspaceStatusMessage;
    }
    /**
     * (String) URL of the workspace
     * 
     */
    @Export(name="workspaceUrl", type=String.class, parameters={})
    private Output<String> workspaceUrl;

    /**
     * @return (String) URL of the workspace
     * 
     */
    public Output<String> workspaceUrl() {
        return this.workspaceUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsWorkspaces(String name) {
        this(name, MwsWorkspacesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsWorkspaces(String name, MwsWorkspacesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsWorkspaces(String name, MwsWorkspacesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsWorkspaces:MwsWorkspaces", name, args == null ? MwsWorkspacesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsWorkspaces(String name, Output<String> id, @Nullable MwsWorkspacesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsWorkspaces:MwsWorkspaces", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MwsWorkspaces get(String name, Output<String> id, @Nullable MwsWorkspacesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsWorkspaces(name, id, state, options);
    }
}