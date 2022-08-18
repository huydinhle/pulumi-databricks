// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SqlQueryParameterQueryMultipleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterQueryMultipleArgs Empty = new SqlQueryParameterQueryMultipleArgs();

    @Import(name="prefix", required=true)
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    @Import(name="separator", required=true)
    private Output<String> separator;

    public Output<String> separator() {
        return this.separator;
    }

    @Import(name="suffix", required=true)
    private Output<String> suffix;

    public Output<String> suffix() {
        return this.suffix;
    }

    private SqlQueryParameterQueryMultipleArgs() {}

    private SqlQueryParameterQueryMultipleArgs(SqlQueryParameterQueryMultipleArgs $) {
        this.prefix = $.prefix;
        this.separator = $.separator;
        this.suffix = $.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterQueryMultipleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterQueryMultipleArgs $;

        public Builder() {
            $ = new SqlQueryParameterQueryMultipleArgs();
        }

        public Builder(SqlQueryParameterQueryMultipleArgs defaults) {
            $ = new SqlQueryParameterQueryMultipleArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder separator(Output<String> separator) {
            $.separator = separator;
            return this;
        }

        public Builder separator(String separator) {
            return separator(Output.of(separator));
        }

        public Builder suffix(Output<String> suffix) {
            $.suffix = suffix;
            return this;
        }

        public Builder suffix(String suffix) {
            return suffix(Output.of(suffix));
        }

        public SqlQueryParameterQueryMultipleArgs build() {
            $.prefix = Objects.requireNonNull($.prefix, "expected parameter 'prefix' to be non-null");
            $.separator = Objects.requireNonNull($.separator, "expected parameter 'separator' to be non-null");
            $.suffix = Objects.requireNonNull($.suffix, "expected parameter 'suffix' to be non-null");
            return $;
        }
    }

}
