// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SecretScopeKeyvaultMetadataArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretScopeState extends com.pulumi.resources.ResourceArgs {

    public static final SecretScopeState Empty = new SecretScopeState();

    /**
     * Either `DATABRICKS` or `AZURE_KEYVAULT`
     * 
     */
    @Import(name="backendType")
    private @Nullable Output<String> backendType;

    /**
     * @return Either `DATABRICKS` or `AZURE_KEYVAULT`
     * 
     */
    public Optional<Output<String>> backendType() {
        return Optional.ofNullable(this.backendType);
    }

    /**
     * The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it&#39;s omitted, then the databricks.SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer&#39;s user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
     * 
     */
    @Import(name="initialManagePrincipal")
    private @Nullable Output<String> initialManagePrincipal;

    /**
     * @return The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it&#39;s omitted, then the databricks.SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer&#39;s user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
     * 
     */
    public Optional<Output<String>> initialManagePrincipal() {
        return Optional.ofNullable(this.initialManagePrincipal);
    }

    @Import(name="keyvaultMetadata")
    private @Nullable Output<SecretScopeKeyvaultMetadataArgs> keyvaultMetadata;

    public Optional<Output<SecretScopeKeyvaultMetadataArgs>> keyvaultMetadata() {
        return Optional.ofNullable(this.keyvaultMetadata);
    }

    /**
     * Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private SecretScopeState() {}

    private SecretScopeState(SecretScopeState $) {
        this.backendType = $.backendType;
        this.initialManagePrincipal = $.initialManagePrincipal;
        this.keyvaultMetadata = $.keyvaultMetadata;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretScopeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretScopeState $;

        public Builder() {
            $ = new SecretScopeState();
        }

        public Builder(SecretScopeState defaults) {
            $ = new SecretScopeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendType Either `DATABRICKS` or `AZURE_KEYVAULT`
         * 
         * @return builder
         * 
         */
        public Builder backendType(@Nullable Output<String> backendType) {
            $.backendType = backendType;
            return this;
        }

        /**
         * @param backendType Either `DATABRICKS` or `AZURE_KEYVAULT`
         * 
         * @return builder
         * 
         */
        public Builder backendType(String backendType) {
            return backendType(Output.of(backendType));
        }

        /**
         * @param initialManagePrincipal The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it&#39;s omitted, then the databricks.SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer&#39;s user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
         * 
         * @return builder
         * 
         */
        public Builder initialManagePrincipal(@Nullable Output<String> initialManagePrincipal) {
            $.initialManagePrincipal = initialManagePrincipal;
            return this;
        }

        /**
         * @param initialManagePrincipal The principal with the only possible value `users` that is initially granted `MANAGE` permission to the created scope.  If it&#39;s omitted, then the databricks.SecretAcl with `MANAGE` permission applied to the scope is assigned to the API request issuer&#39;s user identity (see [documentation](https://docs.databricks.com/dev-tools/api/latest/secrets.html#create-secret-scope)). This part of the state cannot be imported.
         * 
         * @return builder
         * 
         */
        public Builder initialManagePrincipal(String initialManagePrincipal) {
            return initialManagePrincipal(Output.of(initialManagePrincipal));
        }

        public Builder keyvaultMetadata(@Nullable Output<SecretScopeKeyvaultMetadataArgs> keyvaultMetadata) {
            $.keyvaultMetadata = keyvaultMetadata;
            return this;
        }

        public Builder keyvaultMetadata(SecretScopeKeyvaultMetadataArgs keyvaultMetadata) {
            return keyvaultMetadata(Output.of(keyvaultMetadata));
        }

        /**
         * @param name Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Scope name requested by the user. Must be unique within a workspace. Must consist of alphanumeric characters, dashes, underscores, and periods, and may not exceed 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SecretScopeState build() {
            return $;
        }
    }

}
