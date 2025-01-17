// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDbfsFileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbfsFileArgs Empty = new GetDbfsFileArgs();

    /**
     * Do lot load content for files smaller than this in bytes
     * 
     */
    @Import(name="limitFileSize", required=true)
    private Output<Boolean> limitFileSize;

    /**
     * @return Do lot load content for files smaller than this in bytes
     * 
     */
    public Output<Boolean> limitFileSize() {
        return this.limitFileSize;
    }

    /**
     * Path on DBFS for the file to get content of
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path on DBFS for the file to get content of
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private GetDbfsFileArgs() {}

    private GetDbfsFileArgs(GetDbfsFileArgs $) {
        this.limitFileSize = $.limitFileSize;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbfsFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbfsFileArgs $;

        public Builder() {
            $ = new GetDbfsFileArgs();
        }

        public Builder(GetDbfsFileArgs defaults) {
            $ = new GetDbfsFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitFileSize Do lot load content for files smaller than this in bytes
         * 
         * @return builder
         * 
         */
        public Builder limitFileSize(Output<Boolean> limitFileSize) {
            $.limitFileSize = limitFileSize;
            return this;
        }

        /**
         * @param limitFileSize Do lot load content for files smaller than this in bytes
         * 
         * @return builder
         * 
         */
        public Builder limitFileSize(Boolean limitFileSize) {
            return limitFileSize(Output.of(limitFileSize));
        }

        /**
         * @param path Path on DBFS for the file to get content of
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path on DBFS for the file to get content of
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public GetDbfsFileArgs build() {
            $.limitFileSize = Objects.requireNonNull($.limitFileSize, "expected parameter 'limitFileSize' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
