// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobNewClusterInitScriptGcs {
    private final @Nullable String destination;

    @CustomType.Constructor
    private JobNewClusterInitScriptGcs(@CustomType.Parameter("destination") @Nullable String destination) {
        this.destination = destination;
    }

    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewClusterInitScriptGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;

        public Builder() {
    	      // Empty
        }

        public Builder(JobNewClusterInitScriptGcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }        public JobNewClusterInitScriptGcs build() {
            return new JobNewClusterInitScriptGcs(destination);
        }
    }
}
