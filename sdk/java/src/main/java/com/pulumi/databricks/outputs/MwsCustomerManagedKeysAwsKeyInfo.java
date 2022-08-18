// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MwsCustomerManagedKeysAwsKeyInfo {
    /**
     * @return The AWS KMS key alias.
     * 
     */
    private final String keyAlias;
    /**
     * @return The AWS KMS key&#39;s Amazon Resource Name (ARN).
     * 
     */
    private final String keyArn;
    /**
     * @return (Computed) The AWS region in which KMS key is deployed to. This is not required.
     * 
     */
    private final @Nullable String keyRegion;

    @CustomType.Constructor
    private MwsCustomerManagedKeysAwsKeyInfo(
        @CustomType.Parameter("keyAlias") String keyAlias,
        @CustomType.Parameter("keyArn") String keyArn,
        @CustomType.Parameter("keyRegion") @Nullable String keyRegion) {
        this.keyAlias = keyAlias;
        this.keyArn = keyArn;
        this.keyRegion = keyRegion;
    }

    /**
     * @return The AWS KMS key alias.
     * 
     */
    public String keyAlias() {
        return this.keyAlias;
    }
    /**
     * @return The AWS KMS key&#39;s Amazon Resource Name (ARN).
     * 
     */
    public String keyArn() {
        return this.keyArn;
    }
    /**
     * @return (Computed) The AWS region in which KMS key is deployed to. This is not required.
     * 
     */
    public Optional<String> keyRegion() {
        return Optional.ofNullable(this.keyRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsCustomerManagedKeysAwsKeyInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyAlias;
        private String keyArn;
        private @Nullable String keyRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(MwsCustomerManagedKeysAwsKeyInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyAlias = defaults.keyAlias;
    	      this.keyArn = defaults.keyArn;
    	      this.keyRegion = defaults.keyRegion;
        }

        public Builder keyAlias(String keyAlias) {
            this.keyAlias = Objects.requireNonNull(keyAlias);
            return this;
        }
        public Builder keyArn(String keyArn) {
            this.keyArn = Objects.requireNonNull(keyArn);
            return this;
        }
        public Builder keyRegion(@Nullable String keyRegion) {
            this.keyRegion = keyRegion;
            return this;
        }        public MwsCustomerManagedKeysAwsKeyInfo build() {
            return new MwsCustomerManagedKeysAwsKeyInfo(keyAlias, keyArn, keyRegion);
        }
    }
}
