// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterClusterInfoInitScriptDbfs {
    private final String destination;

    @CustomType.Constructor
    private GetClusterClusterInfoInitScriptDbfs(@CustomType.Parameter("destination") String destination) {
        this.destination = destination;
    }

    public String destination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfoInitScriptDbfs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterInfoInitScriptDbfs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }        public GetClusterClusterInfoInitScriptDbfs build() {
            return new GetClusterClusterInfoInitScriptDbfs(destination);
        }
    }
}
