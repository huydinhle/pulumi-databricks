// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterInitScriptS3 {
    private final @Nullable String cannedAcl;
    private final String destination;
    private final @Nullable Boolean enableEncryption;
    private final @Nullable String encryptionType;
    private final @Nullable String endpoint;
    private final @Nullable String kmsKey;
    private final @Nullable String region;

    @CustomType.Constructor
    private ClusterInitScriptS3(
        @CustomType.Parameter("cannedAcl") @Nullable String cannedAcl,
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("enableEncryption") @Nullable Boolean enableEncryption,
        @CustomType.Parameter("encryptionType") @Nullable String encryptionType,
        @CustomType.Parameter("endpoint") @Nullable String endpoint,
        @CustomType.Parameter("kmsKey") @Nullable String kmsKey,
        @CustomType.Parameter("region") @Nullable String region) {
        this.cannedAcl = cannedAcl;
        this.destination = destination;
        this.enableEncryption = enableEncryption;
        this.encryptionType = encryptionType;
        this.endpoint = endpoint;
        this.kmsKey = kmsKey;
        this.region = region;
    }

    public Optional<String> cannedAcl() {
        return Optional.ofNullable(this.cannedAcl);
    }
    public String destination() {
        return this.destination;
    }
    public Optional<Boolean> enableEncryption() {
        return Optional.ofNullable(this.enableEncryption);
    }
    public Optional<String> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInitScriptS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cannedAcl;
        private String destination;
        private @Nullable Boolean enableEncryption;
        private @Nullable String encryptionType;
        private @Nullable String endpoint;
        private @Nullable String kmsKey;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterInitScriptS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cannedAcl = defaults.cannedAcl;
    	      this.destination = defaults.destination;
    	      this.enableEncryption = defaults.enableEncryption;
    	      this.encryptionType = defaults.encryptionType;
    	      this.endpoint = defaults.endpoint;
    	      this.kmsKey = defaults.kmsKey;
    	      this.region = defaults.region;
        }

        public Builder cannedAcl(@Nullable String cannedAcl) {
            this.cannedAcl = cannedAcl;
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder enableEncryption(@Nullable Boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
            return this;
        }
        public Builder encryptionType(@Nullable String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }        public ClusterInitScriptS3 build() {
            return new ClusterInitScriptS3(cannedAcl, destination, enableEncryption, encryptionType, endpoint, kmsKey, region);
        }
    }
}
