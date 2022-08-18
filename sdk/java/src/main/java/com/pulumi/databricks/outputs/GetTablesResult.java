// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTablesResult {
    private final String catalogName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return set of databricks.Table full names: *`catalog`.`schema`.`table`*
     * 
     */
    private final List<String> ids;
    private final String schemaName;

    @CustomType.Constructor
    private GetTablesResult(
        @CustomType.Parameter("catalogName") String catalogName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("schemaName") String schemaName) {
        this.catalogName = catalogName;
        this.id = id;
        this.ids = ids;
        this.schemaName = schemaName;
    }

    public String catalogName() {
        return this.catalogName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return set of databricks.Table full names: *`catalog`.`schema`.`table`*
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public String schemaName() {
        return this.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTablesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogName;
        private String id;
        private List<String> ids;
        private String schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTablesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogName = defaults.catalogName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder catalogName(String catalogName) {
            this.catalogName = Objects.requireNonNull(catalogName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }        public GetTablesResult build() {
            return new GetTablesResult(catalogName, id, ids, schemaName);
        }
    }
}
