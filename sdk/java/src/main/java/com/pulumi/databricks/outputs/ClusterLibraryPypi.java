// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLibraryPypi {
    private final String package_;
    private final @Nullable String repo;

    @CustomType.Constructor
    private ClusterLibraryPypi(
        @CustomType.Parameter("package") String package_,
        @CustomType.Parameter("repo") @Nullable String repo) {
        this.package_ = package_;
        this.repo = repo;
    }

    public String package_() {
        return this.package_;
    }
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLibraryPypi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String package_;
        private @Nullable String repo;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLibraryPypi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.package_ = defaults.package_;
    	      this.repo = defaults.repo;
        }

        public Builder package_(String package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        public Builder repo(@Nullable String repo) {
            this.repo = repo;
            return this;
        }        public ClusterLibraryPypi build() {
            return new ClusterLibraryPypi(package_, repo);
        }
    }
}
