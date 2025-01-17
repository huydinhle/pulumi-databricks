// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableColumn {
    /**
     * @return User-supplied free-form text.
     * 
     */
    private final @Nullable String comment;
    /**
     * @return User-visible name of column
     * 
     */
    private final String name;
    /**
     * @return Whether field is nullable (Default: `true`)
     * 
     */
    private final @Nullable Boolean nullable;
    /**
     * @return Partition ID
     * 
     */
    private final @Nullable Integer partitionIndex;
    /**
     * @return Ordinal position of column, starting at 0.
     * 
     */
    private final Integer position;
    /**
     * @return Format of `INTERVAL` columns
     * 
     */
    private final @Nullable String typeIntervalType;
    /**
     * @return Column type spec (with metadata) as JSON string
     * 
     */
    private final @Nullable String typeJson;
    /**
     * @return Name of (outer) type
     * 
     */
    private final String typeName;
    /**
     * @return Digits of precision; applies to `DECIMAL` columns
     * 
     */
    private final @Nullable Integer typePrecision;
    /**
     * @return Digits to right of decimal; applies to `DECIMAL` columns
     * 
     */
    private final @Nullable Integer typeScale;
    /**
     * @return Column type spec (with metadata) as SQL text
     * 
     */
    private final String typeText;

    @CustomType.Constructor
    private TableColumn(
        @CustomType.Parameter("comment") @Nullable String comment,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nullable") @Nullable Boolean nullable,
        @CustomType.Parameter("partitionIndex") @Nullable Integer partitionIndex,
        @CustomType.Parameter("position") Integer position,
        @CustomType.Parameter("typeIntervalType") @Nullable String typeIntervalType,
        @CustomType.Parameter("typeJson") @Nullable String typeJson,
        @CustomType.Parameter("typeName") String typeName,
        @CustomType.Parameter("typePrecision") @Nullable Integer typePrecision,
        @CustomType.Parameter("typeScale") @Nullable Integer typeScale,
        @CustomType.Parameter("typeText") String typeText) {
        this.comment = comment;
        this.name = name;
        this.nullable = nullable;
        this.partitionIndex = partitionIndex;
        this.position = position;
        this.typeIntervalType = typeIntervalType;
        this.typeJson = typeJson;
        this.typeName = typeName;
        this.typePrecision = typePrecision;
        this.typeScale = typeScale;
        this.typeText = typeText;
    }

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return User-visible name of column
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Whether field is nullable (Default: `true`)
     * 
     */
    public Optional<Boolean> nullable() {
        return Optional.ofNullable(this.nullable);
    }
    /**
     * @return Partition ID
     * 
     */
    public Optional<Integer> partitionIndex() {
        return Optional.ofNullable(this.partitionIndex);
    }
    /**
     * @return Ordinal position of column, starting at 0.
     * 
     */
    public Integer position() {
        return this.position;
    }
    /**
     * @return Format of `INTERVAL` columns
     * 
     */
    public Optional<String> typeIntervalType() {
        return Optional.ofNullable(this.typeIntervalType);
    }
    /**
     * @return Column type spec (with metadata) as JSON string
     * 
     */
    public Optional<String> typeJson() {
        return Optional.ofNullable(this.typeJson);
    }
    /**
     * @return Name of (outer) type
     * 
     */
    public String typeName() {
        return this.typeName;
    }
    /**
     * @return Digits of precision; applies to `DECIMAL` columns
     * 
     */
    public Optional<Integer> typePrecision() {
        return Optional.ofNullable(this.typePrecision);
    }
    /**
     * @return Digits to right of decimal; applies to `DECIMAL` columns
     * 
     */
    public Optional<Integer> typeScale() {
        return Optional.ofNullable(this.typeScale);
    }
    /**
     * @return Column type spec (with metadata) as SQL text
     * 
     */
    public String typeText() {
        return this.typeText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private String name;
        private @Nullable Boolean nullable;
        private @Nullable Integer partitionIndex;
        private Integer position;
        private @Nullable String typeIntervalType;
        private @Nullable String typeJson;
        private String typeName;
        private @Nullable Integer typePrecision;
        private @Nullable Integer typeScale;
        private String typeText;

        public Builder() {
    	      // Empty
        }

        public Builder(TableColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.nullable = defaults.nullable;
    	      this.partitionIndex = defaults.partitionIndex;
    	      this.position = defaults.position;
    	      this.typeIntervalType = defaults.typeIntervalType;
    	      this.typeJson = defaults.typeJson;
    	      this.typeName = defaults.typeName;
    	      this.typePrecision = defaults.typePrecision;
    	      this.typeScale = defaults.typeScale;
    	      this.typeText = defaults.typeText;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nullable(@Nullable Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Builder partitionIndex(@Nullable Integer partitionIndex) {
            this.partitionIndex = partitionIndex;
            return this;
        }
        public Builder position(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public Builder typeIntervalType(@Nullable String typeIntervalType) {
            this.typeIntervalType = typeIntervalType;
            return this;
        }
        public Builder typeJson(@Nullable String typeJson) {
            this.typeJson = typeJson;
            return this;
        }
        public Builder typeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }
        public Builder typePrecision(@Nullable Integer typePrecision) {
            this.typePrecision = typePrecision;
            return this;
        }
        public Builder typeScale(@Nullable Integer typeScale) {
            this.typeScale = typeScale;
            return this;
        }
        public Builder typeText(String typeText) {
            this.typeText = Objects.requireNonNull(typeText);
            return this;
        }        public TableColumn build() {
            return new TableColumn(comment, name, nullable, partitionIndex, position, typeIntervalType, typeJson, typeName, typePrecision, typeScale, typeText);
        }
    }
}
