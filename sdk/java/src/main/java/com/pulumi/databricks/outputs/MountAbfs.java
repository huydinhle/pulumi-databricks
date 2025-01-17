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
public final class MountAbfs {
    private final String clientId;
    private final String clientSecretKey;
    private final String clientSecretScope;
    private final @Nullable String containerName;
    private final @Nullable String directory;
    private final Boolean initializeFileSystem;
    private final @Nullable String storageAccountName;
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private MountAbfs(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecretKey") String clientSecretKey,
        @CustomType.Parameter("clientSecretScope") String clientSecretScope,
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("directory") @Nullable String directory,
        @CustomType.Parameter("initializeFileSystem") Boolean initializeFileSystem,
        @CustomType.Parameter("storageAccountName") @Nullable String storageAccountName,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.clientId = clientId;
        this.clientSecretKey = clientSecretKey;
        this.clientSecretScope = clientSecretScope;
        this.containerName = containerName;
        this.directory = directory;
        this.initializeFileSystem = initializeFileSystem;
        this.storageAccountName = storageAccountName;
        this.tenantId = tenantId;
    }

    public String clientId() {
        return this.clientId;
    }
    public String clientSecretKey() {
        return this.clientSecretKey;
    }
    public String clientSecretScope() {
        return this.clientSecretScope;
    }
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    public Optional<String> directory() {
        return Optional.ofNullable(this.directory);
    }
    public Boolean initializeFileSystem() {
        return this.initializeFileSystem;
    }
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountAbfs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String clientSecretKey;
        private String clientSecretScope;
        private @Nullable String containerName;
        private @Nullable String directory;
        private Boolean initializeFileSystem;
        private @Nullable String storageAccountName;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(MountAbfs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretKey = defaults.clientSecretKey;
    	      this.clientSecretScope = defaults.clientSecretScope;
    	      this.containerName = defaults.containerName;
    	      this.directory = defaults.directory;
    	      this.initializeFileSystem = defaults.initializeFileSystem;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecretKey(String clientSecretKey) {
            this.clientSecretKey = Objects.requireNonNull(clientSecretKey);
            return this;
        }
        public Builder clientSecretScope(String clientSecretScope) {
            this.clientSecretScope = Objects.requireNonNull(clientSecretScope);
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder directory(@Nullable String directory) {
            this.directory = directory;
            return this;
        }
        public Builder initializeFileSystem(Boolean initializeFileSystem) {
            this.initializeFileSystem = Objects.requireNonNull(initializeFileSystem);
            return this;
        }
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public MountAbfs build() {
            return new MountAbfs(clientId, clientSecretKey, clientSecretScope, containerName, directory, initializeFileSystem, storageAccountName, tenantId);
        }
    }
}
