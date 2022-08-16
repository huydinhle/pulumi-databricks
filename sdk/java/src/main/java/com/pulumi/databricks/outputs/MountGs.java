// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MountGs {
    private final String bucketName;
    private final @Nullable String serviceAccount;

    @CustomType.Constructor
    private MountGs(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("serviceAccount") @Nullable String serviceAccount) {
        this.bucketName = bucketName;
        this.serviceAccount = serviceAccount;
    }

    public String bucketName() {
        return this.bucketName;
    }
    public Optional<String> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountGs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(MountGs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }        public MountGs build() {
            return new MountGs(bucketName, serviceAccount);
        }
    }
}