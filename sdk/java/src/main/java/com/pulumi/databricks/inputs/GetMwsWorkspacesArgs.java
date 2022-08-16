// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMwsWorkspacesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMwsWorkspacesArgs Empty = new GetMwsWorkspacesArgs();

    /**
     * name-to-id map for all of the workspaces in the account
     * 
     */
    @Import(name="ids")
    private @Nullable Output<Map<String,Object>> ids;

    /**
     * @return name-to-id map for all of the workspaces in the account
     * 
     */
    public Optional<Output<Map<String,Object>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private GetMwsWorkspacesArgs() {}

    private GetMwsWorkspacesArgs(GetMwsWorkspacesArgs $) {
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMwsWorkspacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMwsWorkspacesArgs $;

        public Builder() {
            $ = new GetMwsWorkspacesArgs();
        }

        public Builder(GetMwsWorkspacesArgs defaults) {
            $ = new GetMwsWorkspacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids name-to-id map for all of the workspaces in the account
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<Map<String,Object>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids name-to-id map for all of the workspaces in the account
         * 
         * @return builder
         * 
         */
        public Builder ids(Map<String,Object> ids) {
            return ids(Output.of(ids));
        }

        public GetMwsWorkspacesArgs build() {
            return $;
        }
    }

}
