// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class JobJobClusterNewClusterDockerImageBasicAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobClusterNewClusterDockerImageBasicAuthArgs Empty = new JobJobClusterNewClusterDockerImageBasicAuthArgs();

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private JobJobClusterNewClusterDockerImageBasicAuthArgs() {}

    private JobJobClusterNewClusterDockerImageBasicAuthArgs(JobJobClusterNewClusterDockerImageBasicAuthArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobClusterNewClusterDockerImageBasicAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobClusterNewClusterDockerImageBasicAuthArgs $;

        public Builder() {
            $ = new JobJobClusterNewClusterDockerImageBasicAuthArgs();
        }

        public Builder(JobJobClusterNewClusterDockerImageBasicAuthArgs defaults) {
            $ = new JobJobClusterNewClusterDockerImageBasicAuthArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public JobJobClusterNewClusterDockerImageBasicAuthArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
