// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MwsWorkspacesToken {
    private final @Nullable String comment;
    private final @Nullable Integer lifetimeSeconds;
    private final @Nullable String tokenId;
    private final @Nullable String tokenValue;

    @CustomType.Constructor
    private MwsWorkspacesToken(
        @CustomType.Parameter("comment") @Nullable String comment,
        @CustomType.Parameter("lifetimeSeconds") @Nullable Integer lifetimeSeconds,
        @CustomType.Parameter("tokenId") @Nullable String tokenId,
        @CustomType.Parameter("tokenValue") @Nullable String tokenValue) {
        this.comment = comment;
        this.lifetimeSeconds = lifetimeSeconds;
        this.tokenId = tokenId;
        this.tokenValue = tokenValue;
    }

    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<Integer> lifetimeSeconds() {
        return Optional.ofNullable(this.lifetimeSeconds);
    }
    public Optional<String> tokenId() {
        return Optional.ofNullable(this.tokenId);
    }
    public Optional<String> tokenValue() {
        return Optional.ofNullable(this.tokenValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesToken defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private @Nullable Integer lifetimeSeconds;
        private @Nullable String tokenId;
        private @Nullable String tokenValue;

        public Builder() {
    	      // Empty
        }

        public Builder(MwsWorkspacesToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.lifetimeSeconds = defaults.lifetimeSeconds;
    	      this.tokenId = defaults.tokenId;
    	      this.tokenValue = defaults.tokenValue;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        public Builder lifetimeSeconds(@Nullable Integer lifetimeSeconds) {
            this.lifetimeSeconds = lifetimeSeconds;
            return this;
        }
        public Builder tokenId(@Nullable String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public Builder tokenValue(@Nullable String tokenValue) {
            this.tokenValue = tokenValue;
            return this;
        }        public MwsWorkspacesToken build() {
            return new MwsWorkspacesToken(comment, lifetimeSeconds, tokenId, tokenValue);
        }
    }
}
