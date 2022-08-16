// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoClusterLogConfS3 extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoClusterLogConfS3 Empty = new GetClusterClusterInfoClusterLogConfS3();

    @Import(name="cannedAcl")
    private @Nullable String cannedAcl;

    public Optional<String> cannedAcl() {
        return Optional.ofNullable(this.cannedAcl);
    }

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    @Import(name="enableEncryption")
    private @Nullable Boolean enableEncryption;

    public Optional<Boolean> enableEncryption() {
        return Optional.ofNullable(this.enableEncryption);
    }

    @Import(name="encryptionType")
    private @Nullable String encryptionType;

    public Optional<String> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    @Import(name="endpoint")
    private @Nullable String endpoint;

    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    @Import(name="kmsKey")
    private @Nullable String kmsKey;

    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetClusterClusterInfoClusterLogConfS3() {}

    private GetClusterClusterInfoClusterLogConfS3(GetClusterClusterInfoClusterLogConfS3 $) {
        this.cannedAcl = $.cannedAcl;
        this.destination = $.destination;
        this.enableEncryption = $.enableEncryption;
        this.encryptionType = $.encryptionType;
        this.endpoint = $.endpoint;
        this.kmsKey = $.kmsKey;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoClusterLogConfS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoClusterLogConfS3 $;

        public Builder() {
            $ = new GetClusterClusterInfoClusterLogConfS3();
        }

        public Builder(GetClusterClusterInfoClusterLogConfS3 defaults) {
            $ = new GetClusterClusterInfoClusterLogConfS3(Objects.requireNonNull(defaults));
        }

        public Builder cannedAcl(@Nullable String cannedAcl) {
            $.cannedAcl = cannedAcl;
            return this;
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public Builder enableEncryption(@Nullable Boolean enableEncryption) {
            $.enableEncryption = enableEncryption;
            return this;
        }

        public Builder encryptionType(@Nullable String encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetClusterClusterInfoClusterLogConfS3 build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            return $;
        }
    }

}
