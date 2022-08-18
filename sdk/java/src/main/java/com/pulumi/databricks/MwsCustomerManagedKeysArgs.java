// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsCustomerManagedKeysAwsKeyInfoArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsCustomerManagedKeysArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsCustomerManagedKeysArgs Empty = new MwsCustomerManagedKeysArgs();

    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * This field is a block and is documented below.
     * 
     */
    @Import(name="awsKeyInfo", required=true)
    private Output<MwsCustomerManagedKeysAwsKeyInfoArgs> awsKeyInfo;

    /**
     * @return This field is a block and is documented below.
     * 
     */
    public Output<MwsCustomerManagedKeysAwsKeyInfoArgs> awsKeyInfo() {
        return this.awsKeyInfo;
    }

    /**
     * (Integer) Time in epoch milliseconds when the customer key was created.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    /**
     * @return (Integer) Time in epoch milliseconds when the customer key was created.
     * 
     */
    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * (String) ID of the encryption key configuration object.
     * 
     */
    @Import(name="customerManagedKeyId")
    private @Nullable Output<String> customerManagedKeyId;

    /**
     * @return (String) ID of the encryption key configuration object.
     * 
     */
    public Optional<Output<String>> customerManagedKeyId() {
        return Optional.ofNullable(this.customerManagedKeyId);
    }

    /**
     * *(since v0.3.4)* List of use cases for which this key will be used. *If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.* Possible values are:
     * 
     */
    @Import(name="useCases", required=true)
    private Output<List<String>> useCases;

    /**
     * @return *(since v0.3.4)* List of use cases for which this key will be used. *If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.* Possible values are:
     * 
     */
    public Output<List<String>> useCases() {
        return this.useCases;
    }

    private MwsCustomerManagedKeysArgs() {}

    private MwsCustomerManagedKeysArgs(MwsCustomerManagedKeysArgs $) {
        this.accountId = $.accountId;
        this.awsKeyInfo = $.awsKeyInfo;
        this.creationTime = $.creationTime;
        this.customerManagedKeyId = $.customerManagedKeyId;
        this.useCases = $.useCases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsCustomerManagedKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsCustomerManagedKeysArgs $;

        public Builder() {
            $ = new MwsCustomerManagedKeysArgs();
        }

        public Builder(MwsCustomerManagedKeysArgs defaults) {
            $ = new MwsCustomerManagedKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
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
         * @param awsKeyInfo This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder awsKeyInfo(Output<MwsCustomerManagedKeysAwsKeyInfoArgs> awsKeyInfo) {
            $.awsKeyInfo = awsKeyInfo;
            return this;
        }

        /**
         * @param awsKeyInfo This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder awsKeyInfo(MwsCustomerManagedKeysAwsKeyInfoArgs awsKeyInfo) {
            return awsKeyInfo(Output.of(awsKeyInfo));
        }

        /**
         * @param creationTime (Integer) Time in epoch milliseconds when the customer key was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime (Integer) Time in epoch milliseconds when the customer key was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param customerManagedKeyId (String) ID of the encryption key configuration object.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedKeyId(@Nullable Output<String> customerManagedKeyId) {
            $.customerManagedKeyId = customerManagedKeyId;
            return this;
        }

        /**
         * @param customerManagedKeyId (String) ID of the encryption key configuration object.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedKeyId(String customerManagedKeyId) {
            return customerManagedKeyId(Output.of(customerManagedKeyId));
        }

        /**
         * @param useCases *(since v0.3.4)* List of use cases for which this key will be used. *If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.* Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder useCases(Output<List<String>> useCases) {
            $.useCases = useCases;
            return this;
        }

        /**
         * @param useCases *(since v0.3.4)* List of use cases for which this key will be used. *If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.* Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder useCases(List<String> useCases) {
            return useCases(Output.of(useCases));
        }

        /**
         * @param useCases *(since v0.3.4)* List of use cases for which this key will be used. *If you&#39;ve used the resource before, please add `use_cases = [&#34;MANAGED_SERVICES&#34;]` to keep the previous behaviour.* Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder useCases(String... useCases) {
            return useCases(List.of(useCases));
        }

        public MwsCustomerManagedKeysArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.awsKeyInfo = Objects.requireNonNull($.awsKeyInfo, "expected parameter 'awsKeyInfo' to be non-null");
            $.useCases = Objects.requireNonNull($.useCases, "expected parameter 'useCases' to be non-null");
            return $;
        }
    }

}
