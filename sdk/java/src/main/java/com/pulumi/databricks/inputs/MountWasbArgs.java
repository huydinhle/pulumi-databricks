// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MountWasbArgs extends com.pulumi.resources.ResourceArgs {

    public static final MountWasbArgs Empty = new MountWasbArgs();

    @Import(name="authType", required=true)
    private Output<String> authType;

    public Output<String> authType() {
        return this.authType;
    }

    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    @Import(name="directory")
    private @Nullable Output<String> directory;

    public Optional<Output<String>> directory() {
        return Optional.ofNullable(this.directory);
    }

    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    @Import(name="tokenSecretKey", required=true)
    private Output<String> tokenSecretKey;

    public Output<String> tokenSecretKey() {
        return this.tokenSecretKey;
    }

    @Import(name="tokenSecretScope", required=true)
    private Output<String> tokenSecretScope;

    public Output<String> tokenSecretScope() {
        return this.tokenSecretScope;
    }

    private MountWasbArgs() {}

    private MountWasbArgs(MountWasbArgs $) {
        this.authType = $.authType;
        this.containerName = $.containerName;
        this.directory = $.directory;
        this.storageAccountName = $.storageAccountName;
        this.tokenSecretKey = $.tokenSecretKey;
        this.tokenSecretScope = $.tokenSecretScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MountWasbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MountWasbArgs $;

        public Builder() {
            $ = new MountWasbArgs();
        }

        public Builder(MountWasbArgs defaults) {
            $ = new MountWasbArgs(Objects.requireNonNull(defaults));
        }

        public Builder authType(Output<String> authType) {
            $.authType = authType;
            return this;
        }

        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder directory(@Nullable Output<String> directory) {
            $.directory = directory;
            return this;
        }

        public Builder directory(String directory) {
            return directory(Output.of(directory));
        }

        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public Builder tokenSecretKey(Output<String> tokenSecretKey) {
            $.tokenSecretKey = tokenSecretKey;
            return this;
        }

        public Builder tokenSecretKey(String tokenSecretKey) {
            return tokenSecretKey(Output.of(tokenSecretKey));
        }

        public Builder tokenSecretScope(Output<String> tokenSecretScope) {
            $.tokenSecretScope = tokenSecretScope;
            return this;
        }

        public Builder tokenSecretScope(String tokenSecretScope) {
            return tokenSecretScope(Output.of(tokenSecretScope));
        }

        public MountWasbArgs build() {
            $.authType = Objects.requireNonNull($.authType, "expected parameter 'authType' to be non-null");
            $.tokenSecretKey = Objects.requireNonNull($.tokenSecretKey, "expected parameter 'tokenSecretKey' to be non-null");
            $.tokenSecretScope = Objects.requireNonNull($.tokenSecretScope, "expected parameter 'tokenSecretScope' to be non-null");
            return $;
        }
    }

}