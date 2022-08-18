// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsStorageConfigurationsState extends com.pulumi.resources.ResourceArgs {

    public static final MwsStorageConfigurationsState Empty = new MwsStorageConfigurationsState();

    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * name of AWS S3 bucket
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return name of AWS S3 bucket
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * (String) id of storage config to be used for `databricks_mws_workspace` resource.
     * 
     */
    @Import(name="storageConfigurationId")
    private @Nullable Output<String> storageConfigurationId;

    /**
     * @return (String) id of storage config to be used for `databricks_mws_workspace` resource.
     * 
     */
    public Optional<Output<String>> storageConfigurationId() {
        return Optional.ofNullable(this.storageConfigurationId);
    }

    /**
     * name under which this storage configuration is stored
     * 
     */
    @Import(name="storageConfigurationName")
    private @Nullable Output<String> storageConfigurationName;

    /**
     * @return name under which this storage configuration is stored
     * 
     */
    public Optional<Output<String>> storageConfigurationName() {
        return Optional.ofNullable(this.storageConfigurationName);
    }

    private MwsStorageConfigurationsState() {}

    private MwsStorageConfigurationsState(MwsStorageConfigurationsState $) {
        this.accountId = $.accountId;
        this.bucketName = $.bucketName;
        this.creationTime = $.creationTime;
        this.storageConfigurationId = $.storageConfigurationId;
        this.storageConfigurationName = $.storageConfigurationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsStorageConfigurationsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsStorageConfigurationsState $;

        public Builder() {
            $ = new MwsStorageConfigurationsState();
        }

        public Builder(MwsStorageConfigurationsState defaults) {
            $ = new MwsStorageConfigurationsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param bucketName name of AWS S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName name of AWS S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param storageConfigurationId (String) id of storage config to be used for `databricks_mws_workspace` resource.
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationId(@Nullable Output<String> storageConfigurationId) {
            $.storageConfigurationId = storageConfigurationId;
            return this;
        }

        /**
         * @param storageConfigurationId (String) id of storage config to be used for `databricks_mws_workspace` resource.
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationId(String storageConfigurationId) {
            return storageConfigurationId(Output.of(storageConfigurationId));
        }

        /**
         * @param storageConfigurationName name under which this storage configuration is stored
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationName(@Nullable Output<String> storageConfigurationName) {
            $.storageConfigurationName = storageConfigurationName;
            return this;
        }

        /**
         * @param storageConfigurationName name under which this storage configuration is stored
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationName(String storageConfigurationName) {
            return storageConfigurationName(Output.of(storageConfigurationName));
        }

        public MwsStorageConfigurationsState build() {
            return $;
        }
    }

}
