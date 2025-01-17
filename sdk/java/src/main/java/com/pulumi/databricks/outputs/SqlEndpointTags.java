// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlEndpointTagsCustomTag;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SqlEndpointTags {
    private final List<SqlEndpointTagsCustomTag> customTags;

    @CustomType.Constructor
    private SqlEndpointTags(@CustomType.Parameter("customTags") List<SqlEndpointTagsCustomTag> customTags) {
        this.customTags = customTags;
    }

    public List<SqlEndpointTagsCustomTag> customTags() {
        return this.customTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlEndpointTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SqlEndpointTagsCustomTag> customTags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlEndpointTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTags = defaults.customTags;
        }

        public Builder customTags(List<SqlEndpointTagsCustomTag> customTags) {
            this.customTags = Objects.requireNonNull(customTags);
            return this;
        }
        public Builder customTags(SqlEndpointTagsCustomTag... customTags) {
            return customTags(List.of(customTags));
        }        public SqlEndpointTags build() {
            return new SqlEndpointTags(customTags);
        }
    }
}
